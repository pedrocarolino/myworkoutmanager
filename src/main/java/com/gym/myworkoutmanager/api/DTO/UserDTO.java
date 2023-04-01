package com.gym.myworkoutmanager.api.DTO;

public record UserDTO(
        String password,
        String email,
        String name
) { }
