class ArrayQueue{
    static final int MAX_SIZE=20;
    int rear;
    int arr[]=new int[MAX_SIZE];
    ArrayQueue(){
        
        rear=-1;
        
    }
    
    public void enqueue(int val){
        if(rear==MAX_SIZE-1)
        {
            throw new IndexOutOfBoundsException("queue full");
        }

        
        arr[++rear]=val;
        
    }
    
    public int dequeue(){
        if(rear==-1)
        {
            throw new IndexOutOfBoundsException("queue empty");
        }
        int temp = arr[0];
        for(int i=1;i<=rear;i++)
        {
            arr[i-1]=arr[i];
        }
        rear--;
        return temp;
    }
}
class Main{

	public static void main(String[] args) {
		ArrayQueue q = new ArrayQueue();
		q.enqueue(5);
		q.enqueue(7);
		q.enqueue(9);
		q.enqueue(6);

		System.out.println("dequeued element "+q.dequeue());
		System.out.println("dequeued element "+q.dequeue());
		System.out.println("dequeued element "+q.dequeue());
		System.out.println("dequeued element "+q.dequeue());
		q.enqueue(6);
		System.out.println("dequeued element "+q.dequeue());
		System.out.println("dequeued element "+q.dequeue());
	
	
	}

}
