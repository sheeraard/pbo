package week8;

public class Main {
	public static void main(String[] args)
	{
		Pesawat myPesawat = new Pesawat(3, 2015, "Red", "747");
		myPesawat.takeoff();
		System.out.println(myPesawat.getTipe() + " " + myPesawat.getWarna());
	}

}
