public class SortList{

	private Link first;

	public SortList(){
		first = null;
	}

	public void insert(int key){
		Link current = first;
		Link previous = null;
		Link newVal = new Link(key);
		while(current!=null && key>current.getKey()){
			previous = current;
			current = current.next;
		}
		if(previous==null){
			first = newVal;
		}else{
			previous.next = newVal;
			newVal.next = current;
		}
	}

	public int delete(int key){
		Link current = first;
		Link previous = null;
		while(current!=null){
			if(current.getKey() == key){
				if(previous==null){
					if(current.next==null)
						current = null;
					else
						first = current.next;
					return key;
				}else{
					previous.next = current.next;
					return key;
				}
			}
			previous = current;
			current = current.next;
		}
		return -1;
	}

	public Link find(int key){
		Link current = first;
		while(current!=null){
			if(current.getKey()==key)
				return current;
			current = current.next;
		}
		return null;
	}

	public void displayList(){
		Link current = first;
		while(current!=null){
			System.out.print(current.getKey()+" ");
			current = current.next;
		}
		System.out.println();
	}	

}