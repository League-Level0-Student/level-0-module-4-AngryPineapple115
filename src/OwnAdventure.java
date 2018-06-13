
//911 = 2, Stay there = 1, Help = 0
//Empty = 2, Lava = 1, Water = 0
import java.awt.Choice;

import javax.swing.JOptionPane;

public class OwnAdventure {

	public static void main(String[] args) {

		int choice = 0;
		choice = JOptionPane.showOptionDialog(null,
				"It was a bright, sunny Monday, and Sticky the Stickman was sitting in a hole in his lawn. He heard someone cry for help. What should he do?",
				"Choose sticky's path!", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Help the person!", "Stay where you are; it's probably not THAT important." }, null);
		System.out.println(choice);
		int help = 0;
		if (choice == 0) {
			

			help = JOptionPane.showOptionDialog(null,
					"Sticky runs over to the man frantically waving his hand in the air.\n Help! My kids treehouse is on FIRE! \n Um...I don't really know how to help, but "
							+ "I have a lot of buckets down in my basement, and I could fill them up with something.",
					"Choose Sticky's path!", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Fill the buckets with water.", "Fill up the buckets with lava.",
							"Leave all the buckets empty." },
					null);
			System.out.println(help);

		} else if (choice == 1) {
			JOptionPane.showMessageDialog(null, "Sticky stays in the hole and starts to fall asleep, because he didn't feel like helping anyone on a Monday. \n THE END!!");
		}
		if (help == 1) {
			JOptionPane.showMessageDialog(null, "Sticky returns from his basement carrying many buckets, looking VERY tired. ");
		}
	}
}
