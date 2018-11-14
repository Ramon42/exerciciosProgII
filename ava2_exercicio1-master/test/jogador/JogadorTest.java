/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogador;

import java.time.LocalDate;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author a400978
 */
public class JogadorTest {
    
    public JogadorTest() {
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
     * Test of getId method, of class Jogador.
     */
    @Test
    public void testNegociar1() { //caso o contrato não tenha vencido e 
        //ofereceram um valor menor que o valor do jogador + contrato
        System.out.println("negociar");
        float valor =  100000;
        float multa =   50000;
        float oferta = 120000;
        Jogador instance = new Jogador();
        LocalDate fimContrato = LocalDate.of(2018,12,15);
        instance.setFimContrato(fimContrato);
        instance.setValor(valor);
        instance.setMulta(multa);
        boolean expResult = false;
        boolean result = instance.negociar(oferta);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testNegociar2() { //caso o contrato não tenha vencido e 
        //ofereceram um valor maior que o valor do jogador + contrato
        System.out.println("negociar");
        float valor =  100000;
        float multa =   50000;
        float oferta = 160000;
        Jogador instance = new Jogador();
        LocalDate fimContrato = LocalDate.of(2018,12,15);
        instance.setFimContrato(fimContrato);
        instance.setValor(valor);
        instance.setMulta(multa);
        boolean expResult = true;
        boolean result = instance.negociar(oferta);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testNegociar3() { //caso o contrato tenha vencido e
        //ofereceram um valor menor que o valor do jogador
        System.out.println("negociar");
        float valor =  100000;
        float multa =   50000;
        float oferta = 90000;
        Jogador instance = new Jogador();
        LocalDate fimContrato = LocalDate.of(2018,10,15);
        instance.setFimContrato(fimContrato);
        instance.setValor(valor);
        instance.setMulta(multa);
        boolean expResult = false;
        boolean result = instance.negociar(oferta);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testNegociar4() { //caso o contrato tenha vencido e 
        //ofereceram um valor maior que o valor do jogador
        System.out.println("negociar");
        float valor =  100000;
        float multa =   50000;
        float oferta = 120000;
        Jogador instance = new Jogador();
        LocalDate fimContrato = LocalDate.of(2018,10,15);
        instance.setFimContrato(fimContrato);
        instance.setValor(valor);
        instance.setMulta(multa);
        boolean expResult = true;
        boolean result = instance.negociar(oferta);
        assertEquals(expResult, result);
        
    }

    
}
