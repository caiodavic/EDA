import java.util.Arrays;
import java.util.Scanner;

public class CoutingSortPassoaPasso {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arrayString = sc.nextLine().split(" ");
        int k = sc.nextInt();
        int[] array = new int[arrayString.length];

        for (int i = 0; i < arrayString.length; i++) {
            array[i] = Integer.parseInt(arrayString[i]);
        }

        coutingSort(array,k);

    }

    public static void coutingSort(int[] array, int k){
        int[] arrayC = new int[k+1];

        for(int i = 0; i<array.length;i++){
            arrayC[array[i]]++;
            System.out.println(imprimeVetor(arrayC));
        }

        for(int i = 1; i<=k;i++){
            arrayC[i] += arrayC[i-1];
        }

        System.out.println("Cumulativa do vetor de contagem - " + imprimeVetor(arrayC));

        int[] arrayB = new int[array.length];

        for(int i = 0; i<array.length;i++){
            arrayB[arrayC[array[i]]-1] = array[i];
            arrayC[array[i]]--;
        }

        for(int i=0;i<array.length;i++){
            array[i] = arrayB[i];
        }

        System.out.println(imprimeVetor(arrayC));
        System.out.println(imprimeVetor(array));
    }

    public static String imprimeVetor(int[] array){
        String vetor = "";
        for(int i = 0; i < array.length;i++){
            vetor+= Integer.toString((array[i]))+" ";
        }
        return vetor.trim();
    }

}
