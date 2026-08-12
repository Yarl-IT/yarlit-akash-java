class ElseIfMarks{
	public static void main(String args[]){
		int marks = 67;
		
		if((75<=marks) && (marks<=100)){
			System.out.println("Grade : A");
		}
		else if((65<=marks) && (marks<75)){
			System.out.println("Grade : B");
		}
		else if((55<=marks) && (marks<65)){
			System.out.println("Grade : C");
		}
		else if((45<=marks) && (marks<55)){
			System.out.println("Grade : D");
		}
		else if((0<=marks) && (marks<45)){
			System.out.println("Grade : F");
		}
		else{
			System.out.println("Invalid Marks. Please Enter marks into 1 to 100.");
		}
	}
}