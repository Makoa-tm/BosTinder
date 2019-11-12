package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import modelo.Mundo;
import modelo.Persona;
import vista.InterfazAdmin;
import vista.InterfazBosTinder;
import vista.InterfazHombre;
import vista.InterfazInicio;
import vista.InterfazMujer;

public class Controlador implements ActionListener {

	InterfazInicio guiInicio;
	InterfazHombre guiHombre;
	InterfazMujer guiMujer;
	InterfazBosTinder guiBosTinder;
	InterfazAdmin guiAdmin;

	Mundo m;
	ArrayList<Persona> lista = new ArrayList<Persona>();

	public Controlador() {

		m = new Mundo();
		m.getArchivo().leerArchivo();
		guiInicio = new InterfazInicio(this);
		guiHombre = new InterfazHombre(this);
		guiMujer = new InterfazMujer(this);
		guiBosTinder = new InterfazBosTinder(this);
		guiAdmin = new InterfazAdmin(this);

		guiInicio.setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == guiInicio.getPanelI().getIngresar()) {
			guiInicio.setVisible(false);
			guiBosTinder.setVisible(true);
			// mostrar ventana BosTinder si los datos son correctos y existe

			/*
			 * // si el usuario exite entrar a la pagina de incio if
			 * (m.getUsuario().usuarioExiste()) { if(usuario == usuarioMujer) {
			 * guiBosTinder. mostrarUsuariosHombres() }else { mostrarUsuariosMujeres();
			 * 
			 * // se muestran los usuario segun el sexo
			 * 
			 * } else { // mensaje de error que diga su contrasena es incorrecta intente de
			 * nuevo o // registrese } }
			 * 
			 */

		}

		if (e.getSource() == guiInicio.getPanelGenero().getMujer()) {
			guiMujer.setVisible(true);
			guiInicio.setVisible(false);

		}

		if (e.getSource() == guiInicio.getPanelGenero().getHombre()) {
			guiHombre.setVisible(true);
			guiInicio.setVisible(false);

		}

		if (e.getSource() == guiHombre.getRegistrar()) {
			// guardarDatosHombres();
			validarCorreoHombre();
			if (Integer.parseInt(guiHombre.getTextEdad().getText()) >= 18) {
				guardarDatosHombres();
				guiHombre.setVisible(false);
				guiBosTinder.setVisible(true);
				// mostrar ventana BosTinder de usuarios mujeres
			} else {
				String mensaje = "No eres Mayor de 18 anos para poder registrarte";
			}
			if (validarCorreoHombre() == true) {
				guardarDatosHombres();
				guiHombre.setVisible(false);
				guiBosTinder.setVisible(true);
				// mostrar ventana BosTinder de usuarios mujeres
			} else {
				String mensaje = "Este correo no es valido, intenta de nuevo!";
				System.out.println("Este correo no es valido, intenta de nuevo!");
			}
			if ((guiHombre.getTextCorreo().getText() == " ") || (guiHombre.getTextNombre().getText() == " ")
					|| (guiHombre.getTextApellido1().getText() == " ")
					|| (guiHombre.getTextApellido2().getText() == " ") || (guiHombre.getTextUsuario().getText() == " ")
					|| (guiHombre.getTextContrasena().getText() == " ") || (guiHombre.getTextEdad().getText() == " ")
					|| (guiHombre.getTextIngresos().getText() == " ")) {
				String mensaje = "Te faltaro algunos espacios por llenar";
			} else {
				guardarDatosHombres();
				guiHombre.setVisible(false);
				guiBosTinder.setVisible(true);
				// mostrar ventana BosTinder de usuarios mujeres
			}
		}

