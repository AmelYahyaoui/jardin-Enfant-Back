package com.esprit.jardinenfant.Services;

import com.esprit.jardinenfant.Entities.Post;
import com.esprit.jardinenfant.Entities.PostHeader;

import java.util.List;

public interface PostService {
    Post save(Post p);
    Post update(Post p);
    void delete(Post p);
    void deleteById(Integer id);
    Post findById(Integer id);
    List<Post> findAll();
}
