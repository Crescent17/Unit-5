public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }
        int perfectNumberSum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                perfectNumberSum += i;
            }
        }
        if (perfectNumberSum == number) {
            return true;
        }
        return false;
    }
}
