public class towersApp{

	public static int size;

	public static void main(String[] args){
		size = 4;
		moveDisks(size,'A','B','C');
	}

	public static void moveDisks(int topN,char from,char inter,char to){
		if(topN==1){
			System.out.println("Move Disk 1 from " +from+" to "+to);
		}else{
			moveDisks(topN-1,from,to,inter);
			System.out.println("Move Disk "+topN+" from "+from+" to "+to);
			moveDisks(topN-1,inter,from,to);
		}
		return;
	}


}