import java.util.Arrays;
import java.util.Scanner;

class InsereUltimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arrayString = sc.nextLine().split(" ");
        int[] array = new int[arrayString.length];

        for (int i = 0; i < arrayString.length; i++) {
            array[i] = Integer.parseInt(arrayString[i]);
        }
        System.out.println(insereUltimoOrdenado(array));

    }

    public static String insereUltimoOrdenado(int array[]) {
        if (array.length > 1) {
            int indiceUltimo = array.length - 1;
            while (indiceUltimo > 0 && array[indiceUltimo - 1] > array[indiceUltimo]) {
                swap(array, indiceUltimo, indiceUltimo-1);
                indiceUltimo--;
            }
        }
        return Arrays.toString(array);
    }

    public static void swap(int array[], int i,int j){
        int aux;
        aux = array[i];
        array[i] = array[j];
        array[j] = aux;
    }

}