package com.esprit.jardinenfant;

import com.esprit.jardinenfant.Entities.*;
import com.esprit.jardinenfant.Repositories.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@SpringBootTest
class JardinEnfantApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testCreateUser() {
        User user = new User("name", "photo");
        userRepository.save(user);

    }
//
//    @Autowired
//    private PostAttachementRepository postAttachementRepository;
//
//    @Test
//    public void testCreatepostAttachemennt() {
//        PostAttachement pa = new PostAttachement("test",
//                new Post(1, new Date(), new Date(), new Date(), Boolean.TRUE)
//        );
//        postAttachementRepository.save(pa);
//
//    }
//
//    @Autowired
//    private PostBodyRepository postBodyRepository;
//
//    @Test
//    public void testCreateBody() {
//        PostBody pb = new PostBody("test",
//                new Post(1, new Date(), new Date(), new Date(), Boolean.TRUE)
//        );
//        postBodyRepository.save(pb);
//
//    }
//
//    @Autowired
//    private PostHeaderRepository postHeaderRepository;
//
//    @Test
//    public void testCreateHeader() {
//        PostHeader ph = new PostHeader("sub", "cat",
//                new User(1, "name", "photo"),
//                new Post(1, new Date(), new Date(), new Date(), Boolean.TRUE)
//        );
//        postHeaderRepository.save(ph);
//
//    }
//
//    @Autowired
//    private PostCommentRepository postCommentRepository;
//
//    @Test
//    public void testCreateComment() {
//        PostComment pc = new PostComment("sub",
//                new Date(),
//                new User(1, "name", "photo"),
//                new Post(1, new Date(), new Date(), new Date(), Boolean.TRUE)
//        );
//        postCommentRepository.save(pc);
//
//    }
//
//    @Autowired
//    private PostReactionRepository postReactionRepository;
//
//    @Test
//    public void testCreateReaction() {
//        PostReaction pr = new PostReaction("sub",
//                new User(1, "name", "photo"),
//                new Post(1, new Date(), new Date(), new Date(), Boolean.TRUE)
//        );
//        postReactionRepository.save(pr);
//
//    }
//
//    @Autowired
//    private PostShareRepository postShareRepository;
//
//    @Test
//    public void testCreateShare() {
//        PostShare ps = new PostShare("sub",
//                new User(1, "name", "photo"),
//                new Post(1, new Date(), new Date(), new Date(), Boolean.TRUE)
//        );
//        postShareRepository.save(ps);
//    }
//
//    @Autowired
//    private PostRepository postRepository;
//
//    @Test
//    public void testCreatePost() {
//
//        Post p = new Post(
//                new Date(),
//                new Date(),
//                new Date(),
//                new PostHeader("sub","cat"),
//                new PostBody("content"),
//                new User(1,"name", "photo")
//        );
//        postRepository.save(p);
//    }
//
//
//    // Test Post Crud
//    @Test
//    public void testFindPost(Integer id) {
//        //TODO: replace 1 by id
//        if (postRepository.findById(1).isPresent()) {
//            Post p = postRepository.findById(1).get();
//            System.out.print(p);
//        }
//    }
//
//    @Test
//    public void testUpdatePost() {
//
//        if (postRepository.findById(1).isPresent()) {
//            Post p = postRepository.findById(1).get();
//            System.out.print(p);
//            p.setVisible(Boolean.FALSE);
//            System.out.print(p);
//            postRepository.save(p);
//        }
//    }
//
//    @Test
//    public void testDeletePost() {
//
//        if (postRepository.findById(1).isPresent()) {
//            postRepository.deleteById(1);
//        }
//    }
//
//    @Test
//    public void testFindAllPosts() {
//        List<Post> postList = postRepository.findAll();
//
//        for(Post p:postList){
//            System.out.println(p);
//        }
//    }
//
//    @Autowired
//    PostHeaderRepository postHeaderRepository;
//    @Test
//    public void testFindAllHeaders() {
//        List<PostHeader> headersList = postHeaderRepository.findAll();
//
//        for(PostHeader p:headersList){
//            System.out.println(p);
//        }
//    }


}

