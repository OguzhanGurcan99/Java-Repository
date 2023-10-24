package java_lectures;

public class JavaClasses {
	
	String explanation = "Zorunlu";
	int akts = 5;
	boolean isOptional = false;
	
	
	// Static method example
	static void giveInformation() {
		System.out.println("Ders kayıtları başlamıştır ! ");
	}
	
	// Public method example
	public void firstTaken( boolean answer) {
		if (answer == true ) {
			System.out.println("Bu dersi ilk defa alıyorsunuz ");	
		}
		else {
			System.out.println("Başarısız ders notu :  F3");
		}
	}
	
	public static void main(String[] args) {
		
		JavaClasses firstLecture = new JavaClasses();
		JavaClasses secondLecture = new JavaClasses();
		
		System.out.println( "Explanation : " + firstLecture.explanation);
		System.out.println("AKTS : "  + firstLecture.akts);
		System.out.println("isOptional : " + firstLecture.isOptional);
		System.out.println();
		
		// Modifying default attribute( akts ) for requested object. 
		secondLecture.akts = 3;
		System.out.println("Updated akts : " + secondLecture.akts);
		System.out.println();
		
		giveInformation();
		secondLecture.firstTaken(true);
		// Public methods must be called with objects ! 
				

	}

}
