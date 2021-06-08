package com.esprit.jardinenfant.Controllers;

import com.esprit.jardinenfant.Entities.PostAttachement;
import com.esprit.jardinenfant.Services.PostAttachementsService;
import org.apache.coyote.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Objects;

@RestController
//@RequestMapping("/posts")
//@CrossOrigin(origins = "*", maxAge = 3600)
@CrossOrigin(origins = "*")
public class PostAttachementController {

    private final Path upload_directory = Paths.get("uploads");

    @Autowired
    PostAttachementsService postAttachementsService;

    @RequestMapping(value="/uploadAttachement", method = RequestMethod.POST)
    public String saveAttach(@RequestParam("file") MultipartFile file) throws SQLIntegrityConstraintViolationException {
        try {
            postAttachementsService.init();
            postAttachementsService.save(file);
            return "file uploaded successfully: " + file.getOriginalFilename() + "!";
        } catch (Exception e) {
            return "Could not upload the file: " + file.getOriginalFilename() + "! " + e ;
        }
    }

    @RequestMapping(value="/loadAttachement/{filename}", method = RequestMethod.GET)
    public byte[] getFile(@PathVariable("filename") String filename) throws Exception {
        return Files.readAllBytes(Paths.get(upload_directory.toAbsolutePath()+filename));
    }



}
