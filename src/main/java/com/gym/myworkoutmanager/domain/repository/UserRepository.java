package com.gym.myworkoutmanager.domain.repository;

import com.gym.myworkoutmanager.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {

}
