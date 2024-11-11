package com.example.quiz_1;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void add_TwoPositiveNumbers_ReturnsSum() {
        assertEquals(4, calculator.add(2, 2));
    }

    @Test
    public void add_WithNegativeNumber_ReturnsSum() {
        assertEquals(-1, calculator.add(2, -3));
    }

    @Test
    public void subtract_PositiveNumbers_ReturnsDifference() {
        assertEquals(3, calculator.subtract(5, 2));
    }

    @Test
    public void subtract_WithNegativeNumber_ReturnsDifference() {
        assertEquals(8, calculator.subtract(5, -3));
    }

    @Test
    public void multiply_TwoPositiveNumbers_ReturnsProduct() {
        assertEquals(6, calculator.multiply(2, 3));
    }

    @Test
    public void multiply_WithNegativeNumber_ReturnsProduct() {
        assertEquals(-6, calculator.multiply(2, -3));
    }

    @Test
    public void divide_TwoPositiveNumbers_ReturnsQuotient() {
        assertEquals(2.0, calculator.divide(4, 2), 0.0001);
    }

    @Test
    public void divide_WithNegativeNumber_ReturnsQuotient() {
        assertEquals(-2.0, calculator.divide(4, -2), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void divide_ByZero_ThrowsException() {
        calculator.divide(4, 0);
    }

    @Test
    public void divide_NonEvenDivision_ReturnsDecimalResult() {
        assertEquals(1.5, calculator.divide(3, 2), 0.0001);
    }
}