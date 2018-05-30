import javax.swing.JOptionPane;

public class OwnAdventure {

	public static void main(String[] args) {
		
		String q1 = JOptionPane.showInputDialog("The warrior walks through the forest as he searches for a quest "
				+ "to complete. He stops, and looks up to find two tall doors sitting in front of him. Should he open the left one or the right one?");
		
		if (q1.equalsIgnoreCase("Left")) {
			String q2 = JOptionPane.showInputDialog("He pushes the door open and looks around.");
		}
		else if (q1.equalsIgnoreCase("Right")){
			String q3 = JOptionPane.showMessageDialog(null, "He looks around the room. He spots a hole leading donward,"); 
		}
		}
}