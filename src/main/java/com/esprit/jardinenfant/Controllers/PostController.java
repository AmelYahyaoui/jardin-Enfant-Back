package com.esprit.jardinenfant.Controllers;


import com.esprit.jardinenfant.Entities.Post;
import com.esprit.jardinenfant.Entities.PostAttachement;
import com.esprit.jardinenfant.Services.PostAttachementsService;
import com.esprit.jardinenfant.Services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

@RestController
@RequestMapping("/posts")
//@CrossOrigin(origins = "*", maxAge = 3600)

public class PostController {

    @Autowired
    private PostService postService;

    @CrossOrigin(origins = "*")
    @RequestMapping(value="/listPosts", method = RequestMethod.GET)
    public List<Post> postsList() throws SQLIntegrityConstraintViolationException {
        System.out.println("get posts");
        return postService.findAll();
    }

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Post getOnePost(@PathVariable(value = "id") int id){
        return postService.findById(id);
    }

    @CrossOrigin(origins = "*")
    @RequestMapping(value="/addPost", method = RequestMethod.POST)
    public Post savePost(@RequestBody Post post) throws SQLIntegrityConstraintViolationException {
        System.out.println(post);
        return postService.save(post);
    }


    @CrossOrigin(origins = "*")
    @RequestMapping(value="/updatePost", method = RequestMethod.PUT)
    public Post editPost(@RequestBody Post newPost) {
        return postService.update(newPost);
    }

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void deleteById(@PathVariable(value = "id") int id){
        this.postService.deleteById(id);
    }



}
