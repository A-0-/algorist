import java.io.*;
public class BracketCheckerApp{
	public static void main(String[] args) throws IOException{
		String input;
		//String output;
		while(true){
			System.out.print("Enter a string: ");
			System.out.flush();
			input = getString();
			if(input.equals(""))
				break;
			BracketChecker br = new BracketChecker(input);
			br.check();
		}
	}

	public static String getString() throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(isr);
		return bf.readLine();
	}
}