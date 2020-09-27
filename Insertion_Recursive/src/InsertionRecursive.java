import java.util.Arrays;
import java.util.Scanner;

class InsertionRecursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arrayString = sc.nextLine().split(" ");
        int[] array = new int[arrayString.length];

        for (int i = 0; i < arrayString.length; i++) {
            array[i] = Integer.parseInt(arrayString[i]);
        }

        insertionSortRecursive(array,0, array.length-1);

    }

    public static void insertionSortRecursive(int[] array, int leftIndex, int rightIndex) {

        if (leftIndex < rightIndex) {
            int chave = array[leftIndex + 1];
            int i = leftIndex;
            while (i > -1 && array[i] > chave) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = chave;
            System.out.println(Arrays.toString(array));
            insertionSortRecursive(array, leftIndex + 1, rightIndex);

        }
    }
}
