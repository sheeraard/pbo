package week5;
import week1.Mahasiswa;
import java.util.*;

public class MahasiswaArrayList 
{
	public static void main(String[] args)
	{
		Mahasiswa mhs = new Mahasiswa("Budi", "12345");
		mhs.insertNilai(86.0);
		mhs.insertNilai(99.0);
		mhs.insertNilai(90.0);
		mhs.insertNilai(85.0);
		mhs.insertNilai(100.0);
		mhs.getIdentitas();
	}
}
