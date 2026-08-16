import java.util.Scanner;

class ShoppingBill{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Item Price :");
		int price = sc.nextInt();
		
		System.out.print("Enter Quantity :");
		int qty = sc.nextInt();
		
		double tot = price*qty;
		if(tot > 5000){
			double dis = tot*(0.1);
			double bill = tot - dis;
			
			System.out.println("Discount Applied (10%)");
			System.out.println("Total bill Amount :"+bill);
			
		}
		else{
			System.out.println("Total bill Amount :"+tot);
		}
	}
}