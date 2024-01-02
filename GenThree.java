/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
	        int b = Integer.parseInt(args[1]);
	        int gap = b-a;
	        double randomNum1 = (gap * Math.random()) + a;
	        double randomNum2 = (gap * Math.random()) + a;
	        double randomNum3 = (gap * Math.random()) + a;
	        System.out.println((int)randomNum1);
	        System.out.println((int)randomNum2);
	        System.out.println((int)randomNum3);
		// #Feedback: better to not do calculation in print commands
		int min = (int)(Math.min(Math.min(randomNum1,randomNum2), randomNum3)) )'
	        System.out.println("The minimal generated number was " + min;
	}
}
