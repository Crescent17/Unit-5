public class LargestPrime {
    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }
        int primeNumber = 0;

        for (int i = 2; i <= number / 2; i++) {
            boolean isPrime = true;
            if (number % i == 0) {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                    }
                    if (!isPrime) {
                        break;
                    }
                }
                if (isPrime == true) {
                    primeNumber = i;
                }
            }
        }
        if (primeNumber == 0) {
            return number;
        }
        return primeNumber;
    }
}
