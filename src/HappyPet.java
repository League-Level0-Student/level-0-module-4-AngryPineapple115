import javax.swing.JOptionPane;

public class HappyPet {

	// 2. Add the following variable to the next line: static int happinessLevel =
	// 0;
	// this will be used to store the happiness of your pet

	static int happinesslevel = 0;
	static String pet;

	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in
		// a variable

		pet = JOptionPane.showInputDialog("What kind of pet would you like to buy?");

		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		int task = 0;
		for (int i = 0; i < 5; i++) {

			// 3. Use showOptionDialog to ask the user what they want to do to make their
			// pet happy
			// (eg: cuddle, food, water, take a walk, groom, clean up poop).
			// Make sure to customize the title and question too.
			task = JOptionPane.showOptionDialog(null, "Pick one:", "Make your " + pet + " happier!", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Feed", "Play", "Groom" }, null);
			// 2-1-0
			System.out.println(task);
			// 5. Use user input to call the appropriate method created in step 4.
			if (task == 1) {
				play();
			}
			if (task == 2) {
				groom();
			}
			if (task == 0) {
				feed();
			}
			// 6. If you determine the happiness level is large enough, tell the
			// user that he loves his pet and use break; to exit for loop.
		}
		JOptionPane.showMessageDialog(null, "You love your pet!");
		// 4. Create methods to handle each of your user selections.
		// Each method should create a pop-up with the pet's response (eg. cat might
		// purr when pet),
		// and INCREMENT the pet's happiness Level.

	}

	static void groom() {
		JOptionPane.showMessageDialog(null, "Your " + pet + " Just won the prize for 'Best Groomed " + pet + "!'");
		happinesslevel++;
	}

	static void play() {
		JOptionPane.showMessageDialog(null, "Your " + pet + " gets excercise!");
		happinesslevel++;
	}

	static void feed() {
		JOptionPane.showMessageDialog(null, "Your " + pet + " isn't hungry anymore.");
		happinesslevel++;
	}
}