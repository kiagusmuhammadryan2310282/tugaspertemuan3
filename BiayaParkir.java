import java.util.Scanner;

public class BiayaParkir {
    public static void main(String args[]) {
        Scanner inputObjek = new Scanner(System.in);
        
        //deklarasi variabel
        int jamMasuk, jamKeluar;
        
        //input dari user
        System.out.print("Masukan jam masuk parkir (1-12) : ");
        jamMasuk = inputObjek.nextInt();
        System.out.print("Masukan jam keluar parkir (1-12) : ");
        jamKeluar  = inputObjek.nextInt();
        
        int lamaParkir;
        
        //menghitung lama parkir
        if (jamKeluar >= jamMasuk) 
        {
            lamaParkir = jamKeluar - jamMasuk;
        }
        else 
        {
            lamaParkir = (12 - jamMasuk) + jamKeluar; 
        }

        
        int tarifParkir;
        
        //menghitung tarif parkir
        if(lamaParkir <= 2)
        {
            tarifParkir = 1500; 
        }
        else
        {
            tarifParkir = 1500 + (lamaParkir - 2) * 1000;
        }
        
        System.out.println("Jam Masuk : " + jamMasuk);
        System.out.println("Jam Keluar : " + jamKeluar);
        System.out.println("Lama Parkir  : " + lamaParkir + " jam");
        System.out.println("Tarif Parkir : Rp" + tarifParkir);
    }
}
