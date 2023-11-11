import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EvenSumTest {

    private final EvenSum evenSum = new EvenSum();

    @Test
    @DisplayName("Should return 0")
    public void calculateSumOfZeroTest(){
        int result = evenSum.calculateSumOfEvenNumbers(0);
        assertEquals(0, result);
    }

    @Test
    @DisplayName("Should calculate sum of even numbers")
    public void calculateSumOfEvenTest(){
        int result1 = evenSum.calculateSumOfEvenNumbers(5);
        int result2 = evenSum.calculateSumOfEvenNumbers(10);
        assertEquals(6, result1);
        assertEquals(30, result2);
    }

    @Test
    @DisplayName("Should throw an exception when calculate sum of a negative number")
    public void SumOfEvenNegativeTest(){
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                evenSum.calculateSumOfEvenNumbers(-2));

        String expectedMessage = "The value cannot be negative";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}
