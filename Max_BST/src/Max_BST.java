import java.util.ArrayList;
import java.util.Scanner;

public class Max_BST {
    public static void main(String[] args) {

        Max_BST tree = new Max_BST();
        Scanner sc = new Scanner(System.in);
        String[] arrayString = sc.nextLine().split(" ");


        for (int i = 0; i < arrayString.length; i++) {
            tree.add(Integer.parseInt(arrayString[i]));
        }

        System.out.println(tree.getMaximo().toString());
    }

    private Node root;

    public Max_BST(){}

    public boolean isEmpty(){
        return this.root == null;
    }

    public void add(int element){
        if(isEmpty())
            this.root = new Node(element);
        else{
            this.addRecursive(this.root,element);
        }
    }

    private void addRecursive(Node aux,int element){
        if(aux.getElement() > element){
            if(aux.getLeft() == null){
                Node newNode = new Node(element);
                aux.setLeft(newNode);
                newNode.setParent(aux);
            } else
                this.addRecursive(aux.getLeft(),element);
        } else if(aux.getElement() < element){
            if(aux.getRight() == null){
                Node newNode = new Node(element);
                aux.setRight(newNode);
                newNode.setParent(aux);
            } else
                this.addRecursive(aux.getRight(),element);
        }
    }

    public String getMaximo(){
        String result = "";

        if(!this.isEmpty()){
            ArrayList<Integer> array = new ArrayList<Integer>();
            array = getMaximoRecursive(this.root,array);

            for(int i = 0; i< array.size(); i++){
                result += array.toArray()[i].toString() + " ";
            }
        }

        return result.trim();
    }

    private ArrayList<Integer> getMaximoRecursive(Node aux,ArrayList<Integer> array){
        if(aux != null){
            array.add(aux.getElement());
            array = getMaximoRecursive(aux.getRight(),array);
        }
        return array;
    }
}
