package week7;
//inherit dari person
public class Student extends Person{
	String nim;
	
	//method baru di subclass
	public String getNim() {
		return nim;
	}
	
	@Override
	public void identity()
	{
		System.out.println("NIM: "+getNim());
		super.identity();}
	}

