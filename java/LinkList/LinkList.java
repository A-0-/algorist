public class LinkList{

	private Link first;

	public void LinkList(){
		first = null;
	}

	public void insertFirst(int val){
		Link node = new Link(val);
		node.next = first;
		first = node;
	}

	public int deleteFirst(){
		Link temp = first;
		first = first.next;
		return temp.id;
	}

	public void displayLinkList(){
		Link current = first;
		while( current!=null )	{
			current.displayLink();
			current = current.next;
		}
	}

	public Link find(int el){
		Link current = first;
		while(current!=null){
			if(current.id == el)
				break;
			current = current.next;
		}
		return current;
	}

	public void delete(int el){
		Link current = first;
		Link previous = current;
		while(current!=null){
			if(current.id==el)
				break;
			previous = current;
			current = current.next;
		}
		if(current == first){
			first = first.next;
		}else{
			previous.next = current.next;
		}
	}

}