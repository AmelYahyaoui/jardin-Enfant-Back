package com.esprit.jardinenfant.Services;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

public interface PostAttachementsService {
//    PostAttachement save(PostAttachement pa);

    public void init();

    public void save(MultipartFile file);

    Resource load(String filename);

//    void save(File file) throws IOException;

//    public Resource load(String filename);
//
//    public void deleteAll();
//
//    public Stream<Path> loadAll();
}
