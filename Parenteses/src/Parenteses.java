import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Parenteses {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            String[] entrada = sc.nextLine().split("");
            LinkedList<String> parenteses = new LinkedList<String>();

            for(int i=0;i < entrada.length;i++){
                parenteses.add(entrada[i]);
            }


            if (sequenciaValida(parenteses)) {
                System.out.println("S");
            } else {
                System.out.println("N");
            }


    }

    static private boolean sequenciaValida(LinkedList<String> parenteses){


        if(!parenteses.peekFirst().equals("(") || parenteses.size() % 2 != 0){
            return false;
        }

        Stack<String> pilha = new Stack<String>();
        boolean resultado = true;
        int contador = 0;

        while(resultado && contador < parenteses.size()){

            if(parenteses.get(contador).equals(")") && pilha.isEmpty()){
                resultado = false;
            } else if (parenteses.get(contador).equals("(")){
                pilha.push(parenteses.get(contador));
            } else if(parenteses.get(contador).equals(")")){
                pilha.pop();
            }
            contador++;
        }

        return pilha.isEmpty() && resultado;

    }
}


