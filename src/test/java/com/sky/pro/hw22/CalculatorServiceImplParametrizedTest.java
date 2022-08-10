package com.sky.pro.hw22;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplParametrizedTest {
    private CalculatorServiceImpl csi = new CalculatorServiceImpl();

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    void plus(int num1, int num2) {
        String result = csi.plus(num1, num2);
        assertEquals(result, "10+2=12");
    }
    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    void minus(int num1, int num2) {
        String result = csi.minus(num1, num2);
        assertEquals(result, "10-2=8");
    }
    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    void multiply(int num1, int num2) {
        String result = csi.multiply(num1, num2);
        assertEquals(result, "10*2=20");
    }
    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    void divide(int num1, int num2) {
        String result = csi.divide(num1, num2);
        assertEquals(result, "10/2=5");
    }


    public static Stream<Arguments> provideParamsForTests() {
        return Stream.of(Arguments.of(10, 2)
        );

    }
}