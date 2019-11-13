package vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import controlador.Controlador;

public class InterfazMujer extends JFrame {

	private JLabel nombre, edad, ingresos;
	private JTextField textNombre, textApellido1, textApellido2, textCorreo, textUsuario, textContrasena, textEdad;
	private JComboBox<String> dias;
	private JComboBox<String> mes;
	private JComboBox<String> año;
	private JButton registrar, eliminar;
	private Font fuente;
	public static final String REGISTRAR = "registar";
	public static final String ELIMINAR = "eliminar";
	private JLabel lblUsuario;
	private JLabel lblCorreo;
	private JLabel lblContrasea;
	private JLabel lblNacimiento;
	private JLabel lblMujer;
	private JLabel lblEstaturaopcional;
	private JLabel lblDivorcios;
	private JTextField passwordField;
	private JComboBox<String> boxDivorcios;

	public InterfazMujer(Controlador control) {
		getContentPane().setBackground(new Color(240, 230, 140));
		setSize(new Dimension(396, 498));
		setResizable(false);
		setTitle("Registrar");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		fuente = new Font("Helvetica", Font.BOLD, 20);
		getContentPane().setLayout(null);

		nombre = new JLabel("Nombre: ");
		nombre.setBounds(10, 69, 64, 27);
		nombre.setFont(new Font("Monospaced", Font.BOLD, 13));
		nombre.setForeground(Color.BLACK);
		getContentPane().add(nombre);

		textNombre = new JTextField(5);
		textNombre.setBounds(219, 71, 135, 21);
		getContentPane().add(textNombre);

		textApellido1 = new JTextField(5);
		textApellido1.setBounds(219, 109, 135, 21);
		getContentPane().add(textApellido1);

		textApellido2 = new JTextField(5);
		textApellido2.setBounds(219, 150, 135, 21);
		getContentPane().add(textApellido2);

		textUsuario = new JTextField(5);
		textUsuario.setBounds(219, 188, 135, 21);
		getContentPane().add(textUsuario);

		textCorreo = new JTextField(5);
		textCorreo.setBounds(219, 226, 135, 21);
		getContentPane().add(textCorreo);

		textContrasena = new JPasswordField(5);
		textContrasena.setBounds(219, 264, 135, 21);
		getContentPane().add(textContrasena);

		dias = new JComboBox<String>();
		dias.setBounds(219, 296, 38, 21);
		dias.addItem("1");
		dias.addItem("2");
		dias.addItem("3");
		dias.addItem("4");
		dias.addItem("5");
		dias.addItem("6");
		dias.addItem("7");
		dias.addItem("8");
		dias.addItem("9");
		dias.addItem("10");
		dias.addItem("11");
		dias.addItem("12");
		dias.addItem("13");
		dias.addItem("14");
		dias.addItem("15");
		dias.addItem("16");
		dias.addItem("17");
		dias.addItem("18");
		dias.addItem("19");
		dias.addItem("20");
		dias.addItem("21");
		dias.addItem("22");
		dias.addItem("23");
		dias.addItem("24");
		dias.addItem("25");
		dias.addItem("26");
		dias.addItem("27");
		dias.addItem("28");
		dias.addItem("29");
		dias.addItem("30");
		dias.addItem("31");
		getContentPane().add(dias);

		mes = new JComboBox<String>();
		mes.setBounds(267, 296, 38, 21);
		mes.addItem("01");
		mes.addItem("02");
		mes.addItem("03");
		mes.addItem("04");
		mes.addItem("05");
		mes.addItem("06");
		mes.addItem("07");
		mes.addItem("08");
		mes.addItem("09");
		mes.addItem("10");
		mes.addItem("11");
		mes.addItem("12");
		getContentPane().add(mes);

		año = new JComboBox<String>();
		año.setBounds(315, 296, 57, 21);
		año.addItem("2001");
		año.addItem("2000");
		año.addItem("1999");
		año.addItem("1998");
		año.addItem("1997");
		año.addItem("1996");
		getContentPane().add(año); // agregar

		edad = new JLabel("Edad: ");
		edad.setBounds(0, 544, 131, 41);
		edad.setFont(fuente);
		edad.setForeground(Color.BLACK);
		getContentPane().add(edad);

		textEdad = new JTextField(5);
		textEdad.setBounds(192, 544, 149, 57);
		getContentPane().add(textEdad);

		ingresos = new JLabel("Ingresos: ");
		ingresos.setBounds(0, 612, 149, 41);
		ingresos.setFont(fuente);
		ingresos.setForeground(Color.BLACK);
		getContentPane().add(ingresos);

		registrar = new JButton("A conquistar!");
		registrar.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		registrar.setBounds(127, 424, 149, 34);
		registrar.setActionCommand(REGISTRAR);
		getContentPane().add(registrar);

		eliminar = new JButton("Eliminar");
		eliminar.setBounds(192, 680, 162, 34);
		eliminar.setActionCommand(ELIMINAR);
		getContentPane().add(eliminar);

		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setFont(new Font("Monospaced", Font.BOLD, 13));
		lblApellido.setBounds(10, 108, 76, 27);
		getContentPane().add(lblApellido);

		JLabel lblSegundoApellido = new JLabel("Segundo apellido:");
		lblSegundoApellido.setFont(new Font("Monospaced", Font.BOLD, 13));
		lblSegundoApellido.setBounds(10, 146, 149, 27);
		getContentPane().add(lblSegundoApellido);

		lblUsuario = new JLabel("Usuario:");
		lblUsuario.setFont(new Font("Monospaced", Font.BOLD, 13));
		lblUsuario.setBounds(10, 184, 76, 27);
		getContentPane().add(lblUsuario);

		lblCorreo = new JLabel("Correo:");
		lblCorreo.setFont(new Font("Monospaced", Font.BOLD, 13));
		lblCorreo.setBounds(10, 222, 76, 27);
		getContentPane().add(lblCorreo);

		lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setFont(new Font("Monospaced", Font.BOLD, 13));
		lblContrasea.setBounds(10, 260, 94, 27);
		getContentPane().add(lblContrasea);

		lblNacimiento = new JLabel("Nacimiento:");
		lblNacimiento.setFont(new Font("Monospaced", Font.BOLD, 13));
		lblNacimiento.setBounds(10, 293, 94, 27);
		getContentPane().add(lblNacimiento);

		lblMujer = new JLabel("Mujer");
		lblMujer.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 13));
		lblMujer.setBounds(165, 11, 70, 35);
		getContentPane().add(lblMujer);

		lblEstaturaopcional = new JLabel("Estatura (Opcional):");
		lblEstaturaopcional.setFont(new Font("Monospaced", Font.BOLD, 13));
		lblEstaturaopcional.setBounds(10, 331, 162, 27);
		getContentPane().add(lblEstaturaopcional);

		lblDivorcios = new JLabel("Divorcios:");
		lblDivorcios.setFont(new Font("Monospaced", Font.BOLD, 13));
		lblDivorcios.setBounds(10, 369, 97, 27);
		getContentPane().add(lblDivorcios);

		passwordField = new JTextField(5);
		passwordField.setBounds(219, 335, 135, 21);
		getContentPane().add(passwordField);

		boxDivorcios = new JComboBox();
		boxDivorcios.setBounds(217, 372, 88, 21);
		getContentPane().add(boxDivorcios);

		getRegistrar().addActionListener(control);
		getEliminar().addActionListener(control);

	}

	public JButton getEliminar() {
		return eliminar;
	}

	public void setEliminar(JButton eliminar) {
		this.eliminar = eliminar;
	}

	public JTextField getTextNombre() {
		return textNombre;
	}

	public void setTextNombre(JTextField textNombre) {
		this.textNombre = textNombre;
	}

	public JTextField getTextApellido1() {
		return textApellido1;
	}

	public void setTextApellido1(JTextField textApellido1) {
		this.textApellido1 = textApellido1;
	}

	public JTextField getTextApellido2() {
		return textApellido2;
	}

	public void setTextApellido2(JTextField textApellido2) {
		this.textApellido2 = textApellido2;
	}

	public JTextField getTextUsuario() {
		return textUsuario;
	}

	public void setTextUsuario(JTextField textUsuario) {
		this.textUsuario = textUsuario;
	}

	public JTextField getTextContrasena() {
		return textContrasena;
	}

	public void setTextContrasena(JTextField textContrasena) {
		this.textContrasena = textContrasena;
	}

	public JTextField getTextEdad() {
		return textEdad;
	}

	public void setTextEdad(JTextField textEdad) {
		this.textEdad = textEdad;
	}

	public JButton getRegistrar() {
		return registrar;
	}

	public void setRegistrar(JButton registrar) {
		this.registrar = registrar;
	}

	public JTextField getTextCorreo() {
		return textCorreo;
	}

	public void setTextCorreo(JTextField textCorreo) {
		this.textCorreo = textCorreo;
	}

	public JComboBox<String> getDias() {
		return dias;
	}

	public void setDias(JComboBox<String> dias) {
		this.dias = dias;
	}

	public JComboBox<String> getMes() {
		return mes;
	}

	public void setMes(JComboBox<String> mes) {
		this.mes = mes;
	}

	public JComboBox<String> getAño() {
		return año;
	}

	public void setAño(JComboBox<String> año) {
		this.año = año;
	}
}
