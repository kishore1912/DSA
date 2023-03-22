class queueLinkedList{
    class Node{
        int data;
        Node next;
    
        Node(int val){
            data=val;
            next=null;
        }
    }
        
     Node front,rear;
    queueLinkedList(){
        front=null;
        rear=null;
    }
    public void enqueue(int val)
    {
        Node newnode=new Node(val);
        if(front==null)
        {
            front=newnode;
        }
        else
        {
        rear.next=newnode;
        }
        rear=newnode;
    }
    public int dequeue()
    {
        if(front==null)
        {
            throw new IndexOutOfBoundsException("queue empty");
        }
        int temp=front.data;
        front=front.next;
         if(front==null)
        {
            rear=null;
        }
        return temp;
    }
    public int elementfront(){
        return front.data;
    }
}
class Main{

	public static void main(String[] args) {
		queueLinkedList q = new queueLinkedList();
		q.enqueue(5);
		q.enqueue(7);
		q.enqueue(9);
		q.enqueue(6);

		System.out.println("dequeued element "+q.dequeue());
		System.out.println("dequeued element "+q.dequeue());
		System.out.println("dequeued element "+q.dequeue());
		System.out.println("dequeued element "+q.dequeue());
		q.enqueue(6);
		q.enqueue(7);
		q.enqueue(9);
		q.enqueue(6);
		System.out.println("dequeued element "+q.dequeue());
		System.out.println("dequeued element "+q.dequeue());
		System.out.println("frontmen"+q.elementfront());
	
	
	}

}
