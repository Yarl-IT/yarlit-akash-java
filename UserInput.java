import java.util.Scanner;

class UserInput{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		String name = "";
		System.out.print("Enter your name :");
		name = sc.next();
		System.out.println("Your name is "+name);
		
		System.out.println("******************");
		
		int marks = 0;
		System.out.print("Enter your marks :");
		marks = sc.nextInt();
		System.out.println("Your marks is "+marks);
	}
}