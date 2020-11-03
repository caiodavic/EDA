import java.util.Arrays;
import java.util.Scanner;

public class FuraFila {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arrayString = sc.nextLine().split(" ");
        int[] array = new int[arrayString.length];

        for (int i = 0; i < arrayString.length; i++) {
            array[i] = Integer.parseInt(arrayString[i]);
        }

        int indice = sc.nextInt();
        int aux = 0;
        for(int i = indice; i < array.length; i++){
            for(int j = i; j>aux; j--){
                swap(array,j,j-1);
            }
            System.out.println(Arrays.toString(array));
            aux++;
        }
    }

    static public void swap(int[] array, int a,int b){
        int aux = array[a];
        array[a] = array[b];
        array[b] = aux;
    }
}


