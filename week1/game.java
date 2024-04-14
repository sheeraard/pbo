package week1;

public class Game {
    String namagame, tahun;
    int harga;

    public void sold() {
        System.out.println(this.namagame + " sold");
    }

    public void absen() {
        System.out.println(this.namagame + " absen");
    }

    public void getIdentitas() {
        System.out.println("Nama game: " + this.namagame);
        System.out.println("Tahun game: " + this.tahun);
        System.out.println("Harga game: " + this.harga);
    }
}
