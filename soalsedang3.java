import java.util.Random;
import java.util.Scanner;
public class soalsedang3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in); // untuk membaca input pengguna
        Random random = new Random(); // untuk menghasilkan angka secara acak

        String[] operators = {"*", "/", "%"}; // Operator perkalian, pembagian, dan modulus

        System.out.println("Selamat datang di Kuis Matematika!");
        System.out.println("Ketik 'exit' untuk menghentikan kuis.\n");

        while (true) {
            int num1 = random.nextInt(10) + 1; // Bilangan pertama (1-100)
            int num2 = random.nextInt(10) + 1; // Bilangan kedua (1-100)
            String operator = operators[random.nextInt(operators.length)]; // Operator acak

            System.out.printf("Berapa hasil dari: %d %s %d? ", num1, operator, num2);
            String userInput = scanner.nextLine();

            // Berhenti jika user mengetik 'exit'
            if (userInput.equalsIgnoreCase("exit")) {
                System.out.println("Terima kasih telah bermain! Sampai jumpa!");
                break;
            }

            // Hitung jawaban yang benar
            double correctAnswer;
            switch (operator) {
                case "*":
                    correctAnswer = num1 * num2;
                    break;
                case "/":
                    correctAnswer = (double) num1 / num2; // Pastikan hasil pembagian berbentuk desimal
                    break;
                case "%":
                    correctAnswer = num1 % num2;
                    break;
                default:
                    correctAnswer = 0;
            }

            try {
                double userAnswer = Double.parseDouble(userInput);
                if (Math.abs(userAnswer - correctAnswer) < 0.0001) { // Periksa kesalahan kecil untuk pembagian desimal
                    System.out.println("Benar!");
                } else {
                    System.out.printf("Salah! Jawaban yang benar adalah: %.2f\n", correctAnswer);
                }
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid! Masukkan angka atau ketik 'exit' untuk keluar.");
            }

            System.out.println(); // Baris baru untuk memisahkan soal berikutnya
        }
    }
}