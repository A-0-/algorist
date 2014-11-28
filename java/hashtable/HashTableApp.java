class HashTableApp{
	public static void main(String[] args){
		HashTable table = new HashTable(5);
		table.insert(5);
		table.insert(23);
		table.insert(3);
		table.insert(100);
		table.insert(44);
		table.delete(23);
		table.delete(100);
		table.insert(100);
		System.out.println(table.find(44).getKey());
		table.displayHashTable();

	}
}