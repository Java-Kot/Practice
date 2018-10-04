import java.util.Scanner;

public class MatrixNhiphan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều cao");
        int rong = sc.nextInt();
        System.out.println("Nhập chiều rộng");
        int cao = sc.nextInt();
        for (int i = 0; i < rong; i++) {
            for (int j = 0; j < cao; j++) {
                System.out.print(r());
            }
            System.out.println("");
        }
    }

    static int r() {
        int x = (int)Math.floor(Math.random() * 2);
        return x;
    }
}
