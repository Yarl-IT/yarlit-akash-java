import java.util.Scanner;

class GradeCalculator{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter marks for subject 1 :");
		int sub1 = sc.nextInt();
		
		System.out.print("Enter marks for subject 2 :");
		int sub2 = sc.nextInt();
		
		System.out.print("Enter marks for subject 3 :");
		int sub3 = sc.nextInt();
		
		int total = sub1+sub2+sub3;
		double avg = total/3;
		
		if(avg>=75 && avg<=100){
			System.out.println("Grade : A");
		}
		else if(avg>=65 && avg<75){
			System.out.println("Grade : B");
		}
		else if(avg>=55 && avg<65){
			System.out.println("Grade : C");
		}
		else if(avg>=35 && avg<55){
			System.out.println("Grade : S");
		}
		else{
			System.out.println("You are fail");
		}
		
	}
		
}