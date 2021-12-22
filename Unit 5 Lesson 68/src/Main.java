public class Main {
    public static void main(String[] args) {
        int number = 4;
        int finishNumber = 20;
        int counterOfEvenNumbers = 0;
        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            counterOfEvenNumbers++;
            System.out.println("Even number: " + number);
            if (counterOfEvenNumbers == 5) {
                break;
            }
        }
        System.out.println("------------------------------");
        System.out.println("Even numbers found: " + counterOfEvenNumbers);
    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }
}
