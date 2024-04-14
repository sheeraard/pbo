package week2;

public class Krs {
	String[] matakuliah = new String [5];
	int[] sks = new int[5];
	int totalsks = 0;
	
	public void setMataKuliah(String matkul, int index)
	{
		matakuliah[index] = matkul;
	}
	
	public void setSks(int kredit, int index) 
	{
		sks[index] = kredit;
	}
	
	public int sumOfSks()
	{
		int sum = 0;
		for(int i = 0; i < sks.length; i++)
		{
			sum = sum + sks[i];
		}
		return sum;
	}
	
	public void infoKrs()
	{
		for(int i = 0; i < matakuliah.length; i++)
		{
			System.out.println("Total SKS : "+ sumOfSks());
		}
	}
		
		public int getArraySize()
		{
			int panjang = 0;
			for(int i = 0; i < matakuliah.length; i++)
			{
				if(matakuliah[i].equals(null))
				{
					 panjang++;
				}
			}
			return panjang;
		
	}
}
