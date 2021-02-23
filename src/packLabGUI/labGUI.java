package packLabGUI;

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

public class labGUI extends JFrame {

	private JPanel contentPane;
	private JPanel panelGridLayout;
	//private JPanel gbl_panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					labGUI frame = new labGUI();
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
	public labGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(getPanelGridLayout(), BorderLayout.CENTER);
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
