package LargestNUmJava;

public class IsLarge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Please Enter First Number: ");
		int a = Utility.getUserSpecificInteger();
		System.out.println("Please Enter Second Number: ");
		int b = Utility.getUserSpecificInteger();
		System.out.println("Please Enter Third Number ");
		int c = Utility.getUserSpecificInteger();
		if (a >= b && a >= c)
			System.out.println(a + " is the largest number.");
		else if (b >= a && b >= c)
			System.out.println(b + " is the largest number.");
		else
			System.out.println(c + " is the largest number.");
	}

}
