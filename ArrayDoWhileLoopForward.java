class ArrayDoWhileLoopForward{
	public static void main(String argsp[]){
		int[] x = {10,20,30,40,50};
		
		int i = 0;
		do{
			System.out.println(x[i]);
			i++;
		}while(i<x.length);
	}
}