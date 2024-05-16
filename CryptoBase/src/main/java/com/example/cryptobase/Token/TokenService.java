package com.example.cryptobase.Token;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class TokenService {

    private final TokenRepository tokenRepository;
    private final TokenMapper tokenMapper;

    public TokenResponse addToken(TokenCreateRequest tokenCreateRequest) {
        Token token = tokenMapper.tokenToEntity(tokenCreateRequest);
        tokenRepository.save(token);
        return tokenMapper.tokenCreateRequestToResponse(tokenCreateRequest);
    }

    public TokenResponse getToken(String symbol) {
        Token token = tokenRepository.findById(symbol).orElseThrow(() -> new RuntimeException("Token not found"));
        return tokenMapper.tokenToResponse(token);
    }

    public void deleteToken(String symbol) {
        tokenRepository.deleteById(symbol);
    }

    public List<TokenResponse> getAllTokens() {
        List<Token> tokens = tokenRepository.findAll();
        List<TokenResponse> tokenResponses = new ArrayList<>();
        for (Token token : tokens) {
            tokenResponses.add(tokenMapper.tokenToResponse(token));
        }
        return tokenResponses;
    }

    public TokenResponse updateToken(String symbol, TokenUpdateRequest tokenUpdateRequest) {
        Token token = tokenRepository.findById(symbol).orElseThrow(() -> new RuntimeException("Token not found"));
        tokenRepository.save(tokenMapper.tokenUpdateRequestToEntity(tokenUpdateRequest));
        return tokenMapper.tokenToResponse(token);
    }
}
