package week1.day2.assignments.mandatory;

public class RemoveDuplicates {

	public static void main(String[] args) 
	{
		String test= "We learn java basics as part of java sessions in java week1";
		int count;
		test=test.toLowerCase();
		String words[]=test.split(" ");
		for(int i = 0; i < words.length; i++) 
		{  
            count = 1;  
            for(int j = i+1; j < words.length; j++) 
            {  
                if(words[i].equals(words[j])) 
                {  
                    count++;                     
                    words[j] = "0";  
                }
            }		
		if(count <= 1 && words[i] != "0")  
            System.out.print(words[i]+" ");  
	}
}
}

