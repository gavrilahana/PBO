package Kasus1;

public class Restaurant {
    private RestaurantItem[] daftarMenu;
    private int jumlahItem;
    private static final int KAPASITAS_MENU = 20;

    public Restaurant() {
        daftarMenu = new RestaurantItem[KAPASITAS_MENU];
        jumlahItem = 0;
    }

    public void tambahMenuMakanan(String nama, double harga, int stok) {
        if (jumlahItem < KAPASITAS_MENU) {
            RestaurantItem item = new RestaurantItem(nama, harga, stok);
            daftarMenu[jumlahItem] = item;
            jumlahItem++;
        } else {
            System.out.println("Maaf, daftar menu sudah penuh.");
        }
    }

    public void tampilMenuMakanan() {
        for (int i = 0; i < jumlahItem; i++) {
            RestaurantItem item = daftarMenu[i];
            if (!item.isOutOfStock()) {
                System.out.println(item.getNamaMakanan() + "[" + item.getStok() + "]" + "\tRp. " + item.getHargaMakanan());
            }
        }
    }

    public void setHargaMakanan(int index, double harga) {
        if (index >= 0 && index < jumlahItem) {
            daftarMenu[index].setHargaMakanan(harga); // Perhatikan perubahan ini
        } else {
            System.out.println("Indeks menu tidak valid.");
        }
    }

    public static void main(String[] args) {
        Restaurant restoran = new Restaurant();
        restoran.tambahMenuMakanan("Nasi Goreng", 25000, 10);
        restoran.tambahMenuMakanan("Mie Ayam", 20000, 15);
        restoran.tambahMenuMakanan("Soto Ayam", 22000, 8);

        restoran.tampilMenuMakanan();
    }
}
