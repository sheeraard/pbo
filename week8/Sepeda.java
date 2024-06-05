package week8;

public class Sepeda extends Kendaraan{
	private String jenis;
	private String merek;
	
	public Sepeda(String jenis, String merek, String warna, int tahun, int roda )
	{
		super(roda, tahun, warna);
		this.jenis = jenis;
		this.merek = merek;
	}
	
	public void pedal()
	{
		System.out.println("Pedalling");
	}
	public void rem()
	{
		System.out.println("Slows down");
	}
	
	public String getJenis()
	{
		return jenis;
	}
	
	public String getMerek()
	{
		return merek;
	}
	
}

