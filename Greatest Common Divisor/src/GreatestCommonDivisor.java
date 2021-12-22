public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        int greatestDivisor = 0;
        if (first < 10 || second < 10) {
            return -1;
        }
        if (first < second) {
            for (int i = 1; i <= first; i++) {
                if (first % i == 0 && second % i == 0) {
                    greatestDivisor = i;
                }
            }
        }
        if (second < first) {
            for (int i = 1; i <= second; i++) {
                if (first % i == 0 && second % i == 0) {
                    greatestDivisor = i;
                }
            }
        }
        return greatestDivisor;
    }
}
