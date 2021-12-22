import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max = 0;
        while (true) {
            System.out.println("Enter a number: ");
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int number = scanner.nextInt();
                if (number > max) {
                    max = number;
                }
                if (min == 0 || number < min) {
                    min = number;
                }
            } else {
                System.out.println("Invalid number");
                break;
            }
            scanner.nextLine();
        }
        scanner.close();
        System.out.println("Minimal number is " + min);
        System.out.println("Maximum number is " + max);
    }
}
