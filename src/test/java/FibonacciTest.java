import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FibonacciTest {

    private final Fibonacci fibonacci = new Fibonacci();

    @Test
    @DisplayName("Should return the same input value when it is 0 or 1")
    public void fibonacciOfZeroAndOneTest(){
        int result1 = fibonacci.calculateFibonacci(0);
        int result2 = fibonacci.calculateFibonacci(1);
        assertEquals(0, result1);
        assertEquals(1, result2);
    }

    @Test
    @DisplayName("Should calculate fibonacci of a positive number")
    public void fibonacciPositiveTest(){
        int result1 = fibonacci.calculateFibonacci(2);
        int result2 = fibonacci.calculateFibonacci(8);
        assertEquals(1, result1);
        assertEquals(21, result2);
    }

    @Test
    @DisplayName("Should throw an exception when calculate fibonacci of a negative number")
    public void fibonacciNegativeTest(){
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                fibonacci.calculateFibonacci(-2));

        String expectedMessage = "The value cannot be negative";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}
