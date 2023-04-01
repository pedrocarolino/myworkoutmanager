package com.gym.myworkoutmanager.core.gateway.user;

import com.gym.myworkoutmanager.api.DTO.UserDTO;
import org.springframework.stereotype.Component;

@Component
public interface UserService {
    UserDTO createUser(UserDTO userDTO);
}
