package vista;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import javax.swing.JTextArea;

import controlador.Controlador;

public class InterfazBosTinder extends JFrame {

	private static final long serialVersionUID = 1L;

	private PanelBienvenida panelB;
	private JTextArea mostrarPersona;
	private PanelLikes panelLikes;

	public InterfazBosTinder(Controlador control) {
		setSize(700, 500);
		setResizable(true);
		setTitle("BosTinder");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		setLayout(new BorderLayout());

		panelB = new PanelBienvenida();

		add(panelB, BorderLayout.NORTH);

		mostrarPersona = new JTextArea();
		add(mostrarPersona, BorderLayout.CENTER);

		panelLikes = new PanelLikes();
		add(panelLikes, BorderLayout.SOUTH);

		panelLikes.getBotonLike().addActionListener(control);
		panelLikes.getBotonDislike().addActionListener(control);

	}

	public PanelBienvenida getPanelB() {
		return panelB;
	}

	public void setPanelB(PanelBienvenida panelB) {
		this.panelB = panelB;
	}

	public JTextArea getMostrarPersona() {
		return mostrarPersona;
	}

	public void setMostrarPersona(JTextArea mostrarPersona) {
		this.mostrarPersona = mostrarPersona;
	}

	public PanelLikes getPanelLikes() {
		return panelLikes;
	}

	public void setPanelLikes(PanelLikes panelLikes) {
		this.panelLikes = panelLikes;
	}

}
