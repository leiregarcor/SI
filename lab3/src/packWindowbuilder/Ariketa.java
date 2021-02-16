package packWindowbuilder;

import javax.swing.*;
import java.awt.*;

public class Ariketa extends JFrame {
    private JCheckBox baiCheckBox;
    private JCheckBox ezCheckBox;
    private JButton b2Button;
    private JButton a2Button;
    private JButton c2Button;
    private JCheckBox a2AukeraCheckBox;
    private JButton b1Button;
    private JButton a1Button;
    private JButton c1Button;
    private JCheckBox a1AukeraCheckBox;
    private JRadioButton aRadioButton;
    private JRadioButton bRadioButton;
    private JRadioButton cRadioButton;
    private JPanel panelMain;

    public Ariketa() {
        super("Ariketa1");
        this.setContentPane(panelMain);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
    }

    public static void main(String[] args) {
        Ariketa ariketa = new Ariketa();
        ariketa.setVisible(true);
    }
}
