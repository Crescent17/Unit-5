public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        int bigCountWeight = 5;
        if (bigCount == 0) {
            return smallCount >= goal;
        }
        if (goal > bigCount * bigCountWeight + smallCount) {
            return false;
        }
        if (goal % bigCountWeight == 0) {
            if (goal <= bigCountWeight * bigCount) {
                return true;
            } else {
                return goal <= bigCountWeight * bigCount + smallCount;
            }
        }
        for (int i = 1; i < bigCount; i++) {
            if (smallCount >= goal % (i * bigCountWeight)) {
                return true;
            }
        }
        return false;
    }
}
