package vista;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controlador.Controlador;

public class InterfazInicio extends JFrame {
	private JLabel fondo_2;
	private JTextField txtUser;
	private JTextField txtPassword;
	private JButton btn;

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

		btn = new JButton("New button");
		btn.setBounds(138, 312, 136, 30);
		panel.add(btn);

		txtPassword = new JTextField();
		txtPassword.setColumns(10);
		txtPassword.setBounds(121, 236, 171, 28);
		panel.add(txtPassword);

		JLabel passLogo = new JLabel("");
		passLogo.setIcon(new ImageIcon(InterfazInicio.class.getResource("/images/Password icon_2.png")));
		passLogo.setBounds(75, 235, 29, 30);
		panel.add(passLogo);

		txtUser = new JTextField();
		txtUser.setBounds(121, 187, 171, 28);
		panel.add(txtUser);
		txtUser.setColumns(10);

		JLabel icon_logo = new JLabel("");
		icon_logo.setIcon(new ImageIcon(InterfazInicio.class.getResource("/images/Icon image 3_.png")));
		icon_logo.setBounds(74, 185, 30, 37);
		panel.add(icon_logo);

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
}
