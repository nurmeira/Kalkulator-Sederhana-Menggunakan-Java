package Minggu4.Tugas;
import java.util.Scanner;

public class Kalkulator1 {
    int hasilPertambahan;
    int hasilPengurangan;
    int hasilPerkalian;
    int hasilPembagian;

    private int angka1;
    private int angka2;
    
    public void setNumber1 (int a) {
       this.angka1= a ;
    }
    
    public void setNumber2 (int b) {
       this.angka2= b ;
    }

   public int getNumber1() {
    return angka1;
   }
   public int getNumber2() {
    return angka2;
   }

   public void pertambahan() {
      hasilPertambahan = angka1 + angka2;
   }

   public void pengurangan () {
     hasilPengurangan= angka1 - angka2;
    }

    int Perkalian (int a, int b) {
    return hasilPerkalian = a * b;
   }

   int pembagian(){
    return hasilPembagian = angka1 / angka2;
   }

public int getHasilPertambahan() {
    return hasilPertambahan;
}

public int getHasilPengurangan() {
    return hasilPengurangan;
}

public int getHasilPerkalian() {
    return hasilPerkalian;
}

public int getHasilPembagian() {
    return hasilPembagian;
}


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Kalkulator1 kalkulator = new Kalkulator1();
        System.out.print(" Inputkan angka : ");
        kalkulator.angka1 = input.nextInt();
        System.out.print(" Inputkan angka : ");
        kalkulator.angka2 = input.nextInt();
        kalkulator.pertambahan();
        kalkulator.pengurangan();
        kalkulator.Perkalian(kalkulator.angka1, kalkulator.angka2);
        kalkulator. pembagian();

        System.out.println("Angka 1: " + kalkulator.getNumber1());
        System.out.println("Angka 2: " + kalkulator.getNumber2());
        System.out.println("Hasil pertambahan : " + kalkulator.getHasilPertambahan());
        System.out.println("Hasil pengurangan : " + kalkulator.getHasilPengurangan());
        System.out.println("Hasil perkalian : " + kalkulator.getHasilPerkalian());
        System.out.println("Hasil pembagian : " + kalkulator.getHasilPembagian());
        
       
        }
}