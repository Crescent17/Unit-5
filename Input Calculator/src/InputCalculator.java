import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        int sum = 0;
        long average = 0;
        int counter = 0;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                counter++;
                sum += scanner.nextInt();
                average = sum / counter;
            } else {
                System.out.println("SUM = " + sum + " AVG = " + average);
                break;
            }
        }
    }
}
