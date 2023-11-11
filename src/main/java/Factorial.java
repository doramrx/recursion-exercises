public class Factorial {
    public int calculateFactorial(int x){
        if (x < 0) {
            throw new IllegalArgumentException("The value cannot be negative");
        } else if (x == 0) {
            return 1;
        }

        return x * calculateFactorial(x - 1);
    }
}


