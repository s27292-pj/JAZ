package com.example.cryptobase.User;

import com.example.cryptobase.Token.Token;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.UuidGenerator;

import java.util.List;
import java.util.UUID;

@Data
@Entity
@Table(name = "Users")
public class User {
    @Id
    @UuidGenerator
    private UUID id;
    private String username;
    private String password;
    private String email;
    @OneToMany
    private List<Token> tokenList;
}



