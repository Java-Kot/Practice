import java.util.Scanner;

public class Laivay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double money = 1.0;
        int month = 1;
        double interset_rate = 1.0;
        System.out.println("Enter investment amount: ");
        money = sc.nextDouble();
        System.out.println("Enter annual interest rate in percentage: ");
        interset_rate = sc.nextDouble();
        double total_interset = 0;
        for(int i = 0; i < month; i++){
            total_interset = money * (interset_rate/100)/12 * 3;
        }
        System.out.println("Total of interset: " + total_interset);
    }
}