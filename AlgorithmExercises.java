package java_lectures;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class AlgorithmExercises {
	
	// Array - ArrayList Exercises
	public static int findInterval(int[] myArray ) {

		int myLen = myArray.length;
		int min = myArray[0];
		int max = myArray[0];
		
		for (int i = 1; i < myLen; i++) {
			if (myArray[i] < min) {
				min = myArray[i];
			}
			if (myArray[i] > max){
				max = myArray[i];
			}
		}
		return (max-min);
	}
	public static int checkSpecialElement(int[] myArray) {
		int currentSum = 0;

	    for (int i = 1; i < myArray.length; i++) {
	        currentSum += myArray[i - 1]; 

	        if (currentSum == myArray[i]) {
	            return myArray[i]; 
	        }
	    }
	    return -1; 
	}
	public static int[] productOfOthers(int[] myArray) {
		int[] productArray = new int[myArray.length];
		int totalProduct = 1;
		
		for (int i = 0; i < myArray.length; i++) {
			totalProduct *= myArray[i];
		}
		
		for (int i = 0; i < productArray.length; i++) {
			productArray[i] = totalProduct / myArray[i];
		}
		return productArray;
	}
	public static int[] countGreaterElements(int[] myArray) {
		int[] greaterCountArray = new int[myArray.length];
		for (int i = 0; i < myArray.length; i++) {
			int counter = 0;
			for (int j = i+1; j < myArray.length; j++) {
				if (myArray[i] < myArray[j]) {
					counter += 1;
				}
			}
			greaterCountArray[i] = counter;
		}
		return greaterCountArray;
	}
	public static ArrayList<Integer> removeDuplicates(int[] inputList){
		ArrayList<Integer> noDuplicatedList = new ArrayList<Integer>();
		Set<Integer> seen = new HashSet<Integer>();
		
		for (Integer element : inputList) {
			if (!seen.contains(element)) {
				seen.add(element);
				noDuplicatedList.add(element);
			}	
		}
		return noDuplicatedList;
	}
	
	public static int fibonacci(int nthElement) {
		if (nthElement == 0) {
			return 0;
		}
		if (nthElement == 1) {
			return 1;
		}
		return fibonacci(nthElement - 1) + fibonacci(nthElement - 2);
	}
	
	public static int sumNestedList(List<Object> nestedList) {
		int totalSum = 0;
		for (Object currentElement : nestedList) {
			if (currentElement instanceof Integer) {
				totalSum += (Integer) currentElement;
			}
			if (currentElement instanceof List) {
				totalSum += sumNestedList((List<Object>) currentElement);
			} 
		}
		return totalSum;
	}
	
	public static boolean checkIfPrime(int number) {
		int divisionCounter = 0;
		for (int i=2; i<number; i++) {
			if (number % i == 0) {
				divisionCounter += 1;
			}
		}
		if (divisionCounter ==0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean checkIfPerfect(int number) {
		int totalSum = 0;
		for (int i=1; i<number; i++) {
			if (number % i ==0) {
				totalSum+= i;
			}
		}
		if (totalSum == number) {
			return true;
		}
		else {
			return false;
		}
	}
	
	// String - Hashmap Exercises
	public static HashMap<Character,Integer> countLetters(String input){
		HashMap<Character,Integer> letterCounterDictionary = new HashMap<Character,Integer>();
		
		for (int i = 0; i < input.length(); i++){
			if (Character.isLetter(input.charAt(i))) {
				char letter = input.charAt(i);
				if (letterCounterDictionary.containsKey(letter)) {
					int counter = letterCounterDictionary.get(letter);
					letterCounterDictionary.put(letter, counter+1);
				}
				else {
					letterCounterDictionary.put(letter, 1);
				}
			}  
		}
		return letterCounterDictionary;
	}
	
	public static void main(String[] args) {
		
		int[] myArray = {5,1,2,3,5,8,2,3,1}; 
		List<Object> myArrayList = new ArrayList<Object>(Arrays.asList((1),2,(3),4,5,(6)));
		
		System.out.println("ARRAY : " + Arrays.toString(myArray));
		System.out.println("Maximum interval : " +  findInterval(myArray));
		System.out.println("Special element : " + checkSpecialElement(myArray));
		System.out.println("Product Array : " + Arrays.toString(productOfOthers((myArray))));
		System.out.println("Greater Element Counter Array To the right : " + Arrays.toString(countGreaterElements(myArray)));
		System.out.println("No duplicated array : " + removeDuplicates(myArray));
		System.out.println("Fibonacci value : " + fibonacci(8));
		System.out.println("Nested list summed value : " + sumNestedList(myArrayList));
		
		System.out.println();
		
		System.out.println(countLetters("python-java-react-html-css-javascript"));
		System.out.println();
		
		System.out.println(checkIfPrime(28));
		System.out.println(checkIfPerfect(12));
	}

}
