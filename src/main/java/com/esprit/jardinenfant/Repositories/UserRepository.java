package com.esprit.jardinenfant.Repositories;

import com.esprit.jardinenfant.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, Integer> {
}
