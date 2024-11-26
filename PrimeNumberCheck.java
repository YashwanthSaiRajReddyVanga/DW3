public class PrimeNumberCheck {
    public static void main(String[] args) {
        int num = 29; // Change this value to check different numbers

        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // Numbers <= 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Divisible by a number other than 1 and itself
            }
        }
        return true; // Prime if no divisors found
    }
}
