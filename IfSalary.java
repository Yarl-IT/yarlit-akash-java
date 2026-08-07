class IfSalary{
	public static void main(String args[]){
		int employeeSalary = 50000;
		double tax;
		double netSalary;
		System.out.println("Employee Basic Salary : "+employeeSalary);
		
		if(employeeSalary>100000){
			tax = employeeSalary*0.03;
			System.out.println("Tax		:"+tax);
		}
		else{
			tax = employeeSalary*0.01;
			System.out.println("Tax		:"+tax);
		}
		netSalary = employeeSalary - tax;
		System.out.println("Net Salary 	:"+netSalary);
		
	}
}