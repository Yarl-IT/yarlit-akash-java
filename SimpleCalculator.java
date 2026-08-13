import java.util.Scanner;

class SimpleCalculator{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter First Number :");
		double num1 = input.nextDouble();
				
		System.out.print("Enter Second Number :");
		double num2 = input.nextDouble();
		
		System.out.println("");
		System.out.print("Choose Operations :\n1. Addition (+)\n2. Subtraction (-)\n3. Multiplication (*)\n4. Division (/)\n");
		
		
		System.out.print("Enter your choice :");
		int operation = input.nextInt();
		
		switch(operation){
			case 1:
			System.out.println("Result :"+(num1+num2));
			break;
			
			case 2:
			System.out.println("Result :"+(num1-num2));
			break;
			
			case 3:
			System.out.println("Result :"+(num1*num2));
			break;
			
			case 4:
			System.out.println("Result :"+(num1/num2));
			break;
			
			default:
			System.out.println("Choose any operation number.");
		}
		
	}
}