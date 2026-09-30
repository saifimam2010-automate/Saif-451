package daily_Assignments;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*	
		 	Q2. Even or Odd
			Write a Java program to check whether the given number 15 is even or odd.
			Sample Output:
			The number is odd.	
		*/
		
		int num =-20;
		if(num != 0 && num%2 == 0) {
			System.out.println(num + " Is an Even number!");
		}
		else if(num%2 != 0)
			System.out.println(num+" Is an Odd number");
		else
			System.out.println("invalid input");

	}

}
