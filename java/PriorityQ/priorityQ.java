public class priorityQ{
	int maxSize;
	int nElems;
	int[] q;

	public priorityQ(int s){
		q = new int[s];
		maxSize = s;
		nElems = 0;
	}

	public void insert(int el){
		if(nElems == 0)
			q[nElems++] = el;
		else{
			int j;
			for(j=nElems-1;j>=0;j--){
				if( q[j] < el )
					q[j+1] = q[j];
				else
					break;	 
			}
			q[j+1] = el;
			++nElems;
		}
	}

	public int remove(){
		return q[--nElems];
	}

	public int peek(){
		return q[nElems-1];
	}

	public boolean isEmpty(){
		return (nElems==0);
	}
	public boolean isFull(){
		return (nElems==maxSize);
	}
}