class ArrayQueue{
    static final int MAX_SIZE=20;
    int rear,front;
    int arr[]=new int[MAX_SIZE];
    ArrayQueue(){
        
        rear=-1;
        front=-1;
    }
    
    public void enqueue(int val){
        if(rear>MAX_SIZE-1)
        {
            throw new IndexOutOfBoundsException("queue full");
        }
        if(front==-1){
            front++;
        }
        arr[++rear]=val;
        
    }
    
    public int dequeue(){
        if(front==-1||front>rear)
        {
            throw new IndexOutOfBoundsException("queue empty");
        }
        return arr[front++];
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
	
	}

}
