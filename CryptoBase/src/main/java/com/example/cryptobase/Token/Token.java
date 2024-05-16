package com.example.cryptobase.Token;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "Tokens")
public class Token {
    @Id
    private String symbol;
    private String token_name;
    private Long total_supply;
    private String network;
}
