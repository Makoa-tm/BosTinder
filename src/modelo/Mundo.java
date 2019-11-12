package modelo;

public class Mundo {
	Usuario usuario;
	Persona personaHombre, personaMujer;
	UsuarioAdmin usuarioAdmin;
	Archivo archivo;

	public Mundo() {
		usuario = new Usuario();
		usuarioAdmin = new UsuarioAdmin();
		archivo = new Archivo();

	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Persona getPersonaHombre() {
		return personaHombre;
	}

	public void setPersonaHombre(Persona personaHombre) {
		this.personaHombre = personaHombre;
	}

	public Persona getPersonaMujer() {
		return personaMujer;
	}

	public void setPersonaMujer(Persona personaMujer) {
		this.personaMujer = personaMujer;
	}

	public UsuarioAdmin getUsuarioAdmin() {
		return usuarioAdmin;
	}

	public void setUsuarioAdmin(UsuarioAdmin usuarioAdmin) {
		this.usuarioAdmin = usuarioAdmin;
	}

	public Archivo getArchivo() {
		return archivo;
	}

	public void setArchivo(Archivo archivo) {
		this.archivo = archivo;
	}

}
