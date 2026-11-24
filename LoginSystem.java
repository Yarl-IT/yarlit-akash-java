import java.util.Scanner;

class LoginSystem{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		String uName = "admin";
		int pWord = 1234;
		
		System.out.print("Enter username: ");
		String name = sc.nextLine();
		
		System.out.print("Enter password: ");
		int pass = sc.nextInt();
		
		if(name.equals(uName) && (pass == pWord)){
			System.out.println("Login Successful");
		}
		else{
			System.out.println("Invalid Login");
		}
		
	}
}