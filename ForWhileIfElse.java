package java_lectures;
import java.util.Scanner;

public class ForWhileIfElse {
	public static void main(String[] args) {
		
		for (int i =1; i<10; i++) {
			
				if (i % 2 ==0) {
					System.out.println(i);
											}
				else {
					System.out.println("TEK RAKAM ");
														}
		}
		System.out.println();
		
		for ( int j =1; j<10; j++) {
			for (int k=1; k<10; k++) {
				
				if (j+k ==10) {	
					System.out.println(j+ "+" + k + " = 10");
				}
			}
			
		}
	
		System.out.println();
		
		int a = 10;
		while (a <=100) {
			System.out.println(a);
			a += 10;
		}
	
		System.out.println();
	
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1. vize notunu giriniz : ");		
		int grade_1 = scanner.nextInt();
		
		System.out.print("2. vize notunu giriniz : ");
		int grade_2 = scanner.nextInt();
		
		if ( (grade_1 + grade_2)/2 > 50 ) {	
		
			System.out.println(" DURUM : GEÇTİ");	
													}
		else {
			System.out.println(" DURUM : KALDI");
													}
	
	scanner.close();
	}
}
