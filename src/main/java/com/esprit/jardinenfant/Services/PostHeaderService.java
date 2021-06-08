package com.esprit.jardinenfant.Services;

import com.esprit.jardinenfant.Entities.PostHeader;

import java.util.List;

public interface PostHeaderService {
    List<PostHeader> findPostBySubject(String subject);
}
