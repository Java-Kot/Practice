import java.util.Scanner;

public class dateinmonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 tháng bất kì");
        int month = sc.nextInt();
        if (month < 13 && month > 0) {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("Tháng " + month + " có 31 ngày !");
                    break;
                case 2:
                    System.out.println("Tháng 2 có thể có 28 hoặc 29 ngày !");
                    break;
                default:
                    System.out.println("Tháng " + month + " có 30 ngày !");
            }
        } else {
            System.out.println("Làm gì có tháng " + month);
        }
    }
}
