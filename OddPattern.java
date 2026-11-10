class OddPattern{
	public static void main(String args[]){
		int[] num = {1,3,5};
		for(int i = 0;i<5;i++){
			for(int j = 0; j<num.length;j++){
				System.out.print(num[j]);
				
				if(j<num.length-1){
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}