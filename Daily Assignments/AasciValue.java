package daily_Assignments;

public class AasciValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Assignment #1
		/*  Write a Java program to print the ASCII value of the following characters:
    		• A 
    		• a 
    		• 0 
    		• @   
    */
		
		char charr = 'A';
		int asci = charr;
		System.out.println("aasci value of A is: "+asci);
		
		char charr1 = 'a';
		int asci1 = charr1;
		System.out.println("aasci value of a is: "+asci1);
		
		char charr2 = '0';
		int asci2 = charr2;
		System.out.println("aasci value of 0 is: "+asci2);
		
		char charr3 = '@';
		int asci3 = charr3;
		System.out.println("aasci value of @ is: "+asci3);
		
		// Assignment #2
		/*	Write a Java program to print the following triangle pattern using only System.out.println() statements.
		Expected Output:
		 
		 *
		 **
		 ***
		 ****
		 *****	
		 
		 */
		
		System.out.println("*");
		System.out.println("* *");
		System.out.println("* * *");
		System.out.println("* * * *");
		System.out.println("* * * * *");
		
		// Assignment #3
		/*	Create a Java program that:
    		1. Stores 10.75 in a double variable. 
    		2. Explicitly typecasts it to an int variable. 
    		3. Prints both values.	
    	*/
		
		double var = 10.75;
		int vardouble = (int) var;
		System.out.println("actual double value: "+ var);
		System.out.println("value of int after explicit typcasting: "+vardouble);

	}

}
