import java.util.Scanner;
public class soalmudah2 {
    public static void main(String[] args) {

        // Membuat scanner untuk membaca input
        Scanner input = new Scanner (System.in);

        System.out.println("masukan batas atas");
        int atas = input.nextInt();

        System.out.println("masukan batas bawah");
        int bawah = input.nextInt(); 

        for (int i = atas; i <= bawah; i++)

        if (i % 2 == 0){
            System.out.println( i+ " adalah bilangan genap");

        }else{
            System.out.println(i + " adalah bilangan ganjil"); // Jika ganjil, akan masuk ke dalam else
       
        }

    }
}
