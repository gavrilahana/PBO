package kasus1;

public class inventori {
	barang[] barangs;
	void initBarang() {
	barangs = new barang[2];
	barangs[0] = new barang("001", "Baju", 10); //barang pertama
	barangs[1] = new barang("002", "Celana", 20); //barang kedua
	}
	void showBarang() {
	System.out.println(barangs[0].nama_barang + "(" + barangs[0].getStok() + ")"); 
	System.out.println(barangs[1].nama_barang + "(" + barangs[1].getStok() + ")");
	}
	
	void pengadaan() {
		initBarang();
		//menambahkan stok
		barangs[0].setStok(10); //menambah 10 stok
		barangs[1].setStok(20); //menambah 20 stok
		showBarang(); //menampilkan nomor dan nama setelah menambahkan stock baru
	}

	public static void main(String[] args) { 
	inventori beli = new inventori(); 
	beli.pengadaan();
	}
}
