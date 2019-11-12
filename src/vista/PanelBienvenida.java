package vista;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelBienvenida extends JPanel {

	private JLabel titulo;
	private Font color;

	public PanelBienvenida() {
		setLayout(new GridLayout(1, 1));
		color = new Font("Helvetica", Font.BOLD, 50);

		titulo = new JLabel("BosTinder");
		titulo.setFont(color);
		add(titulo);

		// potencialmente se podria colocar logo BosTinder
	}

}
