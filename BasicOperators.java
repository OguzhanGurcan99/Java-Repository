package java_lectures;
public class BasicOperators {
	public static void main(String[] args) {

		int num1 = 18;
		int num2 = 50;
		
		int mean = (num1 + num2)/ 2;
		int product = num1 * num2;
		int mod = num2 % num1;
		
		boolean check1 = num2 < num1;
		boolean check2 = num1 != num2;
		
		System.out.println("mean : " +mean);
		System.out.println("product : " + product);
		System.out.println("mod : "+ mod);
		System.out.println("check1 : " + check1);
		System.out.println("check2 : " + check2);
		
		int a = 9;
		a++;
		a *=2;
		System.out.println("a : " + a);
															}
}
