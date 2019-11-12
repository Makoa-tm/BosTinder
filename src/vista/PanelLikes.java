package vista;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelLikes extends JPanel {
	private JButton botonLike, botonDislike;
	private Font fuente;
	public static final String LIKE = "like";
	public static final String DISLIKE = "dislike";

	public PanelLikes() {

		setLayout(new GridLayout(1, 1));
		fuente = new Font("Helvetica", Font.BOLD, 30);

		botonLike = new JButton("✓");
		botonLike.setActionCommand(LIKE);
		add(botonLike);

		botonDislike = new JButton("X");
		botonDislike.setActionCommand(DISLIKE);
		add(botonDislike);

	}

	public JButton getBotonLike() {
		return botonLike;
	}

	public void setBotonLike(JButton botonLike) {
		this.botonLike = botonLike;
	}

	public JButton getBotonDislike() {
		return botonDislike;
	}

	public void setBotonDislike(JButton botonDislike) {
		this.botonDislike = botonDislike;
	}

}
