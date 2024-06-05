package week10;

public class Lingkaran extends BangunDatar {
    private double radius;
    private static final double PI = 3.14;

    public Lingkaran(double radius) {
        this.radius = radius;
    }

    @Override
    public double luas() {
        return PI * radius * radius;
    }

    @Override
    public double keliling() {
        return 2 * PI * radius;
    }
}
