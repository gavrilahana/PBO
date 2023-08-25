//GAVRILA HANA SIMANJUNTAK -- 221511011

package com.welcome;

public class welcome {

	public static void main(String[] args) 
	{
		String greeting = "Welcome to Core Java!";
		System.out.println(greeting); //menampilkan greeting
		for (int i = 0; i < greeting.length(); i++)
			System.out.print("=");
		//melakukan pengulangan "=" sampai i<greeting.length
		System.out.println();
	}
}
