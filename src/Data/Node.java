package Data;

public class Node<T> 
{
    private T key;
    private int numkey; // provisional
    private Node right;
    private Node left;
    private int height;
    
    public Node()
    {
        this.right = null;
        this.left = null;
    }

    public Node(T key) {
        this.key = key;
        this.right = null;
        this.left = null;
    }

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getNumkey() {
        return numkey;
    }

    public void setNumkey(int numkey) {
        this.numkey = numkey;
    } 
}
