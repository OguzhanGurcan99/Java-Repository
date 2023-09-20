package java_lectures;
import java.util.Arrays;

public class Arrayss {
	public static void main(String[] args){
		
		int[] Array1 = {0,1,2,3,4,5};
		String[] Array2 = {"türkiye","fransa","almanya"};
		boolean[] Array3 = { false,false,true};
		char[] Array4 = {'O','G','U','Z','H','A','N'};
		
		System.out.println(Arrays.toString(Array1));
		System.out.println(Arrays.toString(Array2));
		System.out.println(Arrays.toString(Array3));
		System.out.println(Arrays.toString(Array4));
		
		{	
		for (int i=0; i< Array4.length; i++)
			System.out.println(Array4[i]);
												}
																}
}
