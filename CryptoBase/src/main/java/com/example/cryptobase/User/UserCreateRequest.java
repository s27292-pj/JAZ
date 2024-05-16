package com.example.cryptobase.User;

import com.example.cryptobase.Token.Token;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class UserCreateRequest {
    private UUID id;
    private String username;
    private String password;
    private String email;
    private List<Token> tokenList;
}
