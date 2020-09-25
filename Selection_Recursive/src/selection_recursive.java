import java.util.Arrays;
import java.util.Scanner;

public class selection_recursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arrayString = sc.nextLine().split(" ");
        int[] array = new int[arrayString.length];

        for (int i = 0; i < arrayString.length; i++) {
            array[i] = Integer.parseInt(arrayString[i]);
        }

        selectionSort(array);

    }

    public static void selectionSort(int array[]){
        if(array.length == 0) return;
        selectionSortRecursive(array,0,array.length-1);
    }

    public static void selectionSortRecursive(int array[],int leftIndex,int rightIndex){


        if(leftIndex<rightIndex){
            int indiceDoMenor = leftIndex;
            for(int j = leftIndex + 1; j < array.length;j++){
                if(array[j]<array[indiceDoMenor]){
                    indiceDoMenor = j;
                }
            }
            swap(array,leftIndex,indiceDoMenor);
            System.out.println(Arrays.toString(array));
            selectionSortRecursive(array,leftIndex+1,rightIndex);
        }
    }

    public static void swap(int array[], int i,int j){
        int aux;

        aux = array[i];
        array[i] = array[j];
        array[j] = aux;
    }
}
