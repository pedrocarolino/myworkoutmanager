package com.gym.myworkoutmanager.core.service.workout;

import com.gym.myworkoutmanager.api.DTO.WorkoutDTO;
import com.gym.myworkoutmanager.core.gateway.workout.WorkoutServiceGateway;
import com.gym.myworkoutmanager.domain.model.User;
import com.gym.myworkoutmanager.domain.model.Workout;
import com.gym.myworkoutmanager.domain.repository.UserRepository;
import com.gym.myworkoutmanager.domain.repository.WorkoutRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class WorkoutService implements WorkoutServiceGateway {

    private final UserRepository userRepository;
    private final WorkoutRepository workoutRepository;

    public WorkoutService(UserRepository userRepository, WorkoutRepository workoutRepository) {
        this.userRepository = userRepository;
        this.workoutRepository = workoutRepository;
    }

    @Override
    public WorkoutDTO createWorkout(WorkoutDTO workoutDTO) {
        Optional<User> user = userRepository.findById(workoutDTO.userId());

        if (user.isPresent()) {
            workoutRepository.save(
                new Workout(
                    workoutDTO.name(),
                    workoutDTO.repetitions()
                )
            );
        }

        return workoutDTO;
    }
}
