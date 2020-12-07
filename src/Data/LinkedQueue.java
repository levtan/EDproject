package Data;


    /*public class QueueArray<T>{
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
        
    }*/
    
    public class LinkedQueue<T>{
        private Node<T> top;
        private Node<T> tail;
        private int size;
        
        public int size(){
            return size;
        }
        
        public boolean isEmpty(){
            if(top==null&&tail==null){
                return true;
            }else{
                return false;
            }
        }
        
        public void enqueue(T key){
            Node<T> nodo = new Node <T>(key, this.tail);
            this.tail=nodo;
            size++;
        }
        
        public T dequeue(){
            if(isEmpty()){
                System.out.println("Empty Queue...");
                return null;
            }else{
                T ref;
                ref = top.getKey();
                top = top.getRight();
                size --;
                return ref;
            }
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

