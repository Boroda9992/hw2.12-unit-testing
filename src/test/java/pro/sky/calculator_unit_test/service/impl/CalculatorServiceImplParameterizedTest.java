package pro.sky.calculator_unit_test.service.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import pro.sky.calculator_unit_test.service.CalculatorService;

import java.util.stream.Stream;

public class CalculatorServiceImplParameterizedTest {
    private final CalculatorService calculatorService = new CalculatorServiceImpl();

    private static Stream<Arguments> ArgumentProvider() {
        return Stream.of(
                Arguments.of(10, 5),
                Arguments.of(1, 1),
                Arguments.of(-10, 5),
                Arguments.of(10000, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("ArgumentProvider")
    void correctlyComputePlus(int num1, int num2) {
        //description
        //Method should compute basic arithmetic operations correctly

        //given
        int expectedResult = num1 + num2;

        //when
        Integer actualResult = calculatorService.plus(num1, num2);

        //then
        Assertions.assertEquals(expectedResult, actualResult);

    }
    @ParameterizedTest
    @MethodSource("ArgumentProvider")
    void correctlyComputeMinus(int num1, int num2) {
        //description
        //Method should compute basic arithmetic operations correctly

        //given
        int expectedResult = num1 - num2;

        //when
        Integer actualResult = calculatorService.minus(num1, num2);

        //then
        Assertions.assertEquals(expectedResult, actualResult);

    }
    @ParameterizedTest
    @MethodSource("ArgumentProvider")
    void correctlyComputeMultiply(int num1, int num2) {
        //description
        //Method should compute basic arithmetic operations correctly

        //given
        int expectedResult = num1 * num2;

        //when
        Integer actualResult = calculatorService.multiply(num1, num2);

        //then
        Assertions.assertEquals(expectedResult, actualResult);

    }
    @ParameterizedTest
    @MethodSource("ArgumentProvider")
    void correctlyComputeDivide(int num1, int num2) {
        //description
        //Method should compute basic arithmetic operations correctly

        //given
        int expectedResult = num1 / num2;

        //when
        Integer actualResult = calculatorService.divide(num1, num2);

        //then
        Assertions.assertEquals(expectedResult, actualResult);

    }
}
