package modelo;

import java.io.Serializable;

import javax.swing.JComboBox;

public class Persona implements Serializable {

	private int id;
	private String usuario, correo, nombre, apellido1, apellido2, contrasena, divorcios;
	private int edad;
	private double ingresos;
	private String nacimiento;
	private char sexo;
	private String estado; // si el usuario esta inactivo o disponible en cuanto el estado

	// contructor para mujer

	public Persona(int id, String nombre, String apellido1, String apellido2, char sexo, String usuario,
			String contrasena, String correo, String nacimiento, int edad, String divorcios, String estado) {
		super();
		// disponible = true;
		this.id = id; // no estoy segura si se incluye esto
		this.nacimiento = nacimiento;
		this.usuario = usuario;
		this.correo = correo;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.edad = edad;
		this.divorcios = divorcios;
		this.contrasena = contrasena;
	}

	// Contructor para hombres
	public Persona(int id, String nombre, String apellido1, String apellido2, char sexo, String usuario,
			String contrasena, String correo, String nacimiento, int edad, double ingresos, String estado) {
		super();

		this.sexo = sexo;
		this.estado = estado;
		// disponible = true;
		this.id = id; // no estoy segura si se incluye esto
		this.nacimiento = nacimiento;
		this.usuario = usuario;
		this.correo = correo;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.edad = edad;
		this.ingresos = ingresos;
		this.contrasena = contrasena;
	}

	// llinea codigo para definir combo box: estado.setModel(new
	// DefaultComboBoxModel<>(new String[] { "Disponible", "Inactivo" }));

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDivorcios() {
		return divorcios;
	}

	public void setDivorcios(String divorcios) {
		this.divorcios = divorcios;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getIngresos() {
		return ingresos;
	}

	public void setIngresos(double ingresos) {
		this.ingresos = ingresos;
	}

	public String getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(String nacimiento) {
		this.nacimiento = nacimiento;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
