CREATE TABLE IF NOT EXISTS Tokens (
    symbol VARCHAR(255) PRIMARY KEY,
    token_name VARCHAR(255),
    total_supply BIGINT,
    network VARCHAR(255)
    );
/*
CREATE TABLE IF NOT EXISTS Users (
    id UUID PRIMARY KEY,
    username VARCHAR(255),
    password VARCHAR(255),
    email VARCHAR(255),
    );
*/