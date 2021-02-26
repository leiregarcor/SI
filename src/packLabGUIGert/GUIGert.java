package packLabGUIGert;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import packLabGUI.labGUI;

import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUIGert extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JPasswordField passwordField;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			GUIGert dialog = new GUIGert();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public GUIGert() {
		setTitle("Hasiera Panela");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		setLocationRelativeTo(null) ;
		
		contentPanel.setBounds(0, 0, 434, 217);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);		
		contentPanel.setLayout(null);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(165, 130, 147, 20);
		contentPanel.add(passwordField);
		
		textField = new JTextField();
		textField.setBounds(165, 88, 147, 20);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Izena");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(123, 91, 32, 14);
		contentPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Pasahitza");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(100, 133, 55, 14);
		contentPanel.add(lblNewLabel_1);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 217, 434, 33);
			getContentPane().add(buttonPane);
			buttonPane.setLayout(null);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (passwordField.getText().equals ("is2021")) {
							setVisible(false);
							labGUI l= new labGUI();
							l.main(null);
						}
						else {
							Component controllingFrame = null;
							JOptionPane.showMessageDialog(controllingFrame,
					                "Sartu duzun pasahitza okerra da. Saiatu berriro",
					                "Errore mezua",
					                JOptionPane.ERROR_MESSAGE);
							passwordField.setText(null);
							passwordField.requestFocus();
						}
						
					}
				});
				okButton.setBounds(132, 5, 65, 23);
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						passwordField.setText(null);
						textField.setText(null);
					}
				});
				cancelButton.setBounds(228, 5, 84, 23);
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
