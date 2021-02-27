package packLabGUIGert;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BigarrenLehioa extends JFrame {

	private JPanel contentPane;
	private JPanel panelGridLayout;
	private JTextField textField_1;
	private JTextField textField_2;
	//private JPanel gbl_panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BigarrenLehioa frame = new BigarrenLehioa();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BigarrenLehioa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(getPanelGridLayout(), BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.EAST);
		panel.setLayout(new GridLayout(3, 1, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_4 = new JPanel();
		panel_2.add(panel_4);
		
		JLabel lblNewLabel = new JLabel("Label");
		panel_4.add(lblNewLabel);
		
		textField_1 = new JTextField();
		panel_4.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel_5 = new JPanel();
		panel_2.add(panel_5);
		
		JLabel lblNewLabel_1 = new JLabel("TField");
		panel_5.add(lblNewLabel_1);
		
		textField_2 = new JTextField();
		panel_5.add(textField_2);
		textField_2.setColumns(10);
		
		JPanel panel_6 = new JPanel();
		panel_2.add(panel_6);
		panel_6.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3);
		
		JButton btnNewButton = new JButton("Exit");
		btnNewButton.setBounds(53, 30, 66, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_3.setLayout(null);
		panel_3.add(btnNewButton);
		setLocationRelativeTo(null) ;
	}

	private JPanel getPanelGridLayout() {
		if (panelGridLayout == null) {
			panelGridLayout = new JPanel();
			panelGridLayout.setLayout(new GridLayout(3, 3, 0, 0));
			//gridLayoutPane.add(getGbl_panel());
			this.matrizeaSortu();
		}
		return panelGridLayout;
	}
	
	private void matrizeaSortu() {
		for(int l=0;l<3;l++) {
			for(int z=0;z<3;z++) {
				panelGridLayout.add(getGbl_panel(l, z));
			}
		}
	}


	
	private JPanel getGbl_panel(int pL, int pZ) {

		 //JLabel lblNewLabel;
		// JTextField textField;
		
		//if (gbl_panel == null) {
			JPanel gbl_panel = new JPanel();
			GridBagLayout gbl_gbl_panel = new GridBagLayout();
			gbl_gbl_panel.columnWidths = new int[] {0};
			gbl_gbl_panel.rowHeights = new int[] {0, 0, 0};
			gbl_gbl_panel.columnWeights = new double[]{1.0};
			gbl_gbl_panel.rowWeights = new double[]{Double.MIN_VALUE, 0.0, 0.0};
			gbl_panel.setLayout(gbl_gbl_panel);
			GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
			gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
			gbc_lblNewLabel.weighty = 0.33;
			gbc_lblNewLabel.gridx = 0;
			gbc_lblNewLabel.gridy = 0;
			gbl_panel.add(getLblNewLabel(pL, pZ), gbc_lblNewLabel);
			GridBagConstraints gbc_textField = new GridBagConstraints();
			gbc_textField.gridheight = 2;
			gbc_textField.gridwidth = 1;
			gbc_textField.weightx = 0.76;
			gbc_textField.weighty = 0.75;
			gbc_textField.insets = new Insets(0, 0, 5, 0);
			gbc_textField.gridx = 0;
			gbc_textField.gridy = 1;
			gbc_textField.fill = GridBagConstraints.BOTH;
			gbl_panel.add(getTextField(), gbc_textField);
//		}
		return gbl_panel;
	}
	
	private JLabel getLblNewLabel( int pL, int pZ) {
		
		return	 new JLabel("L"+pL+"Z"+pZ);
		
	}
	private JTextField getTextField() {
		JTextField textField = new JTextField();
		textField.setColumns(10);
		return textField;
	}
}
