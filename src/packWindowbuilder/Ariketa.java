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

    //Intellijk sortutako constructor eta main:
    public Ariketa() throws HeadlessException {
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ariketa");
        frame.setContentPane(new Ariketa().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    /** Nik hasieran sortutakoa:
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

     Intellijk sortutako main:
     public static void main(String[] args) {
     JFrame frame = new JFrame("Ariketa");
     frame.setContentPane(new Ariketa().panelMain);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.pack();
     frame.setVisible(true);
     }
     */
}
