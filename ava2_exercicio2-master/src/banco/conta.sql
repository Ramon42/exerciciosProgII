/**
 * Author:  ronaldo
 * Created: 13/11/2018
 */
CREATE TABLE conta(
    numero INT NOT NULL,
    agencia INT NOT NULL,
    saldo FLOAT,
    PRIMARY KEY(numero, agencia)
);
INSERT INTO conta (numero, agencia, saldo) VALUES (1234, 54321, 150);
