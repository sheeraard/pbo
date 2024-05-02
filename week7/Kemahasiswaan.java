package week7;
import week1.Mahasiswa;

public class Kemahasiswaan {

	public static void main(String[] args) {
		MahasiswaAktif ma = new MahasiswaAktif("Sherard Varasya", "A11.2022.14450", "30-12-2003", 20, 4);
		
		Mahasiswa m = new Mahasiswa("Lucyna" ,"A11.2022.14451");
		
		ma.getIdentitas();
		m.getIdentitas();

	}

}
