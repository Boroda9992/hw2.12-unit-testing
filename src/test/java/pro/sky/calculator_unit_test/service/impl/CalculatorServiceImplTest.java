package pro.sky.calculator_unit_test.service.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pro.sky.calculator_unit_test.exception.DivideByZeroException;
import pro.sky.calculator_unit_test.service.CalculatorService;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplTest {

    private final CalculatorService calculatorService = new CalculatorServiceImpl();

    @Test
    void correctlyComputePlus() {
        //description
        //Method should compute basic arithmetic operations correctly

        //given
        int num1 = 10;
        int num2 = 5;
        int expectedResult = 15;

        //when
        Integer actualResult = calculatorService.plus(num1, num2);

        //then
        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    void correctlyComputeMinus() {
        //description
        //Method should compute basic arithmetic operations correctly

        //given
        int num1 = 10;
        int num2 = 5;
        int expectedResult = 5;

        //when
        Integer actualResult = calculatorService.minus(num1, num2);

        //then
        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    void correctlyComputeMultiply() {
        //description
        //Method should compute basic arithmetic operations correctly

        //given
        int num1 = 10;
        int num2 = 5;
        int expectedResult = 50;

        //when
        Integer actualResult = calculatorService.multiply(num1, num2);

        //then
        Assertions.assertEquals(expectedResult, actualResult);


    }

    @Test
    void correctlyComputeDivide() {
        //description
        //Method should compute basic arithmetic operations correctly

        //given
        int num1 = 10;
        int num2 = 5;
        int expectedResult = 2;

        //when
        Integer actualResult = calculatorService.divide(num1, num2);

        //then
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void throwExceptionDivideByZeroException() {
        //description
        //Method should throw DivideByZeroException when second argument "num2" equal 0

        //given
        int num1 = 10;
        int num2 = 0;

        //when
        //then
        Assertions.assertThrows(
                DivideByZeroException.class,
        () -> calculatorService.divide(num1,num2)
        );

    }
}