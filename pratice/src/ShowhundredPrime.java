public class ShowhundredPrime {
    public static void main(String[] args) {
        int i = 3;
        int count = 0;
        System.out.println(2);
        while (count < 100) {
            boolean flag = true;
            for (int j = 2; j < (i / 2); j++) {
                if (i % j == 0) {
                    flag = false;
                }
            }
            if (flag) {
                System.out.println(i);
                count++;
            }
            i++;
        }
    }
}
