package java_lectures;

public class CarpımTablosu {
	public static void main(String[] args) {
		
		String bosluk = " ";
		for (int i =1; i < 10; i++) {
			for (int j =1; j < 10; j++) {
			
				if ( (i*j)>=10 ) {
					System.out.print( (i*j) + bosluk + bosluk);
				}
				
				else {	
						System.out.print( (i*j) + bosluk + bosluk + bosluk);
				}
			
			
			if (j == 9) { 
				System.out.println();
			}
											}	
												}
			
														}

																}
