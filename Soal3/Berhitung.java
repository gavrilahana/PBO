package Soal3;
import java.util.Scanner;

public class Berhitung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean repeat = true;

        while (repeat) {
            // Membaca input dari pengguna
            System.out.print("Masukkan A operator B: ");
            int A = scanner.nextInt();
            String operator = scanner.next();
            int B = scanner.nextInt();

            int result = 0;

            // Melakukan operasi sesuai dengan operator yang diberikan
            switch (operator) {
                case "+":
                    result = A + B;
                    break;
                case "-":
                    result = A - B;
                    break;
                case "*":
                    result = A * B;
                    break;
                case "/":
                    result = A / B;
                    break;
                case "%":
                    result = A % B;
                    break;
                default:
                    System.out.println("Error: Operator tidak valid.");
                    System.exit(1);
            }

            // Mencetak hasil operasi
            System.out.println("Hasil: " + result);

            // Meminta pengguna untuk mengulangi proses
            System.out.print("Apakah Anda ingin mengulangi (y/n)? ");
            String response = scanner.next().trim().toLowerCase();
            repeat = response.equals("y");
        }

        scanner.close();
    }
}
