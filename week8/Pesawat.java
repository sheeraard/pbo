package week8;

public class Pesawat extends Kendaraan {
	private String tipe;
	
	public Pesawat(int roda, int tahun, String warna, String tipe) 
	{
		super(roda, tahun, warna);
		this.tipe = tipe;
	}
	
	public void takeoff()
	{
		System.out.println("Plane has took off");
	}
	
	public void land()
	{
		System.out.println("Plane has landed");
	}
	
	public String getTipe()
	{
		return tipe;
	}
}


