import java.util.Scanner;

public class PeriksaBilangan {
    public static void main(String args[]) {
        Scanner inputObjek = new Scanner(System.in);
        
        //deklarasi variabel
        int a, b, c;
        
        //input dari user
        System.out.print("Masukan bilangan A : ");
        a = inputObjek.nextInt();
        System.out.print("Masukan bilangan B : ");
        b = inputObjek.nextInt();
        System.out.print("Masukan bilangan C : ");
        c = inputObjek.nextInt();
        
        //cek bilangan a
        if(a>999 && a<10000)
        {
            System.out.println("Bilangan A : " + a + " adalah ribuan");
        }
        else{
            System.out.println("Bilangan A : " + a + " bukan ribuan");
        }
        
        //cek bilangan b
        if(b>999 && b<10000)
        {
            System.out.println("Bilangan B : " + b + " adalah ribuan");
        }
        else{
            System.out.println("Bilangan B : " + b + " bukan ribuan");
        }
        
        //cek bilangan c
        if(c>999 && c<10000)
        {
            System.out.println("Bilangan C : " + c + " adalah ribuan");
        }
        else{
            System.out.println("Bilangan C : " + c + " bukan ribuan");
        }
    }
}
