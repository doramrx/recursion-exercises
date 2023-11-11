public class EvenSum {
    public int calculateSumOfEvenNumbers(int x) throws IllegalArgumentException {
        if (x < 0) {
            throw new IllegalArgumentException("The value cannot be negative");
        } else if (x == 0) {
            return 0;
        }

        if(x % 2 != 0){
            x -= 1;
        }

        return x + calculateSumOfEvenNumbers(x - 2);
    }
}
