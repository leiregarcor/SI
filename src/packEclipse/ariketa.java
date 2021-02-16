import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ariketa extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField txtGustokoDuzu;
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JTextField txtBotoiBatSakatu;
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ariketa frame = new ariketa();
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
	public ariketa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("A");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(6, 76, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("B");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(6, 102, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("C");
		buttonGroup.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setBounds(6, 128, 109, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("bai");
		buttonGroup_1.add(chckbxNewCheckBox);
		chckbxNewCheckBox.setBounds(179, 231, 46, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("ez");
		buttonGroup_1.add(chckbxNewCheckBox_1);
		chckbxNewCheckBox_1.setBounds(227, 231, 97, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		txtGustokoDuzu = new JTextField();
		txtGustokoDuzu.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtGustokoDuzu.setBackground(SystemColor.control);
		txtGustokoDuzu.setText("Gustoko duzu?");
		txtGustokoDuzu.setBounds(76, 232, 97, 20);
		contentPane.add(txtGustokoDuzu);
		txtGustokoDuzu.setColumns(10);
		
		JButton btnNewButton = new JButton("A1");
		btnNewButton.setBounds(153, 39, 89, 38);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("A2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(239, 39, 89, 38);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("B1");
		btnNewButton_2.setBounds(153, 76, 89, 38);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("B2");
		btnNewButton_3.setBounds(239, 76, 89, 38);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("C1");
		btnNewButton_4.setBounds(153, 113, 89, 38);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("C2");
		btnNewButton_5.setBounds(239, 113, 89, 38);
		contentPane.add(btnNewButton_5);
		
		txtBotoiBatSakatu = new JTextField();
		txtBotoiBatSakatu.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtBotoiBatSakatu.setBackground(SystemColor.control);
		txtBotoiBatSakatu.setText("Botoi bat sakatu");
		txtBotoiBatSakatu.setBounds(153, 8, 142, 20);
		contentPane.add(txtBotoiBatSakatu);
		txtBotoiBatSakatu.setColumns(10);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("1. aukera");
		buttonGroup_2.add(chckbxNewCheckBox_2);
		chckbxNewCheckBox_2.setBounds(153, 172, 89, 23);
		contentPane.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("2. aukera");
		buttonGroup_2.add(chckbxNewCheckBox_3);
		chckbxNewCheckBox_3.setBounds(244, 172, 97, 23);
		contentPane.add(chckbxNewCheckBox_3);
	}
}
