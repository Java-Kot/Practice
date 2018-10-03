import java.util.Scanner;

public class convertmoney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double tigia = 23000;
        System.out.println("Nhập vào số tiền cần chuyển đổi:");
        double usd = sc.nextDouble();
//        double vnd = usd * tigia;
        System.out.printf("Với %.1f sẽ bằng: %.0f vnđ", usd, usd * tigia);
    }
}
