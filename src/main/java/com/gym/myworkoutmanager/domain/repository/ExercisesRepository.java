package com.gym.myworkoutmanager.domain.repository;

import com.gym.myworkoutmanager.domain.model.Exercises;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExercisesRepository extends JpaRepository<Exercises, Long> {

}