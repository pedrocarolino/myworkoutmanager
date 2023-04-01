package com.gym.myworkoutmanager.core.gateway.workout;

import com.gym.myworkoutmanager.api.DTO.WorkoutDTO;
import org.springframework.stereotype.Component;

@Component
public interface WorkoutServiceGateway {
    WorkoutDTO createWorkout(WorkoutDTO workoutDTO);
}
