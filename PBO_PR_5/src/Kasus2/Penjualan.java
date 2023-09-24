package Kasus2;

class Penjualan {
    private Produk produk;
    private int qty;

    public Penjualan(Produk produk, int qty) {
        this.produk = produk;
        this.qty = qty;
    }

    public Produk getProduk() {
        return produk;
    }

    public int getQty() {
        return qty;
    }

    public double getTotalHarga() {
        return produk.getHarga() * qty;
    }
}
