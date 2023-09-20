package java_lectures;
import java.util.Arrays;
import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		/*
		System.out.print("Adınızı giriniz : " );
		String name = scanner.nextLine();
		
		System.out.print("Yaşınızı giriniz : " );
		int age = scanner.nextInt();
		
		System.out.println();
		System.out.println(name);
		System.out.println(age);
		*/
		
		//  PART 2 >>>>>   Diziye alınan inputları doldurma 
		
		System.out.print(" İsimler diziniz kaç elemanlı olacak ? : " );
		int my_length = scanner.nextInt();
		scanner.nextLine();
		
		String[] isimler_dizisi = new String[my_length];
		
		for (int i =0; i < my_length; i++) {
		
			System.out.print( (i+1) + " . ismi giriniz :  ");
			String isim = scanner.nextLine();
			isimler_dizisi[i] = isim;
	}	
		
		System.out.println(Arrays.toString(isimler_dizisi));
		scanner.close();
	}
}
