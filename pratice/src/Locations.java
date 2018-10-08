import java.util.Scanner;

public class Locations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập hàng và cột (row,coloumn)");
        double[] inputRL = getNumberFormUse(sc.nextLine());
        double[][] inputRay = new double[(int) inputRL[1]][(int) inputRL[0]];
        for (int i = 0; i < inputRL[1]; i++) {
            System.out.println("row " + (i + 1) + ": ");
            for (int j = 0; j < inputRL[0]; j++) {
                inputRay[i][j] = sc.nextDouble();
                System.out.println("ok: " + inputRay[i][j]);
            }
            System.out.print("\n");
        }
        System.out.println("input done!");
        Location maxInform = Location.locateLargest(inputRay);
        System.out.println("max is:"+maxInform.maxValue);
        System.out.println("at row: "+ maxInform.row);
        System.out.println("at colunm: "+maxInform.colunm);
    }

    public static double[] getNumberFormUse(String input) {
        double[] outRay = new double[input.split(",").length];
        int index = 0;
        for (String x : input.split(",")) {
            outRay[index] = Double.parseDouble(x);
            index++;
        }
        return outRay;
    }
}

class Location {
    public int row;
    public int colunm;
    public double maxValue;

    public Location(int row, int colunm, double maxValue) {
        this.row = row;
        this.colunm = colunm;
        this.maxValue = maxValue;
    }

    public static Location locateLargest(double[][] array) {
        double[] outRay = {1, 1, 0};
        double max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                    outRay[0] = i;
                    outRay[1] = j;
                }
            }
        }
        outRay[2] = max;
        return new Location((int) outRay[0], (int) outRay[1], outRay[2]);

    }
}