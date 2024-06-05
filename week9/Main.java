package week9;

public class Main {
    public static void main(String[] args) {
   
        BangunDatar persegi = new BangunDatar(5); 
        BangunDatar persegipanjang = new BangunDatar(5, 8);
        BangunDatar segitiga = new BangunDatar(4, 3); 
        BangunDatar lingkaran = new BangunDatar(7);

   
        int luasPersegi = persegi.luas(5);
        int kelilingPersegi = persegi.keliling(5);
        int luasPersegiPanjang = persegipanjang.luas(5, 8); 
        int kelilingPersegiPanjang = persegipanjang.keliling(5,8);
        double luasSegitiga = segitiga.luas(4.0, 3.0); 
        double hipotenusa = segitiga.hipotenusa(3.0, 4.0);
        double kelilingSegitiga = segitiga.keliling(hipotenusa, 3.0, 4.0);
        double luasLingkaran = lingkaran.luas(7.0); 
        double kelilingLingkaran = lingkaran.keliling(7.0);

        

        System.out.println("Luas persegi: " + luasPersegi);
        System.out.println("Keliling persegi: " + kelilingPersegi);
        System.out.println("Luas persegi panjang: " + luasPersegiPanjang);
        System.out.println("Keliling persegi panjang: " + kelilingPersegiPanjang);
        System.out.println("Luas segitiga: " + luasSegitiga);
        System.out.println("Keliling segitiga: " + kelilingSegitiga);
        System.out.println("Luas lingkaran: " + luasLingkaran);
        System.out.println("Keliling lingkaran: " + kelilingLingkaran);
    }
}
