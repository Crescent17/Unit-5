public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int numberCounter = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
                numberCounter++;
                sum += i;
            }
            if (numberCounter == 5) {
                break;
            }
        }
        System.out.println("--------");
        System.out.println("Sum = " + sum);
    }
}
