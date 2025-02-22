import java.util.Scanner;

public class BilanganTerbesar {
    public static void main(String[] args) { 
        
        Scanner inputObjek = new Scanner(System.in);
        
        //deklarasi variabel
        int angka1, angka2, angka3;
        
        //input dari user
        System.out.println("Masukan angka ke-1 : ");
        angka1 = inputObjek.nextInt();
        System.out.println("Masukan angka ke-2 : ");
        angka2 = inputObjek.nextInt();
        System.out.println("Masukan angka ke-3 : ");
        angka3 = inputObjek.nextInt();
       
        
        int terbesar = angka1;

        //mencari bilangan terbesar
        if (angka2 > terbesar) {
            terbesar = angka2;
        }
        if (angka3 > terbesar) {
            terbesar = angka3;
        }

        System.out.println("Yang terbesar adalah: " + terbesar);
    }
}
