package com.esprit.jardinenfant.Repositories;

import com.esprit.jardinenfant.Entities.PostHeader;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

public interface PostHeaderRepository extends JpaRepository<PostHeader, Integer> {


}
