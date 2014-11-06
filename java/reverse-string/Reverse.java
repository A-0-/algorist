public class Reverse{
	String input;
	int stackSize;
	String output;
	public Reverse(String in){
		input = in;
		stackSize = in.length();
		output = "";
	}

	public String doRev(){
		StackX myStack = new StackX(stackSize);
		for(int i=0;i<stackSize;i++){
			myStack.push(input.charAt(i));
		}
		while(!myStack.isEmpty()){
			output = output+ myStack.pop();
		}
		return output;
	}

}