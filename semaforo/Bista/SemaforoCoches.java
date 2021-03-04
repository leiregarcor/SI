package Bista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import Eredua.GestorSemaforos;

public class SemaforoCoches extends JFrame implements Observer  {

	private static final long serialVersionUID = -1526416068663302084L;
	private JPanel contentPane;
	private JPanel pnlSemaforo;
	private LuzSemaforo luzVerde = null;
	private LuzSemaforo luzRoja = null;
	private JLabel lblCont;

	/**
	 * Create the frame.
	 */
	public SemaforoCoches() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		initialize();
		GestorSemaforos.getGestorSemaforos().addObserver(this);
	}

	/**
	 * Inicializa los componentes de la ventana
	 */
	private void initialize() {
		setSize(150, 555);
		this.setContentPane(getContentPane());
		setTitle("Coches");
		setLocationRelativeTo(null);
		setVisible(true);

	}
	
	/**
	 * Devuelve el panel principal. Si no se ha construido aun, crea una nueva instancia
	 * @return el panel principal
	 */
	public JPanel getContentPane() {
		if (contentPane == null) {
			contentPane = new JPanel();
			contentPane.setLayout(new BorderLayout());
			contentPane.add(getPnlSemaforo(), BorderLayout.CENTER);
		}
		return contentPane;
	}

	/**
	 * Deveuelve el panel del semaforo. Si no se ha construido aun, se crea una nueva instancia
	 * @return el panel del semafor
	 */
	private JPanel getPnlSemaforo() {
		if (pnlSemaforo == null) {
			pnlSemaforo = new JPanel();
			pnlSemaforo.setLayout(new GridLayout(4, 1, 0, 10));
			pnlSemaforo.add(getLblCont());
			pnlSemaforo.add(getLuzRoja(),null);
			pnlSemaforo.add(getLuzVerde(),null);
		}
		return pnlSemaforo;
	}
	
	/**
	 * Devuelve el panel para la luz roja. Si no se ha construido aun, se crea una nueva instancia
	 * @return el panel que representa la luz roja
	 */
	private LuzSemaforo getLuzRoja() {
		if (luzRoja == null) {
			luzRoja = new LuzSemaforo("rojo", true);
		}
		return luzRoja;
	}

	/**
	 * Devuelve el panel para la luz verde. Si no se ha construido aun, se crea una nueva instancia
	 * @return el panel que representa la luz verde
	 */
	private LuzSemaforo getLuzVerde() {
		if (luzVerde == null) {
			luzVerde = new LuzSemaforo("verde", false);
		}
		return luzVerde;
	}
	

	private JLabel getLblCont() {
		if (lblCont == null) {
			lblCont = new JLabel("15");
			lblCont.setOpaque(true);
			lblCont.setBackground(Color.BLACK);
			lblCont.setFont(new Font("Lucida Grande", Font.BOLD, 72));
			lblCont.setHorizontalAlignment(SwingConstants.CENTER);
			lblCont.setForeground(Color.RED);
		}
		return lblCont;
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		//lblCont.setForeground(Color.GREEN);
		//System.out.println("coches");
		GestorSemaforos g= GestorSemaforos.getGestorSemaforos();
		lblCont.setText(g.getContador()+"");
		if(!g.estaVerde()) {
			lblCont.setForeground(Color.GREEN);
			luzVerde.setActivo(true);
			luzRoja.setActivo(false);
			
		}
		else {
			lblCont.setForeground(Color.RED);
			
			luzVerde.setActivo(false);
			luzRoja.setActivo(true);
		}
		
	}
}
