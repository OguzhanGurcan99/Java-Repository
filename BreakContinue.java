package java_lectures;
public class BreakContinue {

	public static void main(String[] args) {
		
		int target_number;	
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		
			if (i ==6){
				target_number = i;
				System.out.println("Target number " + target_number + " is found ! " );
				break;
						}
																	}
		System.out.println("Loop is breaked ! ");
		System.out.println();
		
		for (int i = 0; i <= 5; i++) {
		 
			if (i ==3 || i ==4)
			{
				continue;
			}
			System.out.println(i);
		}
		
	}
}
