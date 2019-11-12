package modelo;

public class UsuarioAdmin {

	private String email;
	private String contrasena;

	public UsuarioAdmin() {
		email = "bostinder.co@gmail.com";
		contrasena = "Bostinder1234";

	}

	// opcion descargar pdf segun media, mediana, moda
	// opcion descargar pdf segun

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

}
