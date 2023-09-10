package Soal6;
import java.math.BigInteger;
import java.util.Scanner;

public class BigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca dua angka sebagai string
        String aStr = scanner.nextLine();
        String bStr = scanner.nextLine();

        // Membuat objek BigInteger dari string
        BigInteger a = new BigInteger(aStr);
        BigInteger b = new BigInteger(bStr);

        // Menghitung penjumlahan dan perkalian
        BigInteger sum = a.add(b);
        BigInteger product = a.multiply(b);

        // Mencetak hasil tanpa leading zeros
        System.out.println(sum.toString().replaceFirst("^0+(?!$)", ""));
        System.out.println(product.toString().replaceFirst("^0+(?!$)", ""));

        scanner.close();
    }
}
