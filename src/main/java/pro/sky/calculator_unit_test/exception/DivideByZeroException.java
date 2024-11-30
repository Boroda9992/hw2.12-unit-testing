package pro.sky.calculator_unit_test.exception;

public class DivideByZeroException extends IllegalArgumentException{
    public DivideByZeroException(String s) {
        super(s);
    }
}
