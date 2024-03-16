package com.tasklist.system.web.mappers;

import com.tasklist.system.domain.user.User;
import com.tasklist.system.web.dto.user.UserDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toDto(User user);
    User toEntity(UserDto dto);
}
