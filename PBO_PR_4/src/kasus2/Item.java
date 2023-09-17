package kasus2;

public class Item {
	private String name;
	private Item() {
	name = "Ipin";
	}
	public Item(String name) { 
	this(); //untuk memanggil constructor lain di kelas yang sama
	System.out.println(this.name);
	}
}

