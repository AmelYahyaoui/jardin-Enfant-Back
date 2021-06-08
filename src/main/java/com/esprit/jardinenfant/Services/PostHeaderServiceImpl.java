package com.esprit.jardinenfant.Services;

import com.esprit.jardinenfant.Entities.Post;
import com.esprit.jardinenfant.Entities.PostHeader;
import com.esprit.jardinenfant.Repositories.PostHeaderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;


@Service
public class PostHeaderServiceImpl implements PostHeaderService{

    @Autowired
    PostHeaderRepository postHeaderRepository;

    EntityManager em;


    public List<PostHeader> findPostBySubject(String subject) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<PostHeader> cq = cb.createQuery(PostHeader.class);

        Root<PostHeader> postHeaderRoot = cq.from(PostHeader.class);
        Predicate postSubPred = cb.equal(postHeaderRoot.get("subject"), subject);
        cq.where(postSubPred);

        TypedQuery<PostHeader> query = em.createQuery(cq);
        return query.getResultList();
    }

}
