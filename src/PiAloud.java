
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class PiAloud {

	// 1. Make a main method and make sure your program can run
	public static void main(String[] args) {

		// 2. Make a String variable to hold the value of Pi. You could use
		// http://www.piday.org/million/ for the value.

		String pi = "3.14159265";

		// 3. Print out some digits of Pi. The first value is "pi.charAt(0)", the second
		// is "pi.charAt(1)"

		System.out.println(pi.charAt(0));
		System.out.println(pi.charAt(1));
		System.out.println(pi.charAt(2));
		System.out.println(pi.charAt(3));

		// 4. Print ALL the digits of of Pi (hint: use a loop)

		for (int a = 0; a < args.length; a++) {
			System.out.println(pi.charAt(a));
		}
		// 5. Use the speak() method to speak all the digits of Pi.
		for (int b = 0; b < 10; b++) {
			speak(pi.charAt(b));
		}

		// [ADVANCED]
		// *6. Get a character from the user using the getInputFromUser() method
		// *7. Compare the users' char to the next digit of Pi
		// *8. If they are correct, print out "correct". If they are not, print
		// "incorrect" to System.err.println
	}

	static void speak(char characterToSpeak) {
		try {
			Runtime.getRuntime().exec("say " + characterToSpeak).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void pause(int seconds) {
		try {
			Thread.sleep(1000 * seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	static char getInputFromUser() {
		Scanner scanner = new Scanner(System.in);
		return scanner.next().toCharArray()[0];
	}

}