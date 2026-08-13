import java.util.Scanner;

class ArraySum{
	public static void main(String arg[]){
		Scanner scan = new Scanner(System.in);
		
		int[] x = new int[5];
		
		int sum = 0;
		
		System.out.println("Enter 5 numbers :");
		
		for(int i=0;i<x.length;i++){
			x[i] = scan.nextInt();
			sum = sum + x[i];
		}
		
		System.out.println("Sum of array eliments :"+sum);
		
	}
}