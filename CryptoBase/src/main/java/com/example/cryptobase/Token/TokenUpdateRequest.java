package com.example.cryptobase.Token;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class TokenUpdateRequest {
    private String symbol;
    private String token_name;
    private Long total_supply;
    private String network;
}
