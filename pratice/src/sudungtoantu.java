import java.util.Scanner;

public class sudungtoantu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chiều rộng:");
        double rong = sc.nextDouble();
        System.out.println("Nhập vào chiều dài:");
        double dai = sc.nextDouble();
        double s = rong * dai;
        System.out.println("Diện tích của hình chữ nhật là : " + s);
    }
}
