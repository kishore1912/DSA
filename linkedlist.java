class LinkedList
 {
	Node head;
	
	class Node{
		int data;
		Node next;
		Node(int val){
			data = val;
			next = null;
	}
	}
	
	LinkedList()
	{
		head=null;
		
	}
	public void insertAtBegg(int val) {
		Node newnode=new Node(val);
		if(head==null)
			head=newnode;
		else {
			newnode.next=head;
			head=newnode;
		}
		
	}
	
	public void display()
	{
	    Node temp=head;
	    while(temp!=null)
	    {
	        System.out.print(temp.data+" ");
	        temp=temp.next;
	    }
	}
	
	public void insertAtpos(int pos,int val)
	{
	    if(pos==0)
	    {
	        insertAtBegg(val);
	        return;
	    }
	    Node newnode=new Node(val);
	    Node temp=head;
	    for(int i=1;i<pos;i++)
	    {
	        temp=temp.next;
	    }
	    newnode.next=temp.next;
	    temp.next=newnode;
	 
	    
	}
	
	public void deleteAtpos(int pos){
	    
	    
	    if(pos==0){
	        head=head.next;
	    }
	    Node temp=head;
	    Node prev=null;
	    for (int i=1;i<=pos;i++)
	    {
	        prev=temp;
	        temp=temp.next;
	    }
	    prev.next=temp.next;
	}
	
	public void reverse()
	{
	    Node prev=null;
	    Node current=head;
	    Node next=head.next;
	    
	    while(current!=null){
	        next=current.next;
	        current.next=prev;
	        prev=current;
	        current=next;
	    }
	    head=prev;
	}

}

class Main{


	public static void main(String srgs[])
	{
		LinkedList list=new LinkedList();
		list.insertAtBegg(1);
		list.insertAtBegg(2);
		list.insertAtBegg(3);
		list.insertAtBegg(4);
		list.display();
		
	
		list.reverse();
		list.display();
		
	}
}
