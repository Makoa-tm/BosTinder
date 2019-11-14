package vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

public class PanelGenero extends JFrame {
	private JPanel contenedor;
	private JButton btnHombre;
	private JButton btnMujer;

	public PanelGenero() {
		setResizable(false);
		setTitle("BosTinder");
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(432, 275);
		getContentPane().setLayout(null);

		contenedor = new JPanel();
		contenedor.setBounds(0, 0, 426, 246);
		getContentPane().add(contenedor);
		contenedor.setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 13));
		lblNewLabel.setBounds(146, 11, 143, 25);
		contenedor.add(lblNewLabel);

		btnHombre = new JButton("Hombre");
		btnHombre.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 12));
		btnHombre.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnHombre.setActionCommand("HOMBRE");
		btnHombre.setBounds(20, 65, 172, 167);
		contenedor.add(btnHombre);

		btnMujer = new JButton("Mujer");
		btnMujer.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 13));
		btnMujer.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnMujer.setActionCommand("MUJER");
		btnMujer.setBounds(231, 64, 172, 167);
		contenedor.add(btnMujer);
		
		JLabel lblDinosTuGenero = new JLabel("Dinos tu genero!");
		lblDinosTuGenero.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 13));
		lblDinosTuGenero.setBounds(146, 11, 140, 25);
		contenedor.add(lblDinosTuGenero);
		setVisible(true);
	}
}
