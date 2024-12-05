import java.util.Scanner;

public class soalsedang2 {
    static void volumeTabung(double r , double t){
        double phi = 3.14;
        double result = phi * r * r * t;
        System.out.println("volume tabung: "+ result);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // input  jari jari
        System.out.println("masukkan nilai r");
        double r = input.nextDouble();

        // input tinggi
        System.out.println("masukkan nilai t");
        double t = input.nextDouble();

        // memanggil method untuk menghitung volume tabung
        volumeTabung(r, t);
        


    }
}
