class HighestMarks{
	public static void main(String args[]){
		int[] marks = {69,40,50,90,85};
		int max = marks[0];
		
		
		for(int i = 0;i<marks.length;i++){
			
			if(marks[i]>max){
				max = marks[i];
			}
		}
		System.out.println("Highest Marks : "+max);
		
	}
}