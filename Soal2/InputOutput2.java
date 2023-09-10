package Soal2;
import java.util.Scanner;

public class InputOutput2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = new String[3];
        int[] nums = new int[3];
        int count = 0;

        while (count < 3) {
            System.out.print("Masukkan string dan integer (pisahkan dengan spasi): ");
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                break;
            }

            String[] parts = input.split(" ");

            if (parts.length == 2) {
                String str = parts[0];
                int num = Integer.parseInt(parts[1]);

                inputs[count] = str;
                nums[count] = num;

                count++;
            } else {
                System.out.println("Format input salah. Harap masukkan string dan integer.");
            }
        }

        System.out.println("================================");
        for (int i = 0; i < count; i++) {
            System.out.printf("%-15s%03d%n", inputs[i].toLowerCase(), nums[i]);
        }
        System.out.println("================================");

        scanner.close();
    }
}
