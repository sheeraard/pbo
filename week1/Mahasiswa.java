package week1;
import java.util.ArrayList;
import java.util.Iterator;
import week5.Matakuliah;

public class Mahasiswa {
	
	private String nama;
	private String nim;
	private ArrayList<Double> nilai = new ArrayList<Double>();
	private ArrayList<Matakuliah> mk = new ArrayList<Matakuliah>();

	public Mahasiswa(String nama, String nim) {
		this.nama = nama;
		this.nim = nim;		
	}
	
	
	public void insertNilai(Double nl)
	{
		nilai.add(nl);
	}
	
	public void insertMatkul(String matkul, String kelompok, int sks)
	{
		mk.add(new Matakuliah(matkul, kelompok, sks));
	}

	public void belajar()
	{
		System.out.println(this.nama+ "belajar");
	}
	
	public void absen()
	{
		System.out.println(this.nama+"dengan nim : "+this.nim+"sedang absen");
	}
	
	
	public void getIdentitas() {
		System.out.println("Nama mahasiswa : "+nama);
		System.out.println("Nim mahasiswa : "+nim);
		getNilai();

	}
	
	public String getNama() {
		return nama;
	}
	
	public String getNim() {
		return nim;
	}
	
	public String getNilai() {
		Iterator<Double> it = nilai.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		return nama;
	}
	
	public void getMataKuliah()
	{
			System.out.println("Daftar Mata Kuliah: ");
			/* 
			 for(Matakuliah matkul : mk)
			{
				System.out.println(matkul.getNamaMatkul()+" - "+matkul.getKelompok()+" - "+matkul.getSks());
			}
			*/
			
			Iterator<Matakuliah> matkul = mk.iterator();
			while(matkul.hasNext())
			{
				Matakuliah m = matkul.next();
				System.out.println(m.getNamaMatkul()+ " - "+m.getKelompok()
				+" - "+m.getSks());
			}
		}
	}


