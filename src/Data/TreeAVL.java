package Data;

public class TreeAVL<T> 
{
    private Node root;
     
    public TreeAVL()
    {
        root = null;
    }
    
    public boolean empty()
    {
        return root == null;
    }
    
    public void add(T key, int num)
    {
        root = add(root, key, num);
    }
    
    public Node add(Node nd ,T key, int num) 
    {        
        if(nd==null)
        {
            return new Node(key);
        }else if(num < nd.getNumkey()) // temporal
        {
            nd.setLeft(add(nd.getLeft(), key, num));
        }else if(num > nd.getNumkey())
        {
            nd.setRight(add(nd.getRight(), key, num));
        }
        
        return balance(nd);
    }
    
    
    public void delete(T key, int num)
    {
        delete(root, key, num);
    }
    
    public Node delete(Node nd, T key, int num)  // en pruebas
    {
        if (nd == null) 
        {
            return nd;
        } else if (nd.getNumkey() > num) 
        {
            nd.setLeft(delete(nd.getLeft(), key, num));
        } else if (nd.getNumkey() < num) 
        {
            nd.setRight(delete(nd.getRight(), key, num)); 
        } else 
        {   if (nd.getLeft() == null || nd.getRight() == null) 
            {
                nd = (nd.getLeft() == null) ? nd.getRight() : nd.getLeft();
            } else 
            {
                Node mostLeftChild = mostLeftChild(nd.getRight());
                nd.setKey(mostLeftChild.getKey());
                nd.setRight(delete(nd.getRight(), (T) nd.getKey(), num));
            }
        }
        if (nd != null) 
        {
            nd = balance(nd);
        }
        return nd;
    }
    
    public Node mostLeftChild(Node nd)
    {
        if(nd.getLeft() == null)
        {
            return null;
        }else
        {
            
        }
        return new Node();
    }
    
    public void updateHeight(Node nd) 
    {
        nd.setHeight(1 + Math.max(height(nd.getLeft()), height(nd.getRight())));
    }
 
    public int height(Node nd) {
        return (nd == null) ? -1 : nd.getHeight();
    }
 
    public int getBalance(Node n) {
        return (n == null) ? 0 : height(n.getRight()) - height(n.getLeft());
    }
        
    public Node balance(Node nd) 
    {
        updateHeight(nd);
        int balance = getBalance(nd);
        if (balance > 1) 
        {
            if (height(nd.getRight().getRight()) > height(nd.getRight().getLeft())) 
            {
                nd = rotateLeft(nd);
            }else 
            {
                nd.setRight(rotateRight(nd.getRight()));
                nd = rotateLeft(nd);
            }
        }else if(balance < -1) 
        {
            if (height(nd.getLeft().getLeft()) > height(nd.getLeft().getRight()))
            {
                nd = rotateRight(nd);
            }
            else 
            {
                nd.setLeft(rotateLeft(nd.getLeft()));
                nd = rotateRight(nd);
            }
        }
    return nd;
}
    
    public Node rotateRight(Node y) 
    {
        Node x = y.getLeft();
        Node z = x.getRight();
        x.setRight(y);
        y.setLeft(z);
        updateHeight(y);
        updateHeight(x);
        return x;
    }
    
    public Node rotateLeft(Node y) 
    {
        Node x = y.getRight();
        Node z = x.getLeft();
        x.setLeft(y);
        y.setRight(z);
        updateHeight(y);
        updateHeight(x);
        return x;
    }
    
    public Node find(int key) {
    Node current = root;
    while (current != null) 
    {
        if (current.getNumkey() == key)     
        {
            break;
        }
            current = current.getNumkey() < key ? current.getRight() : current.getLeft();
        }
        return current;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }
    
    
}
