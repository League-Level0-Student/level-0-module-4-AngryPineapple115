import java.awt.Choice;

import javax.swing.JOptionPane;

public class OwnAdventure {

	public static void main(String[] args) {

		int choice = 0;
		choice = JOptionPane.showOptionDialog(null,
				"It was a bright, sunny Monday, and Sticky the Stickman was sitting in a hole in his lawn. He heard someone cry for help. What should he do?",
				"Choose sticky's path!", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Help the person!", "Stay where you are; it's probably not THAT important." }, null);
		int help = 0;
		if (choice == 0) {

			help = JOptionPane.showOptionDialog(null,
					"Sticky runs over to the man frantically waving his hand in the air.\n Help! My kids treehouse is on FIRE! \n Um...I don't really know how to help, but "
							+ "I have a lot of buckets down in my basement, and I could fill them up with SOMETHING.",
					"Choose Sticky's path!", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Fill the buckets with water.", "Fill up the buckets with lava.",
							"Leave all the buckets empty." },
					null);

			if (help == 2) {
				JOptionPane.showMessageDialog(null,
						"Why are all the buckets empty? \n Because I didn't feel like carrying that much water up 20 stairs. Sticky dug himself"
								+ " in a hole, and fell asleep, all while the man's house was still burning. \n THE END");
			} else if (help == 1) {
				JOptionPane.showMessageDialog(null,
						"Sticky returns from his basement carrying many buckets, looking VERY tired. He "
								+ "throws all of the buckets filled with lava on the treehouse AND the house. "
								+ "They both start to burn. \n What are you DOING?! \n Just doing my job! \n THE "
								+ "END");
			} else if (help == 0) {

				JOptionPane.showMessageDialog(null,
						"Sticky returns from his basement carrying 6 buckets full of water on EACH ARM. \n Thank you, THANK YOU! can I have the "
								+ "buckets so I can put out the fire? \n Oh, I wasn't going to give these to YOU. I was going to drink all of them in fron of you while you stare at"
								+ " me. \n And that's exactly what he did. The man just stood there in shock, while his whole backyard was on fire.");

			}
		} else if (choice == 1) {
			JOptionPane.showMessageDialog(null,
					"Sticky stays in the hole and starts to fall asleep, because he didn't feel like helping anyone on a Monday. \n THE END!!");
		}

	}
}
