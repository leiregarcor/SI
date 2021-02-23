package packLabGUIGert;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUIGert extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public GUIGert() {
		
		textField = new JTextField();
		add(textField);
		textField.setColumns(10);

	}

}
