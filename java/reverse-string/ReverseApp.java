import java.io.*;
public class ReverseApp{
	public static void main(String[] args) throws IOException{
		String input;
		String output;
		while(true){
			System.out.print("Enter a string: ");
			System.out.flush();
			input = getString();
			if(input.equals(""))
				break;
			Reverse theReverser = new Reverse(input);
			output = theReverser.doRev();
			System.out.println("Reverse String is : "+output);
		}
	}

	public static String getString() throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(isr);
		return bf.readLine();
	}
}