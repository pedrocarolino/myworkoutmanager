package com.gym.myworkoutmanager.domain.repository;

import com.gym.myworkoutmanager.domain.model.Workout;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkoutRepository extends JpaRepository<Workout, Long> {

}