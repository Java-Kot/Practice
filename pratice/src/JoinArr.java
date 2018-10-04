public class JoinArr {
    public static void main(String[] args) {
        double[] a = new double[3];
        double[] b = new double[3];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int)Math.floor(Math.random() * 99);
            b[i] = (int)Math.floor(Math.random() * 99);
        }
        double[] c = new double[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
            c[i + a.length] = b[i];
        }
        for (double x: c) {
            System.out.println(x);
        }
    }
}