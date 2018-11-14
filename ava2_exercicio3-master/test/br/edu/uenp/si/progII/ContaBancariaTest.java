package br.edu.uenp.si.progII;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Classe com os testes de unidade da classe ContaBancaria
 * @version 1.0
 * @author ronaldo
 */
public class ContaBancariaTest {
    
    public ContaBancariaTest() {
    }

    /**
     * Teste do método sacar, da classe ContaBancaria.
     */
    @Test
    public void testSacar1() {//caso ele tenha um valor maior 
        //do que deseja sacar
        ContaBancaria instance = new ContaBancaria();
        float saldo = 100;//saldo atual
        float sacar = 50;//deseja sacar
        instance.setSaldo(saldo);
        float expResult = 50;
        float result = instance.sacar(sacar);
        assertEquals(expResult, result, 0);
    }
    @Test
    public void testSacar2() {//caso ele tenha um valor menor
        //do que deseja sacar
        ContaBancaria instance = new ContaBancaria();
        float saldo = 100;//saldo atual
        float sacar = 150;//deseja sacar
        instance.setSaldo(saldo);
        float expResult = -1;
        float result = instance.sacar(sacar);
        assertEquals(expResult, result, 0);
    }
    /**
     * Teste do método depositar, da classe ContaBancaria.
     */
    @Test
    public void testDepositar1() {//todos os dados passados conferem com o cadastro
        ContaBancaria instance = new ContaBancaria();
        int numero = 12345;//numero da conta
        int agencia = 4242;//numero da agencia
        float saldo = 100;//saldo atual
        float depositar = 120;//valor a ser depositado
        instance.setSaldo(saldo);
        instance.setAgencia(agencia);
        instance.setNumero(numero);
        assertTrue(instance.depositar(12345, 4242, depositar));
    }
    
    @Test
    public void testDepositar2() {//numero da conta não condiz com o cadastro
        ContaBancaria instance = new ContaBancaria();
        int numero = 12345;//numero da conta
        int agencia = 4242;//numero da agencia
        float saldo = 100;//saldo atual
        float depositar = 120;//valor a ser depositado
        instance.setSaldo(saldo);
        instance.setAgencia(agencia);
        instance.setNumero(numero);
        assertFalse(instance.depositar(54321, 4242, depositar));
    }
    
    @Test
    public void testDepositar3() {//agencia da conta não condiz com o cadastro
        ContaBancaria instance = new ContaBancaria();
        int numero = 12345;//numero da conta
        int agencia = 4242;//numero da agencia
        float saldo = 100;//saldo atual
        float depositar = 120;//valor a ser depositado
        instance.setSaldo(saldo);
        instance.setAgencia(agencia);
        instance.setNumero(numero);
        assertFalse(instance.depositar(12345, 2586, depositar));
    }   
    
    @Test
    public void testDepositar4() {//nenhum dado passado condiz com o cadastro
        ContaBancaria instance = new ContaBancaria();
        int numero = 12345;//numero da conta
        int agencia = 4242;//numero da agencia
        float saldo = 100;//saldo atual
        float depositar = 120;//valor a ser depositado
        instance.setSaldo(saldo);
        instance.setAgencia(agencia);
        instance.setNumero(numero);
        assertFalse(instance.depositar(54321, 2586, depositar));
    }
}
