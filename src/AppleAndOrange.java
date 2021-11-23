public class AppleAndOrange {

    public static void main(String[] args) {

        int[] apple = {2, 3, -4};
        int[] orange = {3, -2, -4};

        int a = 4, b = 12, t = 10, s = 7;

        int appleCount = 0;

        for (int i = 0; i < apple.length; i++) {
            int value = a + apple[i];
            if (value >= s && value <= t) {
                appleCount++;
            }
        }

        int orangeCount = 0;

        for (int i = 0; i < orange.length; i++) {
            int value = b + orange[i];
            if (value >= s && value <= t) {
                orangeCount++;
            }
        }

        System.out.println(appleCount);
        System.out.println(orangeCount);
    }
}
