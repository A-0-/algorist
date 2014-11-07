public class Queue{

	private int nElems;
	private int[] q;
	private int rear;
	private int front;
	private int maxSize;

	public Queue(int s){
		q = new int[s];
		nElems = 0;
		rear = -1;
		front = 0;
		maxSize = s;
	}
	
	public void insert(int elem){
		if(rear == maxSize-1)
			rear = -1;
		q[++rear] = elem;
		++nElems;
		return;
 	}

	public int remove(){
		int el = q[front++];
		if(front == maxSize)
			front = 0;
		--nElems;
		return el;
	}

	public boolean isEmpty(){
		if(nElems == 0)
			return true;
		return false;
	}

	public boolean isFull(){
		if(nElems == maxSize)
			return true;
		return false;
	}

}