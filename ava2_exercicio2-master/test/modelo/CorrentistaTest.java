/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ramon
 */
public class CorrentistaTest {
    
    public CorrentistaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of sacar method, of class Correntista.
     */
    @Test
    public void testSacar() {//sacar valor válido
        System.out.println("sacar");
        Conta aux = new Conta();
        aux.setNumero(1324);
        aux.setAgencia(54321);
        aux.setSaldo(150);
        
        float valor = 100;
        Correntista instance = new Correntista();
        instance.setConta(aux);
        float expResult = 50;
        float result = instance.sacar(valor);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testSacar2() {//sacar valor inválido
        System.out.println("sacar");
        Conta aux = new Conta();
        aux.setNumero(1324);
        aux.setAgencia(54321);
        aux.setSaldo(150);
        
        float valor = 200;
        Correntista instance = new Correntista();
        instance.setConta(aux);
        float expResult = -1;
        float result = instance.sacar(valor);
        assertEquals(expResult, result, 0.0);
    }
    /**
     * Test of depositar method, of class Correntista.
     */
    @Test
    public void testDepositar() {
        System.out.println("depositar");
        Conta aux = new Conta();
        aux.setNumero(1324);
        aux.setAgencia(54321);
        aux.setSaldo(150);
        float valor = 100;
        float expResult = 250;
        Correntista instance = new Correntista();
        instance.setConta(aux);
        instance.depositar(valor);
        float result = instance.getConta().getSaldo();
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of consultarSaldo method, of class Correntista.
     */
    @Test
    public void testConsultarSaldo() {
        System.out.println("consultarSaldo");
        Conta aux = new Conta();
        aux.setNumero(1324);
        aux.setAgencia(54321);
        aux.setSaldo(150);
        Correntista instance = new Correntista();
        instance.setConta(aux);
        float expResult = 150;
        float result = instance.consultarSaldo();
        assertEquals(expResult, result, 0.0);
    }
    
}
