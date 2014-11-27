public class LinkStack{
	
	public LinkStack(){
		LinkList List = new LinkList();
	}

	public void push(int el){
		List.insertFirst(el);
	}

	public int pop(){
		return List.deleteFirst();
	}

	public boolean isEmpty(){
		return (List.isEmpty());
	}

	public void displayStack(){
		List.dislayLinkList();
	}
}