import java.util.Scanner;

public class saynumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 số trong khoảng  0 - 999");
        int num = sc.nextInt();
        String saynum = "";
        if (num < 20) {
            switch (num) {
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("night");
                    break;
                case 10:
                    System.out.println("ten");
                    break;
                case 11:
                    System.out.println("elevent");
                    break;
                case 12:
                    System.out.println("twelve");
                    break;
                case 13:
                    System.out.println("thirteen");
                    break;
                case 14:
                    System.out.println("fourteen");
                    break;
                case 15:
                    System.out.println("fifteen");
                    break;
                case 16:
                    System.out.println("sixteen");
                    break;
                case 17:
                    System.out.println("seventeen");
                    break;
                case 18:
                    System.out.println("eighteen");
                    break;
                case 19:
                    System.out.println("nineteen");
                    break;
            }
//        } else if (num < 100) {
//            int hangchuc;
        }
    }

//    hangdonvi(double x) {
//        double donvi;
//        if (x > 10) {
//            donvi = x % 10;
//        } else (x > 100) {
//            donvi = x % 100;
//        }
//        String sodv;
//        switch (donvi){
//            case 1:
//                sodv = "one";
//                return sodv;
//                break;
//            case 2:
//                sodv = "two";
//                return sodv;
//                break;
//            case 3:
//                sodv = "three";
//                return sodv;
//                break;
//            case 4:
//                sodv = "four";
//                return sodv;
//                break;
//            case 5:
//                sodv = "five";
//                return sodv;
//                break;
//            case 6:
//                sodv = "six";
//                return sodv;
//                break;
//            case 7:
//                System.out.println("seven");
//                break;
//            case 8:
//                System.out.println("eight");
//                break;
//            case 9:
//                System.out.println("night");
//                break;
//        }
}
