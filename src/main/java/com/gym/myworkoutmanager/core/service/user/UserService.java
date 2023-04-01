package com.gym.myworkoutmanager.core.service.user;

import com.gym.myworkoutmanager.api.DTO.UserDTO;
import com.gym.myworkoutmanager.core.gateway.user.UserServiceGateway;
import com.gym.myworkoutmanager.domain.model.User;
import com.gym.myworkoutmanager.domain.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService implements UserServiceGateway {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public UserDTO createUser(UserDTO userDTO) {
        Optional<User> userEmail = userRepository.findByEmail(userDTO.email());

        if(userEmail.isEmpty()) {
            userRepository.save(
                new User(
                    userDTO.name(),
                    userDTO.password(),
                    userDTO.email()
                )
            );
        }

        return userDTO;
    }
}
