package com.gym.myworkoutmanager.api.controller;

import com.gym.myworkoutmanager.api.DTO.UserDTO;
import com.gym.myworkoutmanager.core.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@RequestMapping("/v1/user/")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("create")
    ResponseEntity<?> createUser(@RequestBody UserDTO userDTO) {
        URI location = URI.create("/create");
        return ResponseEntity.created(location).body(userService.createUser(userDTO));
    }
}
