package com.gym.myworkoutmanager.core.gateway.user;

import com.gym.myworkoutmanager.api.DTO.UserDTO;
import org.springframework.stereotype.Component;

@Component
public interface UserServiceGateway {
    UserDTO createUser(UserDTO userDTO);
}
