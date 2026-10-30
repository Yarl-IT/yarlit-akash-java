import java.util.Scanner;

public class PasswordChecker{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		String corrPassword = "@yarlit123";
		
		int attempt = 0;
		int maxAttempt = 3;
		
		
		while(attempt < maxAttempt){
			System.out.print("Enter your password : ");
			
			String inPassword = sc.nextLine();
			
			if(corrPassword.equals(inPassword)){
				System.out.println("Access Granted");
				
				break;
			}
			else{
				attempt++;
				
				int remaining = maxAttempt - attempt;
				
				if(remaining > 0){
					System.out.println("Wrong password. Attempts left: "+ remaining);
				}
				else{
					System.out.println("Access Blocked!");
				}
			}
			
		}
		sc.close();
	}
}