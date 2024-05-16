package com.example.cryptobase.Token;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TokenController {

    private final TokenService tokenService;

    @PostMapping("/addToken")
    public TokenResponse addToken(@PathVariable TokenCreateRequest tokenCreateRequest) {
        return tokenService.addToken(tokenCreateRequest);
    }

    @GetMapping("/getTokens")
    public List<TokenResponse> getTokens() {
        return tokenService.getAllTokens();
    }

    @GetMapping("/getToken/{symbol}")
    public TokenResponse getTokenBySymbol(@PathVariable String symbol) {
        return tokenService.getToken(symbol);
    }

    @DeleteMapping("/deleteToken/{symbol}")
    public void deleteToken(@PathVariable String symbol) {
        tokenService.deleteToken(symbol);
    }

    @PutMapping("/updateToken/{symbol}")
    public TokenResponse updateToken(@PathVariable String symbol, @RequestBody TokenUpdateRequest tokenUpdateRequest) {
        return tokenService.updateToken(symbol, tokenUpdateRequest);
    }

}