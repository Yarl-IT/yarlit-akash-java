import java.util.Scanner;

class ATM{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int balance = 10000;
		char choice;
		
		do{
			System.out.println("----- ATM MENU ----");
			System.out.println("1. Check Balance");
			System.out.println("2. Deposite");
			System.out.println("3. Withdraw");
		
			System.out.print("Choose Option :");
			int option = sc.nextInt();
		
			switch(option){
				case 1:
					System.out.println("Balance :"+balance);
					break;
				
				case 2:
					System.out.print("Enter Deposite Amount :");
					int dep = sc.nextInt();
					balance += dep;
					System.out.println("Updated Balance :"+balance);
					break;
				
				case 3:
					System.out.print("Enter withdrawal amount : ");
					int wd = sc.nextInt();
					sc.nextLine();
					balance -= wd;
					System.out.println("Updated Balance : "+balance);
					break;
					
				default:
					System.out.println("Invalid Option");
					
			}
			System.out.print("Do you want another option? ( y / n ) :");
			choice = sc.next().charAt(0);
			System.out.println("");
			
		} while(choice == 'y' || choice == 'Y');
		System.out.println("Thank You! Have a nice day.");
		
	}
}