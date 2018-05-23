import javax.swing.JOptionPane;

public class TestScore {

	public static void main(String[] args) {

		String test = JOptionPane.showInputDialog("What was your last test score? (And you CAN put it in a decimal.)");
		double score = Double.parseDouble(test);

		if (score > 90) {
			JOptionPane.showMessageDialog(null, "Wow! You must have studied hard!");
		} else if (score > 80 && score < 90) {
			JOptionPane.showMessageDialog(null, "Not bad!");
		} else if (score > 50 && score < 80) {
			JOptionPane.showMessageDialog(null, "I think you could have done better...");
		} else if (score > 20 && score < 50) {
			JOptionPane.showMessageDialog(null,
					"You should have studied more instead of playing Clash of Clans all night.");
		} else if (score > 0 && score < 20) {
			JOptionPane.showMessageDialog(null, "What were you doing 'preparing' for this?");
		} else if (score == 0) {
			JOptionPane.showMessageDialog(null, "What kind of score is that?");
		}

	}
}