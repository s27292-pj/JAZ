package com.example.cryptobase.Token;

import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.ERROR, componentModel = "spring", builder = @Builder(disableBuilder = true))
public interface TokenMapper {
    Token tokenToEntity(TokenCreateRequest tokenCreateRequest);
    TokenResponse tokenCreateRequestToResponse(TokenCreateRequest tokenCreateRequest);
    TokenResponse tokenToResponse(Token token);

    Token tokenUpdateRequestToEntity(TokenUpdateRequest tokenUpdateRequest);
}
