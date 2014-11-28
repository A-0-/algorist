class Link{
	private int key;
	public Link next;
	
	public Link(int k){
		key = k;
		next = null;
	}

	public int getKey(){
		return key;
	}
}