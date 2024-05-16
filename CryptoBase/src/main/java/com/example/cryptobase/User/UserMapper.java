package com.example.cryptobase.User;

import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;


@Mapper(unmappedTargetPolicy = ReportingPolicy.ERROR, componentModel = "spring", builder = @Builder(disableBuilder = true))
public interface UserMapper {
    User userToEntity(UserCreateRequest userCreateRequest);

    User userUpdateRequestToEntity(UserUpdateRequest userUpdateRequest);

    UserCreateRequest userToCreateRequest(User user);

    UserResponse userToResponse(User user);
}