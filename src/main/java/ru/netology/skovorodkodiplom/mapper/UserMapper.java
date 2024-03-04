package ru.netology.skovorodkodiplom.mapper;

import org.mapstruct.Mapper;
import ru.netology.skovorodkodiplom.dto.UserDto;
import ru.netology.skovorodkodiplom.entities.User;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User userDtoToUser(UserDto userDto);

    UserDto userToUserDto(User user);

}
