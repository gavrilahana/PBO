/* 
 * @author Gavrila Hana Simanjuntak
 */
package Strings;
import java.util.*;

public class Strings {
	public static String AIsLarger(String A, String B) {
        return A.compareTo(B) > 0 ? "Yes" : "No";
    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        char choice;

        do {
        System.out.print(" Masukkan String pertama : ");
        String A=input.next();
        System.out.print(" Masukkan String kedua : ");
        String B=input.next();
        
        /* Enter your code here. Print output to STDOUT. */
        System.out.println((A.length() + B.length()));
        System.out.println(AIsLarger(A, B));
        
        System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1) + " " + B.substring(0, 1).toUpperCase() + B.substring(1));
        System.out.print("Hitung nilai siswa lain? (y/n): ");
        choice = input.next().charAt(0);
        } while (choice == 'y' || choice == 'Y'); // melakukan pengulangan jika mengetikkan y
        input.close();
    }
}
