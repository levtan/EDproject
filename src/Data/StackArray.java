package Data;

    public class StackArray<T> {
    private static final int N=3;
    private int top;
    private T sarray[];

    public StackArray(){
        this(N);
    }

    public int size(){
        return sarray.length;
    }
    
    public StackArray(int n) {
        this.top = 0;
        this.sarray = (T[]) new Object[n];
    }
    
    public boolean empty(){
        return (top<=0);
    }
    
    public boolean full(){
        return (top>=sarray.length);
    }
    
    public T pop(){
        if(empty()){
            throw new RuntimeException("Stack´s empty");
        }
        top--;
        return sarray[top];
    }
    
    public void push(T x){
        if(full()){
            throw new RuntimeException("Stack is full");
        }
        sarray[top]=x;
        top++;
    }
    
    public boolean find(T x){
        boolean ans = false;
        int i=0;
        while(i<=top){
            if(sarray[i].equals(x)){
                ans = true;
                i = top;
                i++;
            }else{
                i++;
            }
        }
        return ans;
    }
    
    public StackArray copy(StackArray o, StackArray c){
        
        int i = o.size();
        StackArray cop = new StackArray(i);
        
        try{
            if(c.size()>=o.size()){
            while(o.size()>=0){
            cop.push(o.pop());
            }
            while(cop.size()>=0){
            c.push(cop.pop());
            }
            return c;
            }else{
                throw new RuntimeException("The target Stack is too Small");
            }
        }catch(Exception e){
            
            return o;
        }
    }
}