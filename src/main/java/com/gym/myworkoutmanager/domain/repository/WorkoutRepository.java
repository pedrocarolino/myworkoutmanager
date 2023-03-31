package com.gym.myworkoutmanager.domain.repository;

import com.gym.myworkoutmanager.domain.model.Workout;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkoutRepository extends JpaRepository<Workout, Long> {

}