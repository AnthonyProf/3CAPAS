/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package pkg3capas;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author tonyM
 */
public class MainTest {
    
    public MainTest() {
     
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

     /**
     * Test of calcularEdad method, of class Main.
     */
    @Test
    public void testCalcularEdad() {
        System.out.println("calcularEdad");
        int edad = 26;
        int expResult = 1997;
        int result = Main.calcularEdad(edad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       if(expResult!=result)
       {
            fail("The test case is a prototype.");
       }
    }
    
}
