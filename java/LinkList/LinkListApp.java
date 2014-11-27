public class LinkListApp{
	public static void main(String[] args){
		LinkList l = new LinkList();
		l.insertFirst(1);
		l.insertFirst(4);
		l.insertFirst(5);
		l.insertFirst(6);
		l.displayLinkList();
		//l.deleteFirst();
		l.delete(6);
		System.out.println("");
		l.displayLinkList();
		System.out.println("");
	}
}