
package Data;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AVLTree<T>
{
    private Node root;     
 
    public AVLTree()
    {
        root = null;
    }
    
    public boolean isEmpty()
    {
        return root == null;
    }
    
    public void makeEmpty()
    {
        root = null;
    }
    
    public void add(Evento data)
    {
        root = add(data, root);
    }
    
    private int height(Node t )
    {
        return t == null ? -1 : t.getHeight();
    }
    
    private int max(int lhs, int rhs)
    {
        return lhs > rhs ? lhs : rhs;
    }
    
    public Node add(Evento key, Node nd) 
    {        
        Evento evento = new Evento();
        
        if(nd!=null)
        { 
            evento = (Evento) nd.getKey();
        }
        
        if(nd==null)
        {
            return new Node(key);
        }else if(key.compareTo(evento)<0) // temporal
        {
            nd.setLeft(add(key, nd.getLeft() ));
            if((height(nd.getLeft()) - height(nd.getRight()) == 2))
            {
                evento = (Evento) nd.getLeft().getKey();
                if(key.compareTo(evento)<0)
                {
                    nd = rotateWithLeftChild(nd);                   
                }else
                {
                    nd = doubleWithLeftChild(nd);
                }
            }
        }else if(key.compareTo(evento) > 0)
        {            
            nd.setRight(add(key, nd.getRight()));
            if((height(nd.getRight()) - height(nd.getLeft()) == 2))
            {
                evento = (Evento) nd.getRight().getKey();
                if(key.compareTo(evento)<0)
                {
                    nd = rotateWithRightChild(nd);                   
                }else
                {
                    nd = doubleWithRightChild(nd);
                }
            }
        }
        
        return nd;
    }
    
    private Node rotateWithLeftChild(Node nd)
    {
        Node rotateLeft = nd.getLeft();
        nd.setLeft(rotateLeft.getRight());
        rotateLeft.setLeft(nd);
        nd.setHeight(max(height(nd.getLeft()), height(nd.getRight()))+1); 
        rotateLeft.setHeight(max(height(rotateLeft.getLeft()), nd.getHeight())+1);
        return rotateLeft;
    }
 
    private Node rotateWithRightChild(Node nd)
    {
        Node rotateRight = nd.getRight();
        nd.setRight(rotateRight.getLeft());
        rotateRight.setLeft(nd);
        nd.setHeight(max( height( nd.getLeft() ), height( nd.getRight() ) ) + 1); 
        rotateRight.setHeight(max( height( rotateRight.getRight() ), nd.getHeight() ) + 1);
        return rotateRight;
    }
    
    private Node doubleWithLeftChild(Node nd)
    {
        nd.setLeft(rotateWithRightChild(nd.getLeft())); 
        return rotateWithLeftChild( nd );
    }
    
    private Node doubleWithRightChild(Node nd)
    {
        nd.setRight(rotateWithLeftChild( nd.getRight())); 
        return rotateWithRightChild( nd );
    } 

    public int countNodes()
    {
        return countNodes(root);
    }
    
    private int countNodes(Node nd)
    {
        if (nd == null)
            return 0;
        else
        {
            int l = 1;
            l += countNodes(nd.getLeft());
            l += countNodes(nd.getRight());
            return l;
        }
    }
     
    public boolean search(Evento evt)
    {
        return search(root, evt);
    }
    
    private boolean search(Node nd, Evento evt)
    {
        boolean found = false;
        while ((nd != null) && !found)
        {
            Evento pr = (Evento) nd.getKey();
            
            if (evt.compareTo(pr)<0)
                nd = nd.getLeft();
            else if (evt.compareTo(pr) > 0)
                nd = nd.getRight();
            else
            {
                found = true;
                break;
            }
            found = search(nd, evt);
        }
        return found;
    }
    
    public Node inorder()
    {
        Node nd = inorder(root);  
       return nd;
    }
    
    private Node inorder(Node r)
    {
        JFrame parentFrame = new JFrame(); 
        Node nd= new Node();
        Usuario ud;
        
        if (r != null)
        {
            nd = inorder(r.getLeft());
            //System.out.println(r.getKey());
            JOptionPane.showMessageDialog(parentFrame, r.getKey());
            nd = inorder(r.getRight());
        }
        
        return nd;
    }
    
    /* Function for preorder traversal */
    public void preorder()
    {
        preorder(root);
    }
    
    private void preorder(Node r)
    {
        if (r != null)
        {
            System.out.print(r.getKey() +" ");
            preorder(r.getLeft());    
            preorder(r.getRight());
        }
    }
    
    /* Function for postorder traversal */
    public void postorder()
    {
        postorder(root);
    }
    
    private void postorder(Node r)
    {
        if (r != null)
        {
            postorder(r.getLeft());             
            postorder(r.getRight());
            System.out.print(r.getKey() +" ");
        }
    }     
}