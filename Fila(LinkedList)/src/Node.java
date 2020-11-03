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
