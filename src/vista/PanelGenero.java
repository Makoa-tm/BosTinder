package vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.ImageIcon;
import java.awt.Color;

public class PanelGenero extends JFrame implements ActionListener {
	private JPanel contenedor;
	private JButton btnMujer;
	private JLabel fondo;
	private JButton btnHombre;

	InterfazHombre hombre;
	InterfazMujer mujer;

	public PanelGenero() {
//		setLocationByPlatform(true);
		setResizable(false);
		setTitle("BosTinder");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setSize(458, 294);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);

		contenedor = new JPanel();
		contenedor.setBounds(0, 0, 452, 265);
		getContentPane().add(contenedor);
		contenedor.setLayout(null);

		btnHombre = new JButton("");
		btnHombre.setIcon(new ImageIcon(PanelGenero.class.getResource("/images/Men.png")));
		btnHombre.setActionCommand("HOMBRE");
		btnHombre.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnHombre.setBounds(53, 74, 140, 140);
		btnHombre.addActionListener(this);
		contenedor.add(btnHombre);

		JLabel labelGenero = new JLabel("");
		labelGenero.setBackground(new Color(255, 255, 255));
		labelGenero.setForeground(new Color(255, 255, 255));
		labelGenero.setFont(new Font("Perpetua Titling MT", Font.BOLD, 13));
		labelGenero.setBounds(159, 11, 140, 25);
		contenedor.add(labelGenero);

		btnMujer = new JButton("");
		btnMujer.setIcon(new ImageIcon(PanelGenero.class.getResource("/images/Women.png")));
		btnMujer.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnMujer.setActionCommand("MUJER");
		btnMujer.addActionListener(this);

		btnMujer.setBounds(241, 74, 140, 140);
		contenedor.add(btnMujer);

		JLabel lblDinosTuGenero = new JLabel("Dinos tu genero!");
		lblDinosTuGenero.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 13));
		lblDinosTuGenero.setBounds(146, 11, 140, 25);
		contenedor.add(lblDinosTuGenero);

		fondo = new JLabel("");
		fondo.setIcon(new ImageIcon(PanelGenero.class.getResource("/images/elegant-red-background_1340-4770.jpg")));
		fondo.setBounds(0, 0, 451, 265);
		contenedor.add(fondo);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		if (comando.equals("HOMBRE")) {
			JOptionPane.showMessageDialog(null, "Se deberia abrir la ventana de hombre");
		} else if (comando.equals("MUJER")) {
			JOptionPane.showMessageDialog(null, "Se deberia abrir la ventana de mujer");
		}
	}

	public static void main(String[] args) {
		PanelGenero pGenero = new PanelGenero();
	}

}
