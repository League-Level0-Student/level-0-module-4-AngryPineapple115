import javax.swing.JOptionPane;

public class SimpleCalculator {
	
	static double calc1 = 0;
	static double calc2 = 0;
	
	public static void main(String[] args) {

		// 1. Get 2 numbers from the user and convert them to integer.
		for (int i = 0; i < 4; i++) {

			String n1 = JOptionPane.showInputDialog("Pick a random  number 6-10");
			calc1 = Double.parseDouble(n1);

			String n2 = JOptionPane.showInputDialog("Pick another number that is from 1-5");
			calc2 = Double.parseDouble(n2);

			// 2. Customize pop-up to support add/subtract/multiply/divide operations.
			int operation = JOptionPane.showOptionDialog(null, "Click these buttons to use your numbers in equations.",
					"Simple Calculator", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Divide", "Multiply", "Subtract", "Add" }, null);

			// 5. Call the methods created in steps 3 and 4 to perform the appropriate
			// operation.
			if (operation == 3) {
				add();
			} else if (operation == 2) {
				subtract();
			} else if (operation == 1) {
				multiply();
			} else if (operation == 0) {
				divide();
			}

			// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
		}

	}

	// 3. Create method for addition operation.
	// Method should create pop-up that shows equation and solution, eg. 45 + 25 =
	// 70.
	// HINT: use 'static void add(int num1, num2) { ... }

	static void add() {
		double solveadd = (calc1 + calc2);
		JOptionPane.showMessageDialog(null, calc1 + " + " + calc2 + " = " + solveadd);
	}

	// 4. Create similar methods for subtraction, multiplication and division.

	static void subtract() {
		double solvesub = (calc1 - calc2);
		JOptionPane.showMessageDialog(null, calc1 + " - " + calc2 + " = " + solvesub);
	}

	static void multiply() {
		double solvemul = (calc1 * calc2);
		JOptionPane.showMessageDialog(null, calc1 + " * " + calc2 + " = " + solvemul);
	}

	static void divide() {
		double solvediv = (calc1 / calc2);
		JOptionPane.showMessageDialog(null, calc1 + " / " + calc2 + " = " + solvediv);
	}
}