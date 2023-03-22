class ArrayLinkedList {
     class Node{
         int data;
         Node next;
         Node (int val){
             data=val;
             next=null;
         }
     }
     Node top;
     //creating constructor
     ArrayLinkedList(){
         top=null;
     }
     
     public void push(int val){
         Node newnode=new Node(val);
         newnode.next=top;
         top=newnode;
         
     }
     
     public int pop(){
         if(top==null)
         {
             throw new IndexOutOfBoundsException();
         }
         
         int temp=top.data;
         top=top.next;
         return temp;
     }
     
     int peek(){
         return top.data;
     }
	
}
class Main{

	public static void main(String[] args) {
		ArrayLinkedList stack = new ArrayLinkedList();
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
