public class Fibonacci {
    public int calculateFibonacci(int x){
        if (x < 0) {
            throw new IllegalArgumentException("The value cannot be negative");
        } else if (x <= 1) {
            return x;
        } else {
            return calculateFibonacci(x - 1) + calculateFibonacci(x - 2);
        }
    }
}
