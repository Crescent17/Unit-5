public class NumberToWords {
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        int reversedNumber = reverse(number);
        for (int i = 1; i <= getDigitCount(number); i++) {
            switch (reversedNumber % 10) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("invalid");
                    break;
            }
            reversedNumber /= 10;
        }
    }

    public static int reverse(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            reversedNumber += lastDigit;
            if (number / 10 != 0) {
                reversedNumber *= 10;
            }
            number /= 10;
        }
        return reversedNumber;
    }

    public static int getDigitCount(int number) {
        int digitCounter = 0;
        if (number < 0) {
            return -1;
        }
        do {
            number /= 10;
            digitCounter++;
        }
        while (number != 0);
        return digitCounter;
    }
}