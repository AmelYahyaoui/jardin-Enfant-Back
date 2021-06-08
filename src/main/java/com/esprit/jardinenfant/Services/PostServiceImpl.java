package com.esprit.jardinenfant.Services;

import com.esprit.jardinenfant.Entities.*;
import com.esprit.jardinenfant.Repositories.PostHeaderRepository;
import com.esprit.jardinenfant.Repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.xml.crypto.Data;
import java.util.List;


@Service
public class PostServiceImpl implements PostService{

    @Autowired
    PostRepository postRepository;


    @Override
    public Post save(Post p) {
        for (PostAttachement pa : p.getAttachementsList()){
            pa.setPost(p);
        }
        return postRepository.save(p);
    }

    @Override
    public Post update(Post newPost) {
        if(newPost != null){
            Post oldPost = postRepository.getOne(newPost.getId());
            oldPost.setPostHeader(newPost.getPostHeader() == null ? oldPost.getPostHeader() : newPost.getPostHeader());
            oldPost.setPostBody(newPost.getPostBody() == null ? oldPost.getPostBody() : newPost.getPostBody());
            oldPost.setAttachementsList(newPost.getAttachementsList() == null ? oldPost.getAttachementsList() : newPost.getAttachementsList());
            oldPost.setCommentsList(newPost.getCommentsList() == null ? oldPost.getCommentsList() : newPost.getCommentsList());
            oldPost.setReactionsList(newPost.getReactionsList() == null ? oldPost.getReactionsList() : newPost.getReactionsList());
            oldPost.setSharesList(newPost.getSharesList() == null ? oldPost.getSharesList() : newPost.getSharesList());
//            oldPost.setUser(oldPost.getUser());
            oldPost.setEditedAt(newPost.getEditedAt());

            for (PostAttachement pa : oldPost.getAttachementsList()){
                pa.setPost(oldPost);
            }
            for (PostComment pc : oldPost.getCommentsList()){
                pc.setPost(oldPost);
            }
            for (PostReaction pr : oldPost.getReactionsList()){
                pr.setPost(oldPost);
            }
            for (PostShare ps : oldPost.getSharesList()){
                ps.setPost(oldPost);
            }
            return postRepository.save(oldPost);
        }
        return null;
    }

    @Override
    public void delete(Post p) {
            postRepository.delete(p);
    }

    @Override
    public void deleteById(Integer id) {
        if (postRepository.findById(id).isPresent()) {
            postRepository.deleteById(id);
        }
    }

    @Override
    public Post findById(Integer id) {
        if (postRepository.findById(id).isPresent()) {
            return postRepository.findById(id).get();
        }
        return null;
    }

    @Override
    public List<Post> findAll() {
//        System.out.println("get posts");
        return postRepository.findAll();
    }


}
