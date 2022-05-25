/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package pkg2020_calculadora;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author adrire
 */
public class CalculadoraTestBCAC {

    private static Calculadora calcu;
    private int resultado;

    @BeforeClass
    public static void creaCalculadora() {
        calcu = new Calculadora(20, 10);
    }

    @AfterClass
    public static void borraCalculadora() {
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


