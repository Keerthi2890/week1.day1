package week1.day2.assignments.mandatory;

public class ChangeOddIndexToUpperCase {
	public static void main(String[] args) {
		String test = new String("changeme");
		for(int i=0;i<=test.length()-1;i++)
		{			
			if(i%2==0)
			{				
				System.out.print(test.toUpperCase().charAt(i));
			}
			else
			{
				System.out.print(test.toLowerCase().charAt(i));
			}
			}
		}
	}
	