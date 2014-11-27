public class LinkQueueApp{

	public static void main(String[] args){
		LinkQueue q = new LinkQueue();
		q.enqueue(1);
		q.enqueue(4);
		q.enqueue(5);
		q.enqueue(6);
		q.displayQueue();
		System.out.println();
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		q.displayQueue();
	}	
}