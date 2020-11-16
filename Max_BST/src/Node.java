public class Node {

    private int element;
    private Node left;
    private Node right;
    private Node parent;

    Node(int v){
        this.element = v;
    }

    public int getElement() {
        return element;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public Node getParent() {
        return parent;
    }

    public void setElement(int element) {
        this.element = element;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

}
