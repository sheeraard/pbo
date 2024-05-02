package week7;
import week1.Mahasiswa;
import java.time.Period;
import java.util.Locale;

public class MahasiswaAktif  extends Mahasiswa{

	public int usia;
	public int semester;
	
	public MahasiswaAktif (String nama, String nim, String tanggal_lahir, int usia, int semester)
{
		super(nama, nim, tanggal_lahir, usia, semester);
		this.semester = semester;
}
	
	//overriding
	
	public void getIdentitas()
	{
		System.out.println("Nama mahasiswa: "+super.getNama());
		System.out.println("NIM : "+super.getNim());
		System.out.println("Tanggal Lahir: "+super.getTanggal_lahir());
		System.out.println("Usia : "+super.getUsia());
		System.out.println("Semester : "+super.getSemester());
	}

	

}
