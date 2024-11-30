package pro.sky.calculator_unit_test.service.impl;

import org.springframework.stereotype.Service;
import pro.sky.calculator_unit_test.exception.DivideByZeroException;
import pro.sky.calculator_unit_test.service.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public Integer plus(Integer num1, Integer num2) {
        return num1 + num2;
    }

    @Override
    public Integer minus(Integer num1, Integer num2) {
        return num1 - num2;
    }

    @Override
    public Integer multiply(Integer num1, Integer num2) {
        return num1 * num2;
    }

    @Override
    public Integer divide(Integer num1, Integer num2) {
        if (num2 == 0){
            throw new DivideByZeroException("Деление на ноль!");
        }
        return num1 / num2;
    }

}
