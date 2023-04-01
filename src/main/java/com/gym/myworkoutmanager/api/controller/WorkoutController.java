package com.gym.myworkoutmanager.api.controller;

import com.gym.myworkoutmanager.api.DTO.WorkoutDTO;
import com.gym.myworkoutmanager.core.gateway.workout.WorkoutServiceGateway;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@RequestMapping("/v1/workout/")
public class WorkoutController {

    private final WorkoutServiceGateway workoutServiceGateway;

    public WorkoutController(WorkoutServiceGateway workoutServiceGateway) {
        this.workoutServiceGateway = workoutServiceGateway;
    }

    @PostMapping("create")
    ResponseEntity<?> createWorkout(@RequestBody WorkoutDTO workoutDTO) {
        URI location = URI.create("/create");
        return ResponseEntity.created(location).body(workoutServiceGateway.createWorkout(workoutDTO));
    }
}