		if (e.getSource() == guiMujer.getRegistrar()) {
			// guardarDatosHombres();
			validarCorreoMujer();
			if (Integer.parseInt(guiMujer.getTextEdad().getText()) >= 18) {
				guardarDatosMujeres();
				guiMujer.setVisible(false);
				guiBosTinder.setVisible(true);
				// mostrar ventana BosTinder de usuarios mujeres
			} else {
				String mensaje = "No eres Mayor de 18 anos para poder registrarte";
			}
			if (validarCorreoMujer() == true) {
				guardarDatosMujeres();
				guiMujer.setVisible(false);
				guiBosTinder.setVisible(true);
				// mostrar ventana BosTinder de usuarios mujeres
			} else {
				String mensaje = "Este correo no es valido, intenta de nuevo!";
				System.out.println("Este correo no es valido, intenta de nuevo!");
			}
			if ((guiMujer.getTextCorreo().getText() == " ") || (guiMujer.getTextNombre().getText() == " ")
					|| (guiMujer.getTextApellido1().getText() == " ") || (guiMujer.getTextApellido2().getText() == " ")
					|| (guiMujer.getTextUsuario().getText() == " ") || (guiMujer.getTextContrasena().getText() == " ")
					|| (guiMujer.getTextEdad().getText() == " ")) {

				String mensaje = "Te faltaro algunos espacios por llenar";
			} else {
				guardarDatosMujeres();
				guiMujer.setVisible(false);
				guiBosTinder.setVisible(true);
				// mostrar ventana BosTinder de usuarios mujeres
			}
		}

	}

	public void guardarDatosHombres() {
		System.out.println("entre");
		String Nombre = guiHombre.getTextNombre().getText();
		String apellido1 = guiHombre.getTextApellido1().getText();
		String apellido2 = guiHombre.getTextApellido2().getText();
		String usuario = guiHombre.getTextUsuario().getText();
		String correo = guiHombre.getTextCorreo().getText();
		String contraseña = guiHombre.getTextContrasena().getText();
		String dia = (String) guiHombre.getDias().getSelectedItem();
		String mes = (String) guiHombre.getMes().getSelectedItem();
		String año = (String) guiHombre.getAño().getSelectedItem();
		String nacimiento = dia + "/" + mes + "/" + año;
		int edad = Integer.parseInt(guiHombre.getTextEdad().getText());
		double ingreso = Double.parseDouble(guiHombre.getTextIngresos().getText());
		Persona persona = new Persona(0, Nombre, apellido1, apellido2, 'H', usuario, contraseña, correo, nacimiento,
				edad, ingreso, "Disponible");
		try {
			m.getArchivo().agregarpersonaHombre(0, Nombre, apellido1, apellido2, 'H', usuario, contraseña, correo,
					nacimiento, edad, ingreso, "Disponible");
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		lista.add(persona);
	}

	public void guardarDatosMujeres() {
		System.out.println("entre");
		String Nombre = guiMujer.getTextNombre().getText();
		String apellido1 = guiMujer.getTextApellido1().getText();
		String apellido2 = guiMujer.getTextApellido2().getText();
		String usuario = guiMujer.getTextUsuario().getText();
		String correo = guiMujer.getTextCorreo().getText();
		String contraseña = guiMujer.getTextContrasena().getText();
		String dia = (String) guiMujer.getDias().getSelectedItem();
		String mes = (String) guiMujer.getMes().getSelectedItem();
		String año = (String) guiMujer.getAño().getSelectedItem();
		String nacimiento = dia + "/" + mes + "/" + año;
		String divorcios = (String) guiMujer.getDivorciosOpcion().getSelectedItem();
		int edad = Integer.parseInt(guiMujer.getTextEdad().getText());

		Persona persona = new Persona(0, Nombre, apellido1, apellido2, 'M', usuario, contraseña, correo, nacimiento,
				edad, divorcios, "Disponible");
		try {
			m.getArchivo().agregarpersonaMujer(0, Nombre, apellido1, apellido2, 'M', usuario, contraseña, correo,
					nacimiento, edad, divorcios, "Disponible");
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		lista.add(persona);
	}

	public boolean validarCorreoHombre() {

		boolean emailCorrecto = false;
		String email = guiHombre.getTextCorreo().getText();
		char[] charEmail = email.toCharArray();

		System.out.println(charEmail);

		for (int i = 0; i < charEmail.length; i++) {
			if ((charEmail[i] == '@') && (charEmail[i] == '.')) {
				System.out.println(i + "esta bn el correo");
				emailCorrecto = true;
			} else {

			}
		}

		return emailCorrecto;
	}

	public boolean validarCorreoMujer() {

		boolean emailCorrecto = false;
		String email = guiMujer.getTextCorreo().getText();
		char[] charEmail = email.toCharArray();

		System.out.println(charEmail);

		for (int i = 0; i < charEmail.length; i++) {
			if ((charEmail[i] == '@') && (charEmail[i] == '.')) {
				System.out.println(i + "esta bn el correo");
				emailCorrecto = true;
			} else {

			}
		}

		return emailCorrecto;
	}
}
