public class BracketChecker{
	private String input;
	public BracketChecker(String in){
		input = in;
	}

	public void check(){
		StackX theStack = new StackX(input.length());
		for(int j=0;j<input.length();j++){
			char ch = input.charAt(j);
			switch(ch){
				case '{':
				case '[':
				case '(':
					theStack.push(ch);
					break;
				case '}':
				case ']':
				case ')':
					if(!theStack.isEmpty()){
						char chx = theStack.pop();
						if((ch=='}' && chx!='{') || (ch==']' && chx!='[') || (ch==')' && chx!='(')){
							System.out.println("Error at "+j);
						}
					}else{
						break;
					}
				default:
					break;	
			}
		}
		if(!theStack.isEmpty())
			System.out.println("All the brackets didnt close");
		return;
	}
}