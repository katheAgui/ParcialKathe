/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialkathea;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class calculadora2IT {
    
    public calculadora2IT() {
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

@Test
    public void testSuma() {
        System.out.println("Suma");
        int numero1 = 3;
        int numero2 = 1;
        calculadora2 instance = new calculadora2();
        int expResult = 4;
        int result = instance.Suma(numero1, numero2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of Resta method, of class calculadora2.
     */
    @Test
    public void testResta() {
        System.out.println("Resta");
        int numero1 = 3;
        int numero2 = 1;
        calculadora2 instance = new calculadora2();
        int expResult = 2;
        int result = instance.Resta(numero1, numero2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Multiplicacion method, of class calculadora2.
     */
    @Test
    public void testMultiplicacion() {
        System.out.println("Multiplicacion");
        int numero1 = 3;
        int numero2 = 1;
        calculadora2 instance = new calculadora2();
        int expResult = 3;
        int result = instance.Multiplicacion(numero1, numero2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of division method, of class calculadora2.
     */
    @Test
    public void testDivision() {
        System.out.println("division");
        int numero1 = 8;
        int numero2 = 2;
        calculadora2 instance = new calculadora2();
        int expResult = 4;
        int result = instance.division(numero1, numero2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of exponenciacion method, of class calculadora2.
     */
    @Test
    public void testExponenciacion() {
        System.out.println("exponenciacion");
        int numero1 = 2;
        int numero2 = 2;
        calculadora2 instance = new calculadora2();
        int expResult = 4;
        int result = instance.exponenciacion(numero1, numero2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       //fail("The test case is a prototype.");
    }

    /**
     * Test of exponenciacionSuma method, of class calculadora2.
     */
    @Test
    public void testExponenciacionSuma() {
        System.out.println("exponenciacionMultiplicacion");
        int numero1 = 2;
        int numero2 = 2;
        calculadora2 instance = new calculadora2();
        int expResult = 8;
        int result = instance.exponenciacionSuma(numero1, numero2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of exponenciacionMultiplicacion method, of class calculadora2.
     */
    @Test
    public void testExponenciacionMultiplicacion() {
        System.out.println("exponenciacionMultiplicacion");
        int numero1 = 2;
        int numero2 = 2;
        calculadora2 instance = new calculadora2();
        int expResult = 16;
        int result = instance.exponenciacionMultiplicacion(numero1, numero2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
}
