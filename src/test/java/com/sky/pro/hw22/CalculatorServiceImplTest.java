package com.sky.pro.hw22;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import  static org.junit.jupiter.api.Assertions.assertEquals;
import  static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorServiceImplTest {
    int num1;
    int num2;
    CalculatorServiceImpl csi;
    @BeforeEach
    public void setUp() {
        num1 = 10;
        num2 = 2;
        csi = new CalculatorServiceImpl();
    }
    @Test
    public void plus() {

        String expected = "10+2=12";
        String actual = csi.plus (num1, num2);
        assertEquals(expected, actual);

    }
    @Test
    public void minus() {
        String expected = "10-2=8";
        String actual = csi.minus (num1, num2);
        assertEquals(expected, actual);

    }
    @Test
    public void multiply() {
        String expected = "10*2=20";
        String actual = csi.multiply (num1, num2);
        assertEquals(expected, actual);

    }
    @Test
    public void divide() {
        String expected = "10/2=5";
        String actual = csi.divide (num1, num2);
        assertEquals(expected, actual);

    }

    @Test
    public void divideExeption() {
        assertThrows(IllegalArgumentException.class, ()-> csi.divide(num1, 0));

    }

}
