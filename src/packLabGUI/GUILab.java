package packLabGUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.GridBagLayout;

public class GUILab extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUILab frame = new GUILab();
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
	public GUILab() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel gbl_panel = new JPanel();
		panel.add(gbl_panel);
		GridBagLayout gbl_gbl_panel = new GridBagLayout();
		gbl_gbl_panel.columnWidths = new int[]{0};
		gbl_gbl_panel.rowHeights =  new int[] {0, 0, 0};
		gbl_gbl_panel.columnWeights = new double[]{Double.MIN_VALUE};
		gbl_gbl_panel.rowWeights = new double[]{Double.MIN_VALUE};
		gbl_panel.setLayout(gbl_gbl_panel);
	}

}
