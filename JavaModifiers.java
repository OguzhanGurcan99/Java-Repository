package java_lectures;

public class JavaModifiers {
	
	// Java Modifiers
	//	1 - Access Modifiers : Control the level of access
	//  2 - Non - Access Modifiers : Control other features
	
	// Access Modifiers : Public - Private - Protected 
	//  2 - Non - Access Modifiers : Static - Final - Abstract
	
	public static void main(String[] args) {
		
		FirstClass firstObject = new FirstClass();
		System.out.println(FirstClass.number);
		System.out.println(firstObject.check);
		System.out.println();
		
		SecondClass secondObject = new SecondClass();
		System.out.println(secondObject.announcement);
	//	System.out.println(secondObject.password);
		System.out.println(secondObject.messageTransferred);
		
	}

}

final class FirstClass {
	
	static int number = 7;
	public boolean check = true;
}

final class SecondClass {
	
	public String announcement = "Hello";
	private int password = 123;
	protected String messageTransferred = "Inherite information to subclasses ! ";
}

final class ThirdClass {
	int digit;
	String text;
	boolean firstControl;
}
