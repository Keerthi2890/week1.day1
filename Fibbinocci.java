package week1.day1;

public class Fibbinocci {

	public static void main(String[] args) {
		int firstNum=0;
		int secondNum=1;
		int sum;
		int i;
		int count= 10;
		
		System.out.println(firstNum);
		System.out.println(secondNum);
		for(i=1; i<=count; i++) {
			sum = firstNum + secondNum;
			System.out.println(sum);
			 firstNum = secondNum;
			 secondNum = sum;
			
		}
			
			
			
		

	}

}
