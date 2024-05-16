package com.example.cryptobase.User;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class UserService {

        private final UserRepository userRepository;
        private final UserMapper userMapper;

        public UserResponse addUser(UserCreateRequest userCreateRequest) {
            User user = userMapper.userToEntity(userCreateRequest);
            userRepository.save(user);
            return userMapper.userToResponse(user);
        }

        public UserResponse getUser(String username) {
            User user = userRepository.findById(username).orElseThrow(() -> new RuntimeException("User not found"));
            return userMapper.userToResponse(user);
        }

        public void deleteUser(String username) {
            userRepository.deleteById(username);
        }

        public List<UserResponse> getAllUsers() {
            List<User> users = userRepository.findAll();
            List<UserResponse> userResponses = new ArrayList<>();
            for (User user : users) {
                userResponses.add(userMapper.userToResponse(user));
            }
            return userResponses;
        }

        public UserResponse updateUser(String username, UserUpdateRequest userUpdateRequest) {
            User user = userRepository.findById(username).orElseThrow(() -> new RuntimeException("User not found"));
            userRepository.save(userMapper.userUpdateRequestToEntity(userUpdateRequest));
            return userMapper.userToResponse(user);
        }

}
