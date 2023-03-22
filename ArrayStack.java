 class ArrayStack {
	static final int MAX_SIZE=20;
	int arr[]=new int[MAX_SIZE];
	int top;
	
	ArrayStack() {
		top=-1;
	}
	
	public void push(int val) {
		if(top>MAX_SIZE-1)
		{
			throw new IndexOutOfBoundsException("Stack is full");
		}
		arr[++top]=val;
	}
	 public int pop() {
		 return arr[top--];
	 }
	 
	 public int peek()
	 {
		 return arr[top];
	 }
}
class Main{

	public static void main(String[] args) {
		ArrayStack stack = new ArrayStack();
		stack.push(8);
		stack.push(9);
		stack.push(7);
		stack.push(5);
		stack.push(0);
		stack.push(3);

		System.out.println("poped element "+stack.pop());
		System.out.println("poped element "+stack.pop());
		System.out.println("poped element "+ stack.pop());
		System.out.println("top element "+stack.peek());

	}

}
