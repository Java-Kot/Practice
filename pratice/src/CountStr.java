import java.util.Scanner;

public class CountStr {
    public static void main(String[] args) {
        System.out.println("Nhap vao mot chuoi: ");
        Scanner input = new Scanner(System.in);
        String ct = input.nextLine();
        System.out.println(ct.length());
//        int i = 0;
//        for (int j = 0; j < ct.length(); j++) {
//            if (j == ct.length() - 1) {
//                i += 0;
//            } else {
//                if (ct.charAt(j) == ' ') {
//                    if ((ct.charAt(j + 1) == '\n') || (ct.charAt(j + 1) == ' ')) {
//                        i += 0;
//                    } else {
//                        i++;
//                    }
//                }
//            }
//        }
//        if (ct.charAt(0) == ' ') {
//            System.out.println(i);
//        } else {
//            System.out.println(i + 1);
//        }
    }
}