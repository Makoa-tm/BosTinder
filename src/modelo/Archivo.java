package modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.swing.JComboBox;
import javax.swing.JFileChooser;

public class Archivo {
	public static final String SEPARATOR = ";";
	public static final String QUOTE = "\"";
	private File archivo = new File("Datos/datos.csv");
	private ObjectOutputStream salida;

	ArrayList<Persona> listaPersonas = new ArrayList<Persona>();

	public Archivo() {

	}

	public void leerArchivo() {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream("Datos/datos.csv"), "UTF-8"));
			String line = null;
			while ((line = br.readLine()) != null) {
				String[] fields = line.split(SEPARATOR);
				System.out.println(Arrays.deepToString(fields));
			}
		} catch (Exception e) {
			System.out.println("Hola");
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {

					e.printStackTrace();
				}

			}
		}

	}

	public void escribirArchivoHombre(Persona persona) {
		FileWriter flwriter = null;
		try {// adem·s de la ruta del archivo recibe un par·metro de tipo boolean, que le
				// indican que se va aÒadir m·s registros
			flwriter = new FileWriter("Datos/datos.csv", true);
			BufferedWriter bfwriter = new BufferedWriter(flwriter);
			// escribe los datos en el archivo
			bfwriter.write(persona.getNombre() + "," + persona.getApellido1() + "," + persona.getApellido2() + ","
					+ persona.getSexo() + "," + persona.getUsuario() + "," + persona.getContrasena() + ","
					+ persona.getCorreo() + "," + persona.getNacimiento() + "," + persona.getEdad() + ","
					+ persona.getIngresos() + "," + persona.getEstado() + "\n");

			bfwriter.close();
			System.out.println("Archivo modificado satisfactoriamente..");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (flwriter != null) {
				try {
					flwriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public void escribirArchivoMujer(Persona persona) {
		FileWriter flwriter = null;
		try {// adem·s de la ruta del archivo recibe un par·metro de tipo boolean, que le
				// indican que se va aÒadir m·s registros
			flwriter = new FileWriter("Datos/datos.csv", true);
			BufferedWriter bfwriter = new BufferedWriter(flwriter);
			// escribe los datos en el archivo
			bfwriter.write(persona.getNombre() + "," + persona.getApellido1() + "," + persona.getApellido2() + ","
					+ persona.getSexo() + "," + persona.getUsuario() + "," + persona.getContrasena() + ","
					+ persona.getCorreo() + "," + persona.getNacimiento() + "," + persona.getEdad() + ","
					+ persona.getDivorcios() + "," + persona.getEstado() + "\n");

			bfwriter.close();
			System.out.println("Archivo modificado satisfactoriamente..");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (flwriter != null) {
				try {
					flwriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public Persona buscarpersona(String usuario) {
		Persona encontrado = null;
		if (!listaPersonas.isEmpty()) {
			System.out.println(listaPersonas);
			for (int i = 0; i < listaPersonas.size(); i++) {
				if (listaPersonas.get(i).getUsuario().equals(usuario)) {
					encontrado = listaPersonas.get(i);
				}
			}
		}
		return encontrado;

	}

	public boolean agregarpersonaHombre(int id, String nombre, String apellido1, String apellido2, char sexo,
			String usuario, String contrasena, String correo, String nacimiento, int edad, double ingresos,
			String estado) throws FileNotFoundException {
		Persona nuevo = new Persona(id, nombre, apellido1, apellido2, sexo, usuario, contrasena, correo, nacimiento,
				edad, ingresos, estado);

		if (buscarpersona(usuario) == null) {
			listaPersonas.add(nuevo);
			escribirArchivoHombre(nuevo);
			return true;
		}

		return false;

	}

	public boolean agregarpersonaMujer(int id, String nombre, String apellido1, String apellido2, char sexo,
			String usuario, String contrasena, String correo, String nacimiento, int edad, String divorcios,
			String estado) throws FileNotFoundException {
		Persona nuevo = new Persona(id, nombre, apellido1, apellido2, sexo, usuario, contrasena, correo, nacimiento,
				edad, divorcios, estado);

		if (buscarpersona(usuario) == null) {
			listaPersonas.add(nuevo);
			escribirArchivoMujer(nuevo);
			return true;
		}

		return false;

	}

	public boolean eliminarPersona(String usuario) {

		Persona e = buscarpersona(usuario);

		if (e != null) {
			listaPersonas.remove(e);
			System.out.println("Se ha eliminado la persona con usuario: " + usuario);
			archivo.delete();
			try {
				archivo.createNewFile();
				for (int i = 0; i < listaPersonas.size(); i++) {
					escribirArchivoHombre(listaPersonas.get(i));
				}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			return true;
		}
		System.out.println("la persona con usuario: " + usuario + " NO existe para eliminarlo");
		return false;
	}

	public int ultimoID() {
		int ultimoID = 34;// ID de ultima linea de fichero //ejemploOJO
		int sumaID = ultimoID + 1;
		return sumaID;
	}

}
