import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

public class ariketa1 extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ariketa1 frame = new ariketa1();
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
	public ariketa1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lbl0 = new JLabel("Botoi bat sakatu");
		lbl0.setFont(new Font("Verdana", Font.BOLD, 11));
		lbl0.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lbl0, BorderLayout.NORTH);
		
		JPanel gridLayout = new JPanel();
		contentPane.add(gridLayout, BorderLayout.CENTER);
		gridLayout.setLayout(new GridLayout(4, 3, 0, 0));
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("A");
		rdbtnNewRadioButton_1.setFont(new Font("Verdana", Font.BOLD, 11));
		buttonGroup_1.add(rdbtnNewRadioButton_1);
		gridLayout.add(rdbtnNewRadioButton_1);
		
		JButton btnNewButton_1 = new JButton("A1");
		btnNewButton_1.setFont(new Font("Verdana", Font.BOLD, 11));
		gridLayout.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("A2");
		btnNewButton_3.setFont(new Font("Verdana", Font.BOLD, 11));
		gridLayout.add(btnNewButton_3);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("B");
		rdbtnNewRadioButton_2.setFont(new Font("Verdana", Font.BOLD, 11));
		buttonGroup_1.add(rdbtnNewRadioButton_2);
		gridLayout.add(rdbtnNewRadioButton_2);
		
		JButton btnNewButton_4 = new JButton("B1");
		btnNewButton_4.setFont(new Font("Verdana", Font.BOLD, 11));
		gridLayout.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("B2");
		btnNewButton_5.setFont(new Font("Verdana", Font.BOLD, 11));
		gridLayout.add(btnNewButton_5);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("C");
		rdbtnNewRadioButton.setFont(new Font("Verdana", Font.BOLD, 11));
		buttonGroup_1.add(rdbtnNewRadioButton);
		gridLayout.add(rdbtnNewRadioButton);
		
		JButton btnNewButton = new JButton("C1");
		btnNewButton.setFont(new Font("Verdana", Font.BOLD, 11));
		gridLayout.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("C2");
		btnNewButton_2.setFont(new Font("Verdana", Font.BOLD, 11));
		gridLayout.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("");
		gridLayout.add(lblNewLabel);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("1. aukera");
		chckbxNewCheckBox_3.setFont(new Font("Verdana", Font.BOLD, 11));
		buttonGroup_2.add(chckbxNewCheckBox_3);
		gridLayout.add(chckbxNewCheckBox_3);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("2. aukera");
		chckbxNewCheckBox_2.setFont(new Font("Verdana", Font.BOLD, 11));
		buttonGroup_2.add(chckbxNewCheckBox_2);
		chckbxNewCheckBox_2.setHorizontalAlignment(SwingConstants.LEFT);
		gridLayout.add(chckbxNewCheckBox_2);
		
		JPanel flowLayout = new JPanel();
		contentPane.add(flowLayout, BorderLayout.SOUTH);
		flowLayout.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lbl1 = new JLabel("Gustoko duzu?");
		lbl1.setFont(new Font("Verdana", Font.BOLD, 11));
		flowLayout.add(lbl1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Bai");
		buttonGroup.add(chckbxNewCheckBox);
		chckbxNewCheckBox.setFont(new Font("Verdana", Font.BOLD, 11));
		flowLayout.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Ez");
		buttonGroup.add(chckbxNewCheckBox_1);
		chckbxNewCheckBox_1.setFont(new Font("Verdana", Font.BOLD, 11));
		flowLayout.add(chckbxNewCheckBox_1);
	}

}
