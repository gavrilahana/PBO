package Kasus1;

public class RestaurantItem {
    private String namaMakanan;
    private double hargaMakanan;
    private int stok;

    public RestaurantItem(String namaMakanan, double hargaMakanan, int stok) {
        this.namaMakanan = namaMakanan;
        this.hargaMakanan = hargaMakanan;
        this.stok = stok;
    }

    public String getNamaMakanan() {
        return namaMakanan;
    }

    public double getHargaMakanan() {
        return hargaMakanan;
    }

    public int getStok() {
        return stok;
    }

    public boolean isOutOfStock() {
        return stok == 0;
    }

    public void setHargaMakanan(double harga) {
        this.hargaMakanan = harga;
    }
}
