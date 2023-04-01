package com.gym.myworkoutmanager.api.controller;

import com.gym.myworkoutmanager.api.DTO.UserDTO;
import com.gym.myworkoutmanager.core.gateway.user.UserServiceGateway;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@RequestMapping("/v1/user/")
public class UserController {

    private final UserServiceGateway userServiceGateway;

    public UserController(UserServiceGateway userServiceGateway) {
        this.userServiceGateway = userServiceGateway;
    }

    @PostMapping("create")
    ResponseEntity<UserDTO> createUser(@RequestBody UserDTO userDTO) {
        URI location = URI.create("/create");
        return ResponseEntity.created(location).body(userServiceGateway.createUser(userDTO));
    }
}
