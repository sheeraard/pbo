package responsi1;

import java.util.Scanner;

public class Student {
    private String nama;
    private String alamat;
    private String nim;

    public void inputMahasiswa() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama Mahasiswa: ");
        nama = scanner.nextLine();
        System.out.print("Masukkan alamat Mahasiswa: ");
        alamat = scanner.nextLine();
        System.out.print("Masukkan NIM Mahasiswa: ");
        nim = scanner.nextLine();
        scanner.close();
    }

    public double hitungPembayaran(double spp, double sks, double modul) {
        // Calculate total payment based on SPP, SKS, and Modul
        return spp + sks + modul;
    }
}
