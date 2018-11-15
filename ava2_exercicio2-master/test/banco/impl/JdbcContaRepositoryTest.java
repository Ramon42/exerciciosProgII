/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco.impl;

import java.util.ArrayList;
import modelo.Conta;
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
public class JdbcContaRepositoryTest {
    
    public JdbcContaRepositoryTest() {
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
     * Test of addConta method, of class JdbcContaRepository.
     */
    @Test
    public void testAddConta() throws Exception {
        System.out.println("addConta");
        Conta conta = new Conta();
        Conta expResult = null;
        JdbcContaRepository instance = new JdbcContaRepository();
        conta.setNumero(6789);
        conta.setAgencia(98765);
        conta.setSaldo(1500);
        instance.addConta(conta);
        expResult = instance.get(6789, 98765);
        assertTrue((conta.getNumero() == expResult.getNumero()) && (conta.getAgencia() == expResult.getAgencia()));
        
    }

    /**
     * Test of removeConta method, of class JdbcContaRepository.
     */
    @Test
    public void testRemoveConta() throws Exception {
        System.out.println("removeConta");
        Conta conta = new Conta();
        JdbcContaRepository instance = new JdbcContaRepository();
        conta.setNumero(6789);
        conta.setAgencia(98765);
        instance.removeConta(conta);
        
        
    }
    /**
     * Test of updateConta method, of class JdbcContaRepository.
     */
    @Test
    public void testUpdateConta() throws Exception {
        System.out.println("updateConta");
        Conta conta = new Conta();
        int expResult = 200;
        Conta result = null;
        JdbcContaRepository instance = new JdbcContaRepository();
        conta.setNumero(1234);
        conta.setAgencia(54321);
        conta.setSaldo(200);
        instance.updateConta(conta);
        result = instance.get(1234, 54321);
        assertEquals(result.getSaldo(), expResult, 0);
    }
    
    /**
     * Test of get method, of class JdbcContaRepository.
     */
    @Test
    public void testGet() throws Exception {//caso a conta procurada seja igual ao resultado
        System.out.println("get");
        int numero = 1234;
        int agencia = 54321;
        JdbcContaRepository instance = new JdbcContaRepository();
        Conta result = instance.get(numero, agencia);
        assertTrue((numero == result.getNumero()) && (agencia == result.getAgencia()));
    }
    
    @Test
    public void testGet2() throws Exception {//caso a conta procurada seja diferente do resultado
        System.out.println("get");
        int numero = 1234;
        int agencia = 54321;
        int expResultNum = 4321;
        int expResultAg = 12345;
        JdbcContaRepository instance = new JdbcContaRepository();
        Conta result = instance.get(numero, agencia);
        assertFalse((expResultNum == result.getNumero()) && (expResultAg == result.getAgencia()));
    }
    /**
     * Test of listar method, of class JdbcContaRepository.
     */

}
