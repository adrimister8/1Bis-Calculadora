/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package pkg2020_calculadora;

import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CalculadoraTest {

    private int nume1;
    private int nume2;
    private int resul;

    public CalculadoraTest(int nume1, int nume2, int resul) {
        this.nume1 = nume1;
        this.nume2 = nume2;
        this.resul = resul; //resultado de la operación
    }

    @Parameters
    public static Collection<Object[]> numeros() {
        return Arrays.asList(new Object[][]{
            {20, 10, 2}, {30, -2, -15}, {5, 2, 3}});
    }

    @Test
    public void testDivide() {
        Calculadora calcu = new Calculadora(nume1, nume2);
        int resultado = calcu.divide();
        assertEquals(resul, resultado);
    }
}