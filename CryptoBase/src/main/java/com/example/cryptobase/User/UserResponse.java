package com.example.cryptobase.User;


import com.example.cryptobase.Token.Token;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class UserResponse {
    private String username;
    private String email;
    private String password;
    private List<Token> tokenList;
}
