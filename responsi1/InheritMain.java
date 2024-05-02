package responsi1;

public class InheritMain {
	public static void main(String[] args) {
		//Example usage
		Student student = new Student();
		student.inputMahasiswa();
		
		double spp = 2250000;
		double sks = 5000000;
		double modul = 200000;
		
		double totalPayment = student.hitungPembayaran(spp, sks, modul);
			System.out.println("Total payment: Rp. "+totalPayment);
			
			Person person = new Person();
			person.setHobby("Membaca");
			person.displayHobby();
	}

}
