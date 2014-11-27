//think about n  level of the problem

public class anagram{
	
	public static int size;
	public static char[] word;


	public static void main(String[] args){
		String w = "cats";
		size = w.length();
		word = w.toCharArray();
		doAnagram(size);
	}


	public static void rotate(int newSize){
		int j;
		int position = size-newSize;
		char temp = word[position];
		for(j=position;j+1<size;j++)
			word[j] = word[j+1];
		word[j] = temp;
	}


	public static void doAnagram(int newSize){
		if(newSize==1)
			return;
		for(int i=0;i<newSize;i++){
			doAnagram(newSize-1);
			if(newSize == 2)
				displayWord();
			rotate(newSize);
		}
	}

	public static void displayWord(){
		for(int u=0;u<size;u++)
			System.out.print(word[u]);
		System.out.println();
	}
}