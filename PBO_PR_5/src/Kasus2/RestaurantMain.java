package Kasus2;
import java.util.ArrayList;
import java.util.Scanner;

public class RestaurantMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Produk> daftarProduk = new ArrayList<>();
        ArrayList<Penjualan> daftarPemesanan = new ArrayList<>();

        // Menambahkan produk ke daftar
        daftarProduk.add(new Produk("Nasi Goreng", 25000));
        daftarProduk.add(new Produk("Mie Ayam", 20000));
        daftarProduk.add(new Produk("Soto Ayam", 22000));
        daftarProduk.add(new Produk("Soto Madura", 30000));
        daftarProduk.add(new Produk("Mie Goreng", 15000));
        daftarProduk.add(new Produk("Sop Buntut", 35000));
        daftarProduk.add(new Produk("Air Mineral", 5000));
        daftarProduk.add(new Produk("Teh Tawar", 6000));
        daftarProduk.add(new Produk("Teh Manis", 7000));
        daftarProduk.add(new Produk("Jus Jeruk", 9000));
        daftarProduk.add(new Produk("Jus Mangga", 10000));
        daftarProduk.add(new Produk("Jus Alpukat", 10000));

        boolean lanjutPesan = true;

        while (lanjutPesan) {
            // Tampilkan menu makanan
            System.out.println("Menu Makanan:");
            int index = 1;
            for (Produk produk : daftarProduk) {
                System.out.println(index + ". " + produk.getNamaProduk() + "\tRp. " + produk.getHarga());
                index++;
            }

            // Meminta input pilihan
            System.out.print("Pilih nomor menu yang ingin dipesan: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Membaca karakter newline

            if (pilihan >= 1 && pilihan <= daftarProduk.size()) {
                Produk produkDipesan = daftarProduk.get(pilihan - 1);
                System.out.print("Masukkan jumlah " + produkDipesan.getNamaProduk() + " yang ingin dipesan: ");
                int jumlah = scanner.nextInt();

                Penjualan pemesanan = new Penjualan(produkDipesan, jumlah);
                daftarPemesanan.add(pemesanan);

                System.out.println("Anda telah memesan " + produkDipesan.getNamaProduk() + " sebanyak " + jumlah + " buah.");
            } else {
                System.out.println("Nomor menu yang Anda pilih tidak valid.");
            }

            // Konfirmasi untuk memesan lagi
            System.out.print("Apakah Anda ingin memesan lagi? (ya/tidak): ");
            String jawaban = scanner.next();
            lanjutPesan = jawaban.equalsIgnoreCase("ya");
        }

        // Menampilkan detail pemesanan dan total bayar
        System.out.println("Detail Pemesanan:");
        double totalBayar = 0;
        for (Penjualan pemesanan : daftarPemesanan) {
            System.out.println(pemesanan.getProduk().getNamaProduk() + " x " + pemesanan.getQty() + "\tRp. " + pemesanan.getTotalHarga());
            totalBayar += pemesanan.getTotalHarga();
        }
        System.out.println("Total Bayar: Rp. " + totalBayar);
        
        // Tutup scanner
        scanner.close();
    }
}