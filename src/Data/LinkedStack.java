package Data;

 public class LinkedStack<T> {

    private Node<T> top;
    private int size;
    
    
    public int size(){
        return size;
    }

    
    public boolean isEmpty(){
        if(top==null){
            return true;
        }else{
            return false;
        }
    }
    
    
    public void push(T key){
        Node<T> nodo = new Node <T>(key, this.top);
        this.top=nodo;
        size++;
    }
    
    
    public T pop(){
        if(isEmpty()){
            System.out.println("Empty Stack...");
            return null;
        }else{
            T ref;
            ref = top.getKey();
            top = top.getRight();
            size --;
            return ref;
        }
    }
    
    
    public T top(){
        T ref = top.getKey();
        return ref;
    }
    
    public LinkedStack copyStack(LinkedStack original, LinkedStack ent){
        LinkedStack copy = new LinkedStack();
        int i=0;
        while(original.size>0){
            copy.push(original.pop());
        }
        while(copy.size>0){
            ent.push(copy.pop());
        }
        return ent;
    }
    
    public boolean find(T key){
        boolean ans= false;
        T s= top.getKey();
        Node fnd = new Node(s, top);
        int i = 0;
        while(i <= size){
            if(key.equals(fnd.getKey())){
            ans = true;
            i = size;
            i++;
        }else{
            fnd = fnd.getRight();
            i++;
        }
        }
        return ans;
    }
    
}
