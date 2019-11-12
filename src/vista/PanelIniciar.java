package vista;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class PanelIniciar extends JPanel {

	JLabel username, password;
	JTextField fieldUsername, fieldPassword;
	JButton ingresar;
	public static final String INGRESAR = "ingresar";
	private Font fuente;

	public PanelIniciar() {

		setLayout(new GridLayout(3, 2));
		fuente = new Font("Helvetica", Font.BOLD, 30);

		username = new JLabel("Usuario: ");
		username.setFont(fuente);
		add(username);

		fieldUsername = new JTextField(10);
		fieldUsername.setFont(fuente);
		add(fieldUsername);

		password = new JLabel("Contrasena: ");
		password.setFont(fuente);
		add(password);

		fieldPassword = new JPasswordField(10);
		add(fieldPassword);

		ingresar = new JButton("Ingrear");
		ingresar.setActionCommand(INGRESAR);
		add(ingresar);

	}

	public JButton getIngresar() {
		return ingresar;
	}

	public void setIngresar(JButton ingresar) {
		this.ingresar = ingresar;
	}
	

}
