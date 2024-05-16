package com.example.cryptobase.Token;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-15T22:07:48+0200",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.7.jar, environment: Java 21.0.1 (Oracle Corporation)"
)
@Component
public class TokenMapperImpl implements TokenMapper {

    @Override
    public Token tokenToEntity(TokenCreateRequest tokenCreateRequest) {
        if ( tokenCreateRequest == null ) {
            return null;
        }

        Token token = new Token();

        token.setSymbol( tokenCreateRequest.getSymbol() );
        token.setToken_name( tokenCreateRequest.getToken_name() );
        token.setTotal_supply( tokenCreateRequest.getTotal_supply() );
        token.setNetwork( tokenCreateRequest.getNetwork() );

        return token;
    }

    @Override
    public TokenResponse tokenCreateRequestToResponse(TokenCreateRequest tokenCreateRequest) {
        if ( tokenCreateRequest == null ) {
            return null;
        }

        TokenResponse tokenResponse = new TokenResponse();

        tokenResponse.setSymbol( tokenCreateRequest.getSymbol() );
        tokenResponse.setToken_name( tokenCreateRequest.getToken_name() );
        tokenResponse.setTotal_supply( tokenCreateRequest.getTotal_supply() );
        tokenResponse.setNetwork( tokenCreateRequest.getNetwork() );

        return tokenResponse;
    }

    @Override
    public TokenResponse tokenToResponse(Token token) {
        if ( token == null ) {
            return null;
        }

        TokenResponse tokenResponse = new TokenResponse();

        tokenResponse.setSymbol( token.getSymbol() );
        tokenResponse.setToken_name( token.getToken_name() );
        tokenResponse.setTotal_supply( token.getTotal_supply() );
        tokenResponse.setNetwork( token.getNetwork() );

        return tokenResponse;
    }

    @Override
    public Token tokenUpdateRequestToEntity(TokenUpdateRequest tokenUpdateRequest) {
        if ( tokenUpdateRequest == null ) {
            return null;
        }

        Token token = new Token();

        token.setSymbol( tokenUpdateRequest.getSymbol() );
        token.setToken_name( tokenUpdateRequest.getToken_name() );
        token.setTotal_supply( tokenUpdateRequest.getTotal_supply() );
        token.setNetwork( tokenUpdateRequest.getNetwork() );

        return token;
    }
}
