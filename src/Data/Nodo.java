package Data;

public class Nodo<T> {
    
    private T key;
    private Nodo <T> next;

    public T getKey() {
        return key;
    }

    public Nodo<T> getNext() {
        return next;
    }
    
    public Nodo(T key, Nodo<T> next){
        this.key = key;
        this.next = next;
    }

}
