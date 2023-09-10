package Soal4;
import java.util.Scanner;

public class GajiAgent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Gaji pokok agen
        int gajiPokok = 500000;

        // Harga setiap item
        int hargaItem = 50000;

        // Membaca jumlah penjualan bulan ini dari pengguna
        System.out.print("Masukkan jumlah penjualan bulan ini: ");
        int penjualanBulanIni = scanner.nextInt();

        // Menghitung bonus berdasarkan jumlah penjualan
        double bonus = 0;

        if (penjualanBulanIni >= 80) {
            // Bonus 35% jika penjualan di atas atau sama dengan 80 item
            bonus = 0.35 * penjualanBulanIni * hargaItem;
        } else if (penjualanBulanIni >= 40) {
            // Bonus 25% jika penjualan di atas atau sama dengan 40 item
            bonus = 0.25 * penjualanBulanIni * hargaItem;
        } else if (penjualanBulanIni >= 15) {
            // Bonus 10% untuk penjualan di atas atau sama dengan 15 item
            bonus = 0.10 * penjualanBulanIni * hargaItem;
        } else {
            // Denda pemotongan gaji pokok 15% jika penjualan di bawah 15 item
            bonus = -0.15 * (15 - penjualanBulanIni) * hargaItem;
        }

        // Menghitung total gaji
        double totalGaji = gajiPokok + bonus;

        // Mencetak total gaji
        System.out.println("Total gaji: Rp " + totalGaji);

        scanner.close();
    }
}
