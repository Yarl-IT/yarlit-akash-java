import java.util.Scanner;

class StudentMarksArray{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int[] marks = new int[5];
		int total = 0;
		
		
		
		for(int i=0;i<marks.length;i++){
			System.out.print("Enter marks for subject "+(i+1)+" : ");
			marks[i] = sc.nextInt();
			
			total = total + marks[i];
		}
		double avg = (double)total/marks.length;
		
		System.out.println("Total marks : "+total);
		System.out.println("Average marks : "+avg);
		
		sc.close();
		
	}
}