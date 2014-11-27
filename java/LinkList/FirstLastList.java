public class FirstLastList{
	
	private Link first;
	private Link last;

	public FirstLastList(){
		first = null;
		last = null;
	}

	public boolean isEmpty(){
		return (first==null);
	}

	public void insertFirst(int el){
		Link l = new Link(el);
		if(isEmpty())
			last = l;
		l.next = first;
		first = l;
	}

	public void insertLast(int el){
		Link l = new Link(el);
		if(isEmpty()){
			first = l;
			last = l;
		}else{
			last.next = l;
			last = l;
		}
	}

	public int deleteFirst(){
		Link temp = first;
		first = first.next;
		return temp.id;
	}

	public void displayList(){
		Link current = first;
		while(current!=null){
			current.displayLink();
			current = current.next;
		}
	}

}