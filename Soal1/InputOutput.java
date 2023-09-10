package Soal1;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean repeat = true;
        
        while (repeat) {
            // Membaca input dari pengguna
            System.out.print("Masukkan string: ");
            String input = scanner.nextLine();

            // Membuat pola regex untuk mencocokkan token (huruf alfabetik Inggris)
            Pattern pattern = Pattern.compile("[A-Za-z]+");
            Matcher matcher = pattern.matcher(input);

            int tokenCount = 0;

            // Mencetak jumlah token dan setiap token pada baris baru
            while (matcher.find()) {
                String token = matcher.group();
                System.out.println(token);
                tokenCount++;
            }

            // Mencetak jumlah total token
            System.out.println("Jumlah token: " + tokenCount);

            // Meminta pengguna untuk mengulangi proses
            System.out.print("Apakah Anda ingin mengulangi (y/n)? ");
            String response = scanner.nextLine().trim().toLowerCase();
            repeat = response.equals("y");
        }

        System.out.println("Terima kasih!");
        scanner.close();
    }
}
