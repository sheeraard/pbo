package week10;

public class Segitiga extends BangunDatar {
    private double alas;
    private double tinggi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public double luas() {
        return 0.5 * alas * tinggi;
    }

    @Override
    public double keliling() {
        double hipotenusa = Math.sqrt((alas * alas) + (tinggi * tinggi));
        return alas + tinggi + hipotenusa;
    }
}
