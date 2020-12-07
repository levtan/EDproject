package Data;

public class QueueArray<T>{
        private static final int N=5;
        private int top;
        private int tail;
        private T qarray[];
        private int elem=0;
        
        public QueueArray(){
            this(N);
        }
        
        public QueueArray(int n) {
            this.top = 0;
            this.qarray = (T[]) new Object[n];
        }
        
        public boolean empty(){
            if(top==0&&tail==0){
                return (true);
            }else{
                return(false);
            }
        }
        
        public int size(){
        return qarray.length;
        }
        
        public boolean full(){
            if(elem==qarray.length){
                return(true);
            }else{
                return(false);
            }
        }
        
        public void enqueue(T x){
            if(full()){
                throw new RuntimeException("Queue is full");
            }else if(qarray[tail]==null){
                qarray[tail]=x;
                tail++;
                if(tail>qarray.length){
                    tail = 0;
                }
                elem++;
            }
        }
        
        public T dequeue(){
            if(empty()){
                throw new RuntimeException("Queue´s empty");
            }else{
                T a = qarray[top];
                qarray[top]=null;
                top++;
                if(top>qarray.length){
                    top = 0;
                }
                elem--;
                return a;
            }
        }
        
        public boolean find(T x){
            boolean ans = false;
            int i=0;
            while(i<=qarray.length){
                if(qarray[i].equals(x)){
                    ans = true;
                    i = qarray.length;
                    i++;
                }else{
                    i++;
                }
            }
            return ans;
        }
        
        
    }