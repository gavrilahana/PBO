package Soal7;
public class Array {
    public static void main(String[] args) {
        // One Dimensional Arrays
        int[] firstArray = {2, 5, 3};
        int[] secondArray = {9, 5, 3};
        int[] thirdArray = {2, 4, 9};
        int[] fourthArray = {10, 11, 12};
        int[] fifthArray = {13, 14, 15};
        int[] sixthArray = {16, 17, 18};
        int[] seventhArray = {19, 20, 21};
        int[] eighthArray = {22, 23, 24};
        int[] ninthArray = {25, 26, 27};

        // Two Dimensional Arrays
        int[][] twoDimensionalArray1 = {firstArray, secondArray, thirdArray};
        int[][] twoDimensionalArray2 = {fourthArray, fifthArray, sixthArray};
        int[][] twoDimensionalArray3 = {seventhArray, eighthArray, ninthArray};

        // Three Dimensional Array
        int[][][] threeDimensionalArray = {twoDimensionalArray1, twoDimensionalArray2, twoDimensionalArray3};

        // Mencetak isi array secara terformat
        for (int[][] twoDArray : threeDimensionalArray) {
            System.out.print("{{");
            for (int[] innerArray : twoDArray) {
                System.out.print("{");
                for (int i = 0; i < innerArray.length; i++) {
                    System.out.print(innerArray[i]);
                    if (i < innerArray.length - 1) {
                        System.out.print(" ");
                    }
                }
                System.out.print("}");
            }
            System.out.println(" }}");
        }
    }
}
