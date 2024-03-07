package week1;

public class VolumeTabung {

	public static void main(String[] args) {
		//Diameter dan tinggi tabung
		double diameter = 5.0;
		double tinggi = 10.0;
		
		//Menghitung jari-jari
		double jariJari = diameter / 2;
		
		//Menghitung volume tabung
		double volume = Math.PI * jariJari * tinggi;
		
		//Menampilkan hasil
		System.out.println("Diameter tabung: " + diameter);
		System.out.println("Tinggi tabung: " + tinggi);
		System.out.println("Volume tabung: " + volume);

	}

}
