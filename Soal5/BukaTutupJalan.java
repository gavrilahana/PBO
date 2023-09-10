package Soal5;

import java.util.Scanner;

public class BukaTutupJalan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Hasil;
		String SatukanAngka;
		long Lampu ;

		for(int i =0;i<2;i++) {
			
			Scanner Scan = new Scanner(System.in);
			SatukanAngka = Scan.nextLine();
			
			String[] Convert = SatukanAngka.split("[ ]+");
			Hasil = Convert[0] + Convert[1] + Convert[2] + Convert[3];
			Lampu = Long.parseLong(Hasil);
			
			Lampu -= 999999;
			
			if(Lampu % 5 != 0 ){
				System.out.println("berhenti");
			}else{
				System.out.println("jalan");
			}
			System.out.println();
		}
	}

}