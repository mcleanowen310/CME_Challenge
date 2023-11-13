/**
 * 
 */
package cme;

import java.util.*;

/**
 * 
 */
public class CME_Challenge {

	/**
	 * This is our main method for the anagram checker
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter username: ");
		String username = scanner.nextLine();

		System.out.println("Enter the first text value: ");
		String textValue1 = scanner.nextLine();

		System.out.println("Enter the second text value: ");
		String textValue2 = scanner.nextLine();

		if (isValidInput(username) && isValidInput(textValue1) && isValidInput(textValue2)) {
			if (areAnagrams(textValue1, textValue2)) {
				System.out.println("The texts are anagrams!");
			} else {
				System.out.println("The texts are not anagrams.");
			}

			// in here I would have put something in to update the cache and write to an
			// external file if I had known how too
		} else {
			System.out.println("Invalid input. Please make sure to avoid spaces and numbers."); // I'm aware I wasn't
													    // able to negate the
													    // numbers, I wasn't
													    // sure how to do this
		}
		scanner.close();
	}

	/**
	 * Checks if the input given by the user is valid
	 * 
	 * @param input
	 * @return true if there are no spaces or numbers(if I got the number part
	 *         working)
	 */
	private static boolean isValidInput(String input) {
		return !input.contains(" ");
	}

	/**
	 * checks if the two text values are anagrams of each other
	 * 
	 * @param str1
	 * @param str2
	 * @return true if the arrays in order are equal, and false if they aren't
	 */
	private static boolean areAnagrams(String textValue1, String textValue2) {
		char[] charArray1 = textValue1.toCharArray();
		char[] charArray2 = textValue2.toCharArray();

		Arrays.sort(charArray1);
		Arrays.sort(charArray2);

		return Arrays.equals(charArray1, charArray2);
	}

}
