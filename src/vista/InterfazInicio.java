package vista;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controlador.Controlador;
import java.awt.Cursor;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JPasswordField;

public class InterfazInicio extends JFrame implements ActionListener {
	private JLabel fondo_2;
	private JButton btnLogin;
	private JTextField txtUser;
	private JPasswordField passwordField;
	private JButton btnRegistrarse;
	PanelGenero genero;
	public InterfazInicio(Controlador control) {
		setSize(419, 435);
		setResizable(true);
		setTitle("BosTinder");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 470, 407);
		getContentPane().add(panel);
		panel.setLayout(null);

		passwordField = new JPasswordField();
		passwordField.setBounds(121, 235, 171, 30);
		panel.add(passwordField);

		btnRegistrarse = new JButton("\u00BFNo estas Incrito?");
		btnRegistrarse.setFont(new Font("Nirmala UI", Font.BOLD, 10));
		btnRegistrarse.setBounds(275, 354, 121, 30);
		btnRegistrarse.setActionCommand("REGISTRARSE");
		btnRegistrarse.addActionListener(this);
		panel.add(btnRegistrarse);

		JLabel iconImage = new JLabel("");
		iconImage.setIcon(new ImageIcon(InterfazInicio.class.getResource("/images/Final Icon image.png")));
		iconImage.setBounds(75, 183, 31, 37);
		panel.add(iconImage);

		btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 13));
		btnLogin.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnLogin.setBounds(138, 312, 136, 30);
		btnLogin.setActionCommand("LOGIN");
		btnLogin.addActionListener(this);
		panel.add(btnLogin);

		JLabel passLogo = new JLabel("");
		passLogo.setIcon(new ImageIcon(InterfazInicio.class.getResource("/images/Password icon_2.png")));
		passLogo.setBounds(75, 235, 29, 30);
		panel.add(passLogo);

		txtUser = new JTextField();
		txtUser.setBounds(121, 188, 171, 28);
		panel.add(txtUser);
		txtUser.setColumns(10);

		JLabel lblBostinderLogin = new JLabel("BosTinder Login");
		lblBostinderLogin.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblBostinderLogin.setBounds(130, 130, 156, 37);
		panel.add(lblBostinderLogin);

		JLabel logo = new JLabel("");
		logo.setIcon(new ImageIcon(InterfazInicio.class.getResource("/images/Icon image 3.png")));
		logo.setSize(new Dimension(20, 30));
		logo.setPreferredSize(new Dimension(15, 14));
		logo.setBounds(141, 11, 121, 114);
		panel.add(logo);

		fondo_2 = new JLabel("");
		fondo_2.setIcon(new ImageIcon(InterfazInicio.class.getResource("/images/Blue Background_2.jpg")));
		fondo_2.setBounds(-5, -18, 620, 350);
		panel.add(fondo_2);

		JLabel Fondo_1 = new JLabel("");
		Fondo_1.setIcon(new ImageIcon(InterfazInicio.class.getResource("/images/Blue Background_2.jpg")));
		Fondo_1.setBounds(-7, 166, 620, 350);
		panel.add(Fondo_1);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		if (comando.equals("LOGIN")) {
			JOptionPane.showMessageDialog(null, "Se loguea el usuarion");
		}
		else if (comando.equals("REGISTRARSE")) {
			genero = new PanelGenero();
		}
	}

}
