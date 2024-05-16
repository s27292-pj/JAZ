package com.example.cryptobase.User;

import com.example.cryptobase.Token.Token;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-16T20:53:19+0200",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.7.jar, environment: Java 21.0.1 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public User userToEntity(UserCreateRequest userCreateRequest) {
        if ( userCreateRequest == null ) {
            return null;
        }

        User user = new User();

        user.setId( userCreateRequest.getId() );
        user.setUsername( userCreateRequest.getUsername() );
        user.setPassword( userCreateRequest.getPassword() );
        user.setEmail( userCreateRequest.getEmail() );
        List<Token> list = userCreateRequest.getTokenList();
        if ( list != null ) {
            user.setTokenList( new ArrayList<Token>( list ) );
        }

        return user;
    }

    @Override
    public User userUpdateRequestToEntity(UserUpdateRequest userUpdateRequest) {
        if ( userUpdateRequest == null ) {
            return null;
        }

        User user = new User();

        user.setId( userUpdateRequest.getId() );
        user.setUsername( userUpdateRequest.getUsername() );
        user.setPassword( userUpdateRequest.getPassword() );
        user.setEmail( userUpdateRequest.getEmail() );
        List<Token> list = userUpdateRequest.getTokenList();
        if ( list != null ) {
            user.setTokenList( new ArrayList<Token>( list ) );
        }

        return user;
    }

    @Override
    public UserCreateRequest userToCreateRequest(User user) {
        if ( user == null ) {
            return null;
        }

        UserCreateRequest userCreateRequest = new UserCreateRequest();

        userCreateRequest.setId( user.getId() );
        userCreateRequest.setUsername( user.getUsername() );
        userCreateRequest.setPassword( user.getPassword() );
        userCreateRequest.setEmail( user.getEmail() );
        List<Token> list = user.getTokenList();
        if ( list != null ) {
            userCreateRequest.setTokenList( new ArrayList<Token>( list ) );
        }

        return userCreateRequest;
    }

    @Override
    public UserResponse userToResponse(User user) {
        if ( user == null ) {
            return null;
        }

        UserResponse userResponse = new UserResponse();

        userResponse.setUsername( user.getUsername() );
        userResponse.setEmail( user.getEmail() );
        userResponse.setPassword( user.getPassword() );
        List<Token> list = user.getTokenList();
        if ( list != null ) {
            userResponse.setTokenList( new ArrayList<Token>( list ) );
        }

        return userResponse;
    }
}
