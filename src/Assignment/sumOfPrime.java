package Assignment;

public class sumOfPrime {

    public static void main(String[] args) {
        int sum = 0;

        for (int num = 2; num <= 10; num++) {
            if (isPrime(num)) {
                sum += num;
            }
        }

        System.out.println("The sum of all prime numbers between 1 and 10 is: " + sum);
    }

    // Function to check if a number is prime
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
