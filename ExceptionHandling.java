package java_lectures;

public class ExceptionHandling {

	static void rakamGir(int rakam){
		if (rakam >= 10) {
			throw new Error("Geçerli bir rakam giriniz ! ");
		}
		else {
			System.out.println("Girilen rakam : " + rakam);
		}	
	}
	
	static int  indexKullan(int myIndex ) {
		int[] array = {1,2,3};
		int output = 0;
		
		try {
			 output =  array[myIndex];
		}
		catch (ArrayIndexOutOfBoundsException e){	
			throw new ArrayIndexOutOfBoundsException("İndex değeri geçersiz ! ");		
		}
		
		return output;
	}
	
	
	public static void main(String[] args) {
		rakamGir(100);
		System.out.println(indexKullan(8));
		

	}

}
