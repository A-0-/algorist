public class LinkQueue{
	private FirstLastList FL;
	
	public LinkQueue(){
		FL = new FirstLastList();
	}

	public void enqueue(int el){
		FL.insertLast(el);
	}

	public int dequeue(){
		return FL.deleteFirst();
	}

	public boolean isEmpty(){
		return FL.isEmpty();
	}

	public void displayQueue(){
		FL.displayList();
	}

}