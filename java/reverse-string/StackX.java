public class StackX{
	int maxSize;
	char[] stack;
	int top;
	public StackX(int size){
		top = -1;
		stack = new char[size];
		maxSize = size;
	}
	public void push(char elem){
		stack[++top] = elem;
		return;
	}
	public char pop(){
		return stack[top--];
	}
	public boolean isEmpty(){
		return top==-1?true:false;
	}

}