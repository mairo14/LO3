/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author CES
 */
public class OperacionesTest {
    
    public OperacionesTest() {
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
     * Test of sumarPar method, of class Operaciones.
     */
    @Test
    
    public void testSumarPar() {
        System.out.println("sumarPar");
        Operaciones instance = new Operaciones();
        
        int a = 1;
        int b = 1;
        
        int expResult = 2;
        int result = instance.sumarPar(a, b);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of mayor method, of class Operaciones.
     */
    @Test
    @Ignore
    public void testMayor() {
        System.out.println("mayor");
        Operaciones instance = new Operaciones();
        int a = 2;
        int b = 1;
        
        int expResult = 2;
        int result = instance.mayor(a, b);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of sumarVector method, of class Operaciones.
     */
    @Test
    @Ignore
    public void testSumarVector() {
        System.out.println("sumarVector");
        Operaciones instance = new Operaciones();
        int[] numeros = {2, 3};
        
        int expResult = 5;
        int result = instance.sumarVector(numeros);
        assertEquals(expResult, result);
        
    }
    
}
