package controlador;
import excepciones.UsuarioExcepcion;
import servicio.Servicio;
import vista.Vista;

public class Controlador {
    private Vista vista;
	private Servicio servicio;

    // Inyección por constructor
    public Controlador(Vista vista, Servicio servicio) {
        this.vista = vista;
        this.servicio = servicio;
    }

    public void crearUsuario() {
        try {
            String nombre = vista.pedirNombre();
            vista.mostrarUsuario(servicio.crearUsuario(nombre));
        } catch (UsuarioExcepcion e) {
            vista.mostrarError(e.getMessage());
        }
    }

    public void listarUsuarios() {
        vista.mostrarUsuarios(servicio.obtenerUsuarios());
    }
	}


