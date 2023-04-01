package com.gym.myworkoutmanager.api.DTO;

public record WorkoutDTO(
        Long userId,
        String name,
        Integer repetitions
) { }
