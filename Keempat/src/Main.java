public class Main {
    public static void main(String[] args) {
        // Rumus yang digunakan adalah (a + bi) * (c + di) / (e + fi)
        double a = 2;
        double b = 3;
        double c = 4;
        double d = 5;
        double e = 6;
        double f = 7;

        Complex x = new Complex(a, b);
        Complex y = new Complex(c, d);
        Complex z = new Complex(e, f);

        Complex hasil = x.multiply(y).divide(z);

        System.out.println("Hasil dari (" + a + " + " + b + "i) * (" + c + " + " + d + "i) / (" + e + " + " + f + "i) adalah " + hasil);
    }
}