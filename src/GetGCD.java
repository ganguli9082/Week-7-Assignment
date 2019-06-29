import java.util.Scanner;

public class GetGCD {

	public static void main(String[] args) throws ExceptionGCD {
		
		ExceptionGCD NegativeInt = new ExceptionGCD("A negative int was entered");
		
		ExceptionGCD relativeprime = new ExceptionGCD("The GCD is 1");
		int NUM1, NUM2, GCD = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a positive integer: ");
		NUM1 = scan.nextInt();
		System.out.println("");
		System.out.print("Enter another positive integer: ");
		NUM2 = scan.nextInt();
		System.out.println("");
		
		for (int i = 1; i<= NUM1 && i<= NUM2; i++)
    	{
    		if (NUM1 % i == 0 && NUM2 % i == 0)
    			GCD = i;
    	}
		
		if (GCD == 1)
			throw relativeprime;
		if (NUM1<= 0 || NUM2<=0)
			throw NegativeInt;
		else
			System.out.println("The GCD is: " + GCD);
	}
}


