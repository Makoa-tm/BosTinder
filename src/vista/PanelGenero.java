package vista;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelGenero extends JPanel{
	
	private JLabel text1, text2;
	private JButton mujer, hombre;
	private Font fuente;
	public static final String MUJER = "mujer";
	public static final String HOMBRE = "hombre";
	
	public PanelGenero() {
		setLayout(new GridLayout(2, 2));
		fuente = new Font("Helvetica", Font.BOLD, 50);
		
		text1 = new JLabel("No te has");
		text2 = new JLabel(" Registrado?");
		text1.setFont(fuente);
		text2.setFont(fuente);
		add(text1);
		add(text2);
		
		mujer = new JButton("M");
		mujer.setActionCommand(MUJER);
		add(mujer);
		
		hombre = new JButton("H");
		hombre.setActionCommand(HOMBRE);
		add(hombre);
		
		
	}

	public JButton getMujer() {
		return mujer;
	}

	public void setMujer(JButton mujer) {
		this.mujer = mujer;
	}

	public JButton getHombre() {
		return hombre;
	}

	public void setHombre(JButton hombre) {
		this.hombre = hombre;
	}
	

}
