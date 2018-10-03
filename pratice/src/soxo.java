import java.util.Scanner;

public class soxo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double lotery = Math.floor(Math.random() * 99);
        System.out.println("Nhập số hàng chục:");
        int guessDigit1 = sc.nextInt();
        System.out.println("Nhập số hàng đơn vị:");
        int guessDigit2 = sc.nextInt();
        int guessfirst = guessDigit1 * 10 + guessDigit2;
        int guesssecond = guessDigit2 * 10 + guessDigit1;
        double hangchuc = Math.floor(lotery / 10);
        double hangdonvi = lotery % 10;
        if (guessfirst == lotery) {
            System.out.println("You WIN 10,000$ !!!");
        } else if (guesssecond == lotery) {
            System.out.println("You WIN 3000$");
        } else if (guessDigit1 == hangchuc || guessDigit1 == hangdonvi || guessDigit2 == hangchuc || guessDigit2 == hangdonvi) {
            System.out.println("You WIN 1000$");
        } else {
            System.out.println("You LOSE !!!");
        }
    }
}