package week4;
import week1.Mahasiswa;
import java.util.Scanner;

public class Akademik {
	public static void main(String[] args) {
		int n;
		System.out.print("Masukkan jumlah data: ");
		
		//buat objek dari class scanner untuk menginput data
		
		Scanner inp = new Scanner(System.in);
		n = inp.nextInt();
		
		String[] nim = new String[n];
		String[] nama = new String[n];
		Double[] ipk = new Double[n];
		
		for(int i = 0; i < n; i++)
		{
			System.out.println("Data ke-"+(i+1));
			System.out.print("Masukkan NIM: ");
			nim[i] = inp.next();
			System.out.print("Masukkan Nama: ");
			nama[i] = inp.next();
			System.out.print("Masukkan IPK: ");
			ipk[i] = inp.nextDouble();
		}
		
		for (int i = 0; i < n; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            System.out.println("NIM: " + nim[i]);
            System.out.println("Nama: " + nama[i]);
            System.out.println("IPK: " + ipk[i]);
            System.out.println(); 
            }
	
	}
}
