package vista;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import controlador.Controlador;

public class InterfazInicio extends JFrame {
	PanelBienvenida panelB;
	PanelIniciar panelI;
	PanelGenero panelGenero;

	public InterfazInicio(Controlador control) {
		setSize(700, 500);
		setResizable(true);
		setTitle("BosTinder");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		setLayout(new BorderLayout());

		panelB = new PanelBienvenida();
		panelI = new PanelIniciar();
		panelGenero = new PanelGenero();

		add(panelB, BorderLayout.NORTH);
		add(panelI, BorderLayout.CENTER);
		add(panelGenero, BorderLayout.SOUTH);

		panelI.getIngresar().addActionListener(control);
		panelGenero.getMujer().addActionListener(control);
		panelGenero.getHombre().addActionListener(control);

	}

	public PanelBienvenida getPanelB() {
		return panelB;
	}

	public void setPanelB(PanelBienvenida panelB) {
		this.panelB = panelB;
	}

	public PanelIniciar getPanelI() {
		return panelI;
	}

	public void setPanelI(PanelIniciar panelI) {
		this.panelI = panelI;
	}

	public PanelGenero getPanelGenero() {
		return panelGenero;
	}

	public void setPanelGenero(PanelGenero panelGenero) {
		this.panelGenero = panelGenero;
	}

}
