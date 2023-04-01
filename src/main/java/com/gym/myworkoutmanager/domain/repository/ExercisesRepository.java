package com.gym.myworkoutmanager.domain.repository;

import com.gym.myworkoutmanager.domain.model.Exercises;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExercisesRepository extends JpaRepository<Exercises, Long> {

}