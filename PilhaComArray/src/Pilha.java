import java.util.Scanner;

public class Pilha {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        String[] option;

        Pilha pilha = new Pilha(size);

        do {
            option = sc.nextLine().split(" ");

            switch (option[0]) {
                case "print":
                    if (isEmpty()) {
                        System.out.println("empty");
                        break;
                    } else {
                        System.out.println(printString());
                        break;
                    }

                case "peek":
                    if (isEmpty()) {
                        System.out.println("empty");
                        break;
                    } else {
                        System.out.println(peek());
                        break;
                    }
                case "push":
                    if (isFull()) {
                        System.out.println("full");
                        break;
                    } else {
                        push(Integer.parseInt(option[1]));
                        break;
                    }

                case "pop":
                    if (isEmpty()) {
                        System.out.println("empty");
                        break;
                    } else {
                        pop();
                        break;
                    }

                default:
                    break;
            }

        }while (!option[0].equals("end"));

    }

    static int[] array;
    static int head;


    public Pilha(int size){
        this.array = new int[size];
        this.head = -1;

    }

    private static boolean isEmpty(){
        return head == -1;
    }

    private static boolean isFull(){
        return head == array.length-1;
    }

    private static void push(int element){
        if (!isFull()){
            head+=1;
            array[head] = element;
        }
    }

    private static void pop(){
        if(!isEmpty()) {
            head -=1;
        }
    }

    private static int peek(){
        return array[head];
    }

    private static String printString(){
        String out = "";

        for(int i = 0; i <= head; i++){
            out += Integer.toString(array[i]) + " ";
        }
        return out.trim();
    }

}



