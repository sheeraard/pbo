package week8;

public class Kendaraan {
    private int roda;
    private int tahun;
    private String warna;

    // Constructor
    public Kendaraan(int roda, int tahun, String warna) {
        this.roda = roda;
        this.tahun = tahun;
        this.warna = warna;
    }

    // Method to make the vehicle move
    public void bergerak() {
        System.out.println("The vehicle is moving.");
    }

    // Getter methods
    public int getRoda() {
        return roda;
    }

    public int getTahun() {
        return tahun;
    }

    public String getWarna() {
        return warna;
    }
}

	


