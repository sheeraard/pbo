package week6;
import java.util.Scanner;

class Pegawai {
	private String nama;
	private String departemen;
	private int usia;
	private double gaji;
	private int masakerja;
	
	public Pegawai(String nama, String departemen, int usia, double gaji, int masakerja){
		this.nama = nama;
		this.departemen = departemen;
		this.usia = usia;
		this.gaji = gaji;
		this.masakerja= masakerja;
	}
	
	public String getNama(){
		return nama;
	}
	public String getDepartemen(){
		return departemen;
	}
	public int getUsia() {
		return usia;
	}
	public double getGaji() {
		return gaji;
	}
	public int getMasakerja() {
		return masakerja;
	}
	public void getNama(String nama){
		this.nama = nama;
	}
	public void getDepartemen(String departemen){
		this.departemen = departemen;
	}
	public void getUsia(int usia) {
		this.usia = usia;
	}
	public void getGaji(double gaji) {
		this.gaji = gaji;
	}
	public void getMasakerja(int masakerja) {
		this.masakerja = masakerja;
	}
	
	public double HitungTHR() {
		double thr;
		if (masakerja < 1) {
			thr = 0.1 * 5 * gaji;
		} else if (masakerja < 5) {
			thr = 0.2 * 5 * gaji;
		} else {
			thr = 0.35 * 5 * gaji;
		}
		if (gaji > 5000000) {
			thr -= 0.01 * thr;
		}
		return thr;
	}
	
		public static void main(String[] args) {
			Scanner scanner = new
		Scanner(System.in);
		
		Pegawai[] staf = new Pegawai[3];
		for (int i=0; i<3; i++) {
			System.out.println("Input staf no. " + (i + 1) + ":");
			System.out.print("Nama : ");
			String nama = scanner.nextLine();
			System.out.print("Departemen : ");
			String departemen = scanner.nextLine();
			System.out.print("Usia : ");
			int usia = scanner.nextInt();
			System.out.print("Gaji : ");
			double gaji = scanner.nextDouble();
			System.out.print("Masa Kerja : ");
			int masakerja = scanner.nextInt();
		}
		}

	}
	



