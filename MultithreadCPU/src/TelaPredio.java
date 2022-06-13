
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class TelaPredio extends JFrame {

	public JLabel Elevador, Portas;
	public JLabel Passageiro0, Passageiro1, Passageiro2, Passageiro3, Passageiro4;
	public JLabel Passageiro_00, Passageiro_01, Passageiro_02, Passageiro_03, Passageiro_04;
	public JLabel Predio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

	/**
	 * Create the frame.
	 */
	public TelaPredio() {

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 800, 630);
		setResizable(false);

		Elevador = new JLabel();
		Elevador.setBounds(250, 0, 300, 600);
		Elevador.setVisible(true);
		Elevador.setIcon(new ImageIcon("img/Elevador.png"));

		Portas = new JLabel();
		Portas.setBounds(350, 460, 100, 100);
		Portas.setVisible(true);
		Portas.setIcon(new ImageIcon("img/Portas.png"));

		ArrayList<JLabel> ListadePassageiros = new ArrayList<JLabel>();

		Predio = new JLabel();
		Predio.setIcon(new ImageIcon("img/Predio.png"));
		Predio.setVisible(true);
		ListadePassageiros.add(Predio);

		Passageiro0 = new JLabel();
		Passageiro0.setBounds(500, 90, 100, 100);
		Passageiro0.setIcon(new ImageIcon("img/Passageiro.png"));
		Passageiro0.setVisible(false);
		ListadePassageiros.add(Passageiro0);

		add(Passageiro0);

		Passageiro1 = new JLabel();
		Passageiro1.setBounds(500, 90, 100, 100);
		Passageiro1.setIcon(new ImageIcon("img/Passageiro.png"));
		Passageiro1.setVisible(false);
		ListadePassageiros.add(Passageiro1);

		add(Passageiro1);

		Passageiro2 = new JLabel();
		Passageiro2.setBounds(500, 90, 100, 100);
		Passageiro2.setIcon(new ImageIcon("img/Passageiro.png"));
		Passageiro2.setVisible(false);
		ListadePassageiros.add(Passageiro2);

		add(Passageiro2);

		Passageiro3 = new JLabel();
		Passageiro3.setBounds(500, 90, 100, 100);
		Passageiro3.setIcon(new ImageIcon("img/Passageiro.png"));
		Passageiro3.setVisible(false);
		ListadePassageiros.add(Passageiro3);

		add(Passageiro3);

		Passageiro4 = new JLabel();
		Passageiro4.setBounds(500, 90, 100, 100);
		Passageiro4.setIcon(new ImageIcon("img/Passageiro.png"));
		Passageiro4.setVisible(false);
		ListadePassageiros.add(Passageiro4);

		add(Passageiro4);

		JLabel Andar1 = new JLabel("Andar 00");
		Andar1.setBounds(600, 450, 100, 100);
		Andar1.setVisible(true);

		add(Andar1);

		JLabel Andar2 = new JLabel("Andar 01");
		Andar2.setBounds(600, 356, 100, 100);
		Andar2.setVisible(true);

		add(Andar2);

		JLabel Andar3 = new JLabel("Andar 02");
		Andar3.setBounds(600, 260, 100, 100);
		Andar3.setVisible(true);

		add(Andar3);

		JLabel Andar4 = new JLabel("Andar 03");
		Andar4.setBounds(600, 185, 100, 100);
		Andar4.setVisible(true);

		add(Andar4);

		JLabel Andar5 = new JLabel("Andar 04");
		Andar5.setBounds(600, 90, 100, 100);
		Andar5.setVisible(true);
		add(Andar5);

		Passageiro_00 = new JLabel("0");
		Passageiro_00.setBounds(500, 90, 100, 100);
		Passageiro_00.setVisible(false);
		add(Passageiro_00);
		Passageiro_01 = new JLabel("1");
		Passageiro_01.setBounds(500, 90, 100, 100);
		Passageiro_01.setVisible(false);
		add(Passageiro_01);
		Passageiro_02 = new JLabel("2");
		Passageiro_02.setBounds(500, 90, 100, 100);
		Passageiro_02.setVisible(false);
		add(Passageiro_02);
		Passageiro_03 = new JLabel("3");
		Passageiro_03.setBounds(500, 90, 100, 100);
		Passageiro_03.setVisible(false);
		add(Passageiro_03);
		Passageiro_04 = new JLabel("4");
		Passageiro_04.setBounds(500, 90, 100, 100);
		Passageiro_04.setVisible(false);
		add(Passageiro_04);

		add(Portas);
		add(Elevador);

		add(Predio);

		repaint(100);

	}

}
