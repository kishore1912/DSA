class BinarySeacrchTree
{
    Node root;
    class Node{
         int key;
        Node right,left;
        
    Node(int val)
    {
         key=val;
        right=left=null;
    }
    }
    BinarySeacrchTree(int val)
    {
        root=new Node(val);
    }
    BinarySeacrchTree()
    {
        root=null;
    }
    public void insert(int val)
    {
        insert(root,val);
    }
    public Node insert(Node root,int val)
    {
        if(root==null)
        {
            return new Node(val);
        }
        
        if(val<root.key)
        {
            root.left=insert(root.left,val);
        }
        else
        {
            root.right=insert(root.right,val);
        }
        
        return root;
    }
    void inorder(Node root)
    {
        if(root!=null)
        {
            inorder(root.left);
            System.out.println(root.key);
            inorder(root.right);
        }
    }
    public Node search(Node root,int val)
    {
        if(root==null||root.key==val)
        {
            return root;
        }
        if(val<root.key)
        {
            return search(root.left,val);
        }
        else
        {
            return search(root.right,val);
        }
    }
    
    public Node delete(Node root,int val)
    {
        if(root==null)
        {
            return root;
        }
       
        if(val>root.key)
        {
            root.right=delete(root.right,val);
        }
        
        else if(val<root.key)
        {
            root.left=delete(root.left,val);
        }
        else
        {
            if(root.right==null)
            {
                return root.left;
            }
            else if((root.left==null))
            {
                return root.right;
            }
            else
            {
                root.key=min(root.right);
                root.right=delete(root.right,root.key);
            }
        }
        return root;
    }
    public int min(Node root)
    {
        int minvalue=root.key;
        while(root.left!=null)
        {
            minvalue=root.left.key;
            root=root.left;
        }
        return minvalue;
    }
}
class Main{
    public static void main(String arge[])
    {
        BinarySeacrchTree bst = new BinarySeacrchTree(7);
        bst.insert(bst.root,10);
        bst.insert(20);
        bst.insert(25);
        bst.insert(60);
        bst.insert(70);
        bst.insert(90);
        bst.insert(80);
        bst.insert(75);
        bst.inorder(bst.root);
        if(bst.search(bst.root,7)==null)
        {
            System.out.println("nf");
        }
        else
        {
            System.out.println("f");
        }
        bst.delete(bst.root,70);
        bst.inorder(bst.root);
        
    }
}
