package kasus1;

public class barang {
	String kode_barang;
	String nama_barang;
	private int stok; 
	/*stok akan dienkapsulasi dengan menggunakan variabel privat 
	untuk melarang penggunaan operasi matematika selain tambah */
	
	public int getStok() {
		return stok; //untuk mendapatkan stok setelah menambahkan kuantitas
	}
	
	public void setStok(int stok) {
		this.stok += stok; //untuk mengatur stok dengan menambahkakn kuantitas
	}
	
	public barang (String kode, String nama, int stk) {
		kode_barang = kode;
		nama_barang = nama;
		stok = stk;
	}
}
