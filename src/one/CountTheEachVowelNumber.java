package one;
import java.util.HashMap;
import java.util.Scanner;

public class CountTheEachVowelNumber {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String str = scanner.nextLine().toLowerCase();
            scanner.close();
	        HashMap<Character, Integer> vowelCount = new HashMap<>();
	        vowelCount.put('a', 0);
	        vowelCount.put('e', 0);
	        vowelCount.put('i', 0);
	        vowelCount.put('o', 0);
	        vowelCount.put('u', 0);

	        for (char ch : str.toCharArray()) {
	            if (vowelCount.containsKey(ch)) {
	                vowelCount.put(ch, vowelCount.get(ch) + 1);
	            }
	        }

	        System.out.println("Vowel counts: " + vowelCount);
	    
	}
}


