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
}
class Main{
    public static void main(String arge[])
    {
        BinarySeacrchTree bst = new BinarySeacrchTree(7);
        bst.insert(bst.root,8);
        bst.insert(4);
        bst.insert(6);
        bst.insert(9);
        bst.insert(1);
        bst.insert(14);
        bst.insert(10);
        bst.inorder(bst.root);
        if(bst.search(bst.root,7)==null)
        {
            System.out.println("nf");
        }
        else
        {
            System.out.println("f");
        }
        
    }
}
