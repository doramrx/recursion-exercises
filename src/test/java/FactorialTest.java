import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactorialTest {

    private final Factorial factorial = new Factorial();

    @Test
    @DisplayName("Should calculate factorial of 0")
    public void factorialOfZeroTest(){
        int result = factorial.calculateFactorial(0);
        assertEquals(1, result);
    }

    @Test
    @DisplayName("Should calculate factorial of a positive number")
    public void factorialPositiveTest(){
        int result = factorial.calculateFactorial(3);
        assertEquals(6, result);
    }

    @Test
    @DisplayName("Should throw an exception when calculate factorial of a negative number")
    public void factorialNegativeTest(){
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                factorial.calculateFactorial(-2));

        String expectedMessage = "The value cannot be negative";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}
