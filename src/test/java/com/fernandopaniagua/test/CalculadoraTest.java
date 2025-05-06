package com.fernandopaniagua.test;

import com.fernandopaniagua.dependeciasproveedor.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    @Test
    public void testSuma() {
        Assertions.assertEquals(10, Calculadora.sumar(8,2));
        Assertions.assertEquals(-6, Calculadora.sumar(-8,2));
    }

    @Test
    public void testResta() {
        Assertions.assertEquals(6, Calculadora.restar(8,2));
        Assertions.assertEquals(-10, Calculadora.restar(-8,2));
    }
}
