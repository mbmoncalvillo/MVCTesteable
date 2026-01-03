
import excepciones.UsuarioExcepcion;
import modelo.Usuario;
import servicio.Servicio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestServicio {

    @Test
    void crearUsuario_ok_normalizaNombre() throws UsuarioExcepcion {

        Servicio servicio = new Servicio();

        Usuario usuario = servicio.crearUsuario(" ana ");

        assertEquals("ANA", usuario.getNombre());
    }

    @Test
    void crearUsuario_error_nombreVacio() {

        Servicio servicio = new Servicio();

        UsuarioExcepcion ex = assertThrows(
                UsuarioExcepcion.class,
                () -> servicio.crearUsuario("")
        );

        assertEquals("El nombre no puede estar vacío", ex.getMessage());
    }

    @Test
    void obtenerUsuarios_devuelveLista() throws UsuarioExcepcion {

        Servicio servicio = new Servicio();

        servicio.crearUsuario("Ana");
        servicio.crearUsuario("Luis");

        assertEquals(2, servicio.obtenerUsuarios().size());
    }
}
