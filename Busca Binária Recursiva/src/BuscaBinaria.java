import java.util.Scanner;

class BuscaBinaria {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

         String[] arrayString = sc.nextLine().split(" ");
         int buscado = Integer.parseInt(sc.nextLine());

        buscaBinariaRecursiva(arrayString,buscado,0,arrayString.length-1);

    }

    public static int buscaBinariaRecursiva(String[] array, int n, int ini, int fim){
        if(ini <= fim) {

            int meio = (ini+fim)/2;
            System.out.println(meio);

            if(Integer.parseInt(array[meio]) == n) return meio;

            if(n<Integer.parseInt(array[meio])){
                return buscaBinariaRecursiva(array,n,ini,meio-1);
            } else {
                return buscaBinariaRecursiva(array,n,meio+1,fim);
            }
        } else {
            System.out.println(-1);
            return -1;
        }

    }

}




