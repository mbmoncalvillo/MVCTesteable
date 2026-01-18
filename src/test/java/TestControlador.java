

import excepciones.UsuarioExcepcion;
import modelo.Usuario;
import org.junit.jupiter.api.Test;

import controlador.Controlador;
import servicio.Servicio;
import vista.Vista;

import static org.mockito.Mockito.*;

import java.util.List;

class TestControlador {

    @Test
    void crearUsuario_ok() throws UsuarioExcepcion {

        Vista vista = mock(Vista.class);
        Servicio servicio = mock(Servicio.class);

        when(vista.pedirNombre()).thenReturn("Ana");
        when(servicio.crearUsuario("Ana"))
                .thenReturn(new Usuario("ANA"));

        Controlador controlador =
                new Controlador(vista, servicio);

        controlador.crearUsuario();

        verify(vista).mostrarUsuario(any(Usuario.class));
         }

    @Test
    void crearUsuario_error() throws UsuarioExcepcion {

        Vista vista = mock(Vista.class);
        Servicio servicio = mock(Servicio.class);

        when(vista.pedirNombre()).thenReturn("");
        when(servicio.crearUsuario(""))
                .thenThrow(new UsuarioExcepcion("El nombre no puede estar vacío"));

        Controlador controlador =
                new Controlador(vista, servicio);

        controlador.crearUsuario();

        verify(vista).mostrarError("El nombre no puede estar vacío");
       }
    @Test
    void listarUsuarios_controlador() {
      
        Vista vista = mock(Vista.class);
        Servicio servicio = mock(Servicio.class);

       
        when(servicio.obtenerUsuarios()).thenReturn(List.of());

       
        Controlador controlador = new Controlador(vista, servicio);

        
        controlador.listarUsuarios();

       
        verify(vista).mostrarUsuarios(any(List.class));
    }

}
