package ru.netology.skovorodkodiplom.service;

import ru.netology.skovorodkodiplom.dto.UserDto;

public interface UserService {

    UserDto createUser(UserDto userDto);

    UserDto getUserById(Long id);

    UserDto updateUser(UserDto userDto, Long id);

    void deleteUserById(Long id);

    UserDto findUserByLogin(String login);

}
