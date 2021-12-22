public class Main {
    public static void main(String[] args) {
        for (int i = 2; i < 9; i++) {
            System.out.println("10,000 at " + i + "% interest " + String.format
                    ("%.2f", calculateInterest(10000.0, i)));
        }
        System.out.println("----------------------------------------------------------------");
        for (int i = 8; i > 1; i--) {
            System.out.println("10,000 at " + i + "% interest " + String.format
                    ("%.2f", calculateInterest(10000.0, i)));
        }
        System.out.println("----------------------------------------------------------------");
        int primeNumberCounter = 0;
        for (int i = 50; i < 300; i++) {
            if (isPrime(i)) {
                System.out.println("Prime number found: " + i);
                primeNumberCounter++;
            }
            if (primeNumberCounter == 3) {
                break;
            }
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= (long) Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
