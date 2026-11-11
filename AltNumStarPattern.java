class AltNumStarPattern{
	public static void main(String args[]){
		for(int i =1;i<=5;i++){
			if(i%2 != 0){
				for(int j = 0;j<5;j++){
					System.out.print(i);
				}
			}
			else{
				for(int k = 0;k<5;k++){
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}