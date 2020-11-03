import java.util.Scanner;

public class LinkedList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] option;

        do {
            option = sc.nextLine().split(" ");

            switch (option[0]) {
                case "print":
                    if (isEmpty()) {
                        System.out.println("empty");
                        break;
                    } else {
                        System.out.println(print());
                        break;
                    }

                case "element":
                    if (isEmpty()) {
                        System.out.println("empty");
                        break;
                    } else {
                        System.out.println(head());
                        break;
                    }
                case "add":
                        add(Integer.parseInt(option[1]));
                        break;


                case "remove":
                    if (isEmpty()) {
                        System.out.println("empty");
                        break;
                    } else {
                        removeFirst();
                        break;
                    }

                case "search":
                    System.out.println(search(Integer.parseInt(option[1])));
                    break;


                default:
                    break;
            }

        }while (!option[0].equals("end"));
    }

    static private Node head;
    static private Node tail;


    public LinkedList(){
        this.head = null;
        this.tail = null;
    }

    private static boolean isEmpty(){
        return head == null;
    }

    private static void add(int element){
        if(isEmpty()){
            head = new Node();
            head.setElemento(element);
            tail = head;
        }
        else{
            addRecursive(head,element);
        }

    }

    private static void addRecursive(Node node, int element){
        if(node == null){
            node = new Node();
            node.setPrev(tail);
            node.setElemento(element);
            tail.setNext(node);
            tail = node;

        } else {
            addRecursive(node.getNext(),element);
        }
    }

    private static int head(){
        int element = 0;
        if(!isEmpty()){
            element = head.getElemento();
        }
        return element;
    }

    private static void removeFirst(){
        if(isEmpty()) return;
        if(!isEmpty()){
            if(head.getNext() == null){
                head = null;
                tail = null;

            } else {
            head.getNext().setPrev(null);
            head = head.getNext();
            }
        }
    }

    private static int search(int element){
        if(!contains(element)) return -1;
        return searchRecursive(head,element);
    }

    private static int searchRecursive(Node node, int element){
        if(!contains(element)){
            return -1;
        } else {
            if(node.getElemento() == element){
                return 0;
            } else return 1 + searchRecursive(node.getNext(),element);
        }
    }

    private static boolean contains(int element){
        if(isEmpty()) return false;
        return containsRecursive(head,element);
    }

    private static boolean containsRecursive(Node node, int element) {
        if(node.getElemento() == element){
            return true;
        } else if(node.getNext() == null){
            return false;
        } else {
            return containsRecursive(node.getNext(),element);
        }
    }

    private static String print(){
        if(isEmpty()){
            return "empty";
        } else {
            return recursivePrint(head);
        }
    }

    private static String recursivePrint(Node node){
        String array = "";

        if(node != null){
            array =  Integer.toString(node.getElemento()) + " " + recursivePrint(node.getNext());
        }

        return array.trim();
    }

}

public class Node {

    private Integer elemento;
    private Node next;
    private Node prev;


    public Node(){
        elemento = null;
        this.next = null;
        this.prev = null;
    }

    public Node(Integer elemento, Node next, Node prev) {
        this.elemento = elemento;
        this.next = next;
        this.prev = prev;
    }

    public Integer getElemento() {
        return elemento;
    }

    public Node getNext() {
        return next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setElemento(Integer elemento) {
        this.elemento = elemento;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }
}


