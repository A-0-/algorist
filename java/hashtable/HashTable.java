class HashTable{
	private int arraySize;
	private SortList[] hashtable;

	public HashTable(int size){
		arraySize = getPrime(size);
		hashtable = new SortList[arraySize];
		for(int i=0;i<arraySize;i++)
			hashtable[i] = new SortList();
	}

	public int getPrime(int s){
		for(int i=s+1;;i++){
			if(isPrime(i))
				return i;
		}
	}

	public boolean isPrime(int num){
		for(int j=2;j*j<num;j++)
			if(num%j==0)
				return false;
		return true;	
	}

	public int hashFunc(int key){
		return key%arraySize;
	}

	public void insert(int key){
		int val = hashFunc(key);
		hashtable[val].insert(key);
	}

	public Link find(int key){
		int val = hashFunc(key);
		return hashtable[val].find(key);
	}

	public int delete(int key){
		int val = hashFunc(key);
		return hashtable[val].delete(key);
	}

	public void displayHashTable(){
		for(int i=0;i<arraySize;i++)
			hashtable[i].displayList();
	}
}