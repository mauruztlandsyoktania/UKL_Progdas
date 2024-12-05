import java.util.Scanner;
public class soalmudah3 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println(" Masukkan Jumlah Bilangan!");
        int jumlah = input.nextInt();

        for (int a = jumlah; a >= 2; a--) {
            if (a % 3 == 0) {
                System.out.println(a + ". saya anak angkatan 33");
            } else if (a % 2 == 0) {
                System.out.println(a + ". saya anak moklet");
            } else {
                System.out.println(a + ". saya anak wikusama");
            }
        }
        System.out.println("1. saya senang");
    }
}
