package com.rfrey.service;

import com.rfrey.dto.UserDto;
import com.rfrey.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}
