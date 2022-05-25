/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package pkg2020_calculadora;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author adrire
 */
public class CalculadoraTestBA {

    public CalculadoraTestBA() {
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
    public class CalculadoraTest {

        private Calculadora calcu;
        private int resultado;

        @Before
        public void creaCalculadora() {
            calcu = new Calculadora(20, 10);
        }

        @After
        public void borraCalculadora() {
            calcu = null;
        }

        @Test
        public void testSuma() {
            resultado = calcu.suma();
            assertEquals(30, resultado);
        }

        @Test
        public void testResta() {
            resultado = calcu.resta();
            assertEquals(10, resultado);
        }

        @Test
        public void testMultiplica() {
            resultado = calcu.multiplica();
            assertEquals("Fallo en la multiplicación: ", 200, resultado);
        }

        @Test
        public void testDivide() {
            resultado = calcu.divide();
            assertEquals(2, resultado);
        }

    }
}
