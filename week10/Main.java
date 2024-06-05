package week10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BangunDatar shape = null;

        System.out.println("Pilih jenis bangun datar:");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Segitiga");
        System.out.println("4. Lingkaran");
        System.out.print("Masukkan pilihan (1-4): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Masukkan sisi persegi: ");
                double sisiPersegi = scanner.nextDouble();
                shape = new Persegi(sisiPersegi);
                break;

            case 2:
                System.out.print("Masukkan panjang persegi panjang: ");
                double panjangPersegiPanjang = scanner.nextDouble();
                System.out.print("Masukkan lebar persegi panjang: ");
                double lebarPersegiPanjang = scanner.nextDouble();
                shape = new PersegiPanjang(panjangPersegiPanjang, lebarPersegiPanjang);
                break;

            case 3:
                System.out.print("Masukkan alas segitiga: ");
                double alasSegitiga = scanner.nextDouble();
                System.out.print("Masukkan tinggi segitiga: ");
                double tinggiSegitiga = scanner.nextDouble();
                shape = new Segitiga(alasSegitiga, tinggiSegitiga);
                break;

            case 4:
                System.out.print("Masukkan radius lingkaran: ");
                double radiusLingkaran = scanner.nextDouble();
                shape = new Lingkaran(radiusLingkaran);
                break;

            default:
                System.out.println("Pilihan tidak valid.");
                System.exit(0);
        }

        if (shape != null) {
            System.out.println("Luas: " + shape.luas());
            System.out.println("Keliling: " + shape.keliling());
        }

        scanner.close();
    }
}
