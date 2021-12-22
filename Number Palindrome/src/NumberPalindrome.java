public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int changedNumber = number;
        while (changedNumber != 0) {
            int lastDigit = changedNumber % 10;
            changedNumber /= 10;
            reverse *= 10;
            reverse += lastDigit;
        }
        if (reverse == number) {
            return true;
        }
        return false;
    }
}
