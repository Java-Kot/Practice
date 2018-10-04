import java.util.Scanner;

public class InserttoArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temp;
        int[] arr = new int[rNum()];
        for (int a: arr) {
            a = rNum();
            System.out.println(a);
        }
        System.out.println("Nhập số cần chèn");
        int x = sc.nextInt();
        System.out.println("Nhập vị trí cần chèn");
        int index = sc.nextInt();
        if (index <= 1 || index >= arr.length) {
            System.out.println("Nhập lại vị trí cần chèn");
            index = sc.nextInt();
        } else {
            arr[index - 1] = x;
            for (int i = index; i < arr.length; i++) {
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = (int)temp;
            }
        }
        for (int a: arr) {
            a = rNum();
            System.out.println(a);
        }
    }

    static int rNum() {
        int r = (int)Math.floor(Math.random() * 99);
        return r;
    }
}