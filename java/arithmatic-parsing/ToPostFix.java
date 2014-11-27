public class ToPostFix{
	
	String output;
	String input
	StackX theStack;

	public ToPostFix(String in){
		input = in;
		theStack = new StackX(input.length());
		output = "";
	}

	public String doTrans(){
		
		for(int j=0;j<input.length();j++){
			char ch = input.charAt(j);
			switch(ch){
				case "+":
				case "-":
					gotOp(ch,1);
					break;
				case "*":
				case "/":
					gotOp(ch,2);
					break;
				case "(":
					theStack.push(ch);
					break;
				case ")":
					gotParen();
					break;
			}
		}
		while(!theStack.isEmpty()){
			output = output + theStack.pop();
		}
	
		return output;
	}

	public void gotOp(char opThis,int prec1){
		if(!theStack.isEmpty()){
			char opTop = theStack.pop();
			int prec2;
			if(opTop == "(")
				theStack.push(opTop);
				theStack.push(opThis);
				return;
			else{
				if(opTop == "+" || opTop == "-")
					prec2 = 1;
				else if(opTop =="*" || opTop == "/")
					prec2 = 2;
			}
			if(prec1>=prec2){
				output = output + opThis;
				theStack.push(opTop);
			}else{
				output = output + opTop;
				theStack.push(opThis);
			}
		}else{
			theStack.push(opThis);
		}
	}

	public void gotParen(){
		char chx = theStack.pop();
		while(chx!="("){
			output = output + chx;
			chx = theStack.pop();
		}
	}	

}