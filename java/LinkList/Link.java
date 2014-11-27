public class Link{
	
	public int id;
	public Link next;

	public Link(int val){
		id = val;
	}

	public void displayLink(){
		System.out.print(id+"->");
	}

}