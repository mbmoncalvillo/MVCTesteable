package vista;
import modelo.Usuario;

import java.util.List;
import java.util.Scanner;
public class Vista {

	    private Scanner scanner = new Scanner(System.in);

	    public String pedirNombre() {
	        System.out.print("Introduce el nombre del usuario: ");
	        return scanner.nextLine();
	    }

	    public void mostrarUsuario(Usuario usuario) {
	        System.out.println("Usuario creado: " + usuario.getNombre());
	    }

	    public void mostrarUsuarios(List<Usuario> usuarios) {
	        System.out.println("Listado de usuarios:");
	        for (Usuario u : usuarios) {
	            System.out.println("- " + u.getNombre());
	        }
	    }

	    public void mostrarError(String mensaje) {
	        System.out.println("ERROR: " + mensaje);
	    }
	}


