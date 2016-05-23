/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upc.evolucion.logica;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ehaquique
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
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
     * Test of suma method, of class Calculadora.
     */
    @Test
    public void testSuma() {
        
        int x = 2  ;
        int y = 3;
        int expResult = 5;
        int result = Calculadora.suma(x, y);
        assertEquals(expResult, result);        
    }
    
    @Test
    public void testResta() {
        
        int x = 8;
        int y = 3;
        int expResult = 5;
        int result = Calculadora.resta(x, y);
        assertEquals(expResult, result);        
    }
    
}
