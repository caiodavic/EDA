import java.util.Arrays;
import java.util.Scanner;

public class CoutingSortNegativo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arrayString = sc.nextLine().split(" ");
        int maior = sc.nextInt();
        int menor = sc.nextInt();

        int[] array = new int[arrayString.length];

        for (int i = 0; i < arrayString.length; i++) {
            array[i] = Integer.parseInt(arrayString[i]);
        }

        coutingSort(array, menor, maior);

    }

    public static void coutingSort(int[] array, int menor, int maior) {
        int[] arrayC = new int[maior - menor + 1];

        for (int i = 0; i < array.length; i++) {
            arrayC[array[i] - menor]++;
            System.out.println(Arrays.toString(arrayC));
        }

        for (int i = 1; i < arrayC.length; i++) {
            arrayC[i] += arrayC[i - 1];
        }

        System.out.println("Cumulativa do vetor de contagem - " + Arrays.toString(arrayC));

        int[] arrayB = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            arrayB[arrayC[array[i] - menor] - 1] = array[i];
            arrayC[array[i] - menor]--;
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = arrayB[i];
        }

        System.out.println(Arrays.toString(arrayC));
        System.out.println(Arrays.toString(array));
    }
}


