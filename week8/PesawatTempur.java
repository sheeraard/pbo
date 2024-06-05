package week8;

public class PesawatTempur extends Pesawat 
{
	public String jenisSenjata;
	
	public PesawatTempur(int roda, String jenisSenjata, String tipe, int tahun, String warna)
	{
		super(roda, tahun, tipe, warna);
		this.jenisSenjata = jenisSenjata;	
	}
	
	public void tembak()
	{
		System.out.println("duar");
	}

}
