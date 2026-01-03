

import org.junit.jupiter.api.Test;

import excepciones.UsuarioExcepcion;

import static org.junit.jupiter.api.Assertions.*;

class TestUsuarioExcepcion {

    @Test
    void crearExcepcion_guardaMensaje() {

        UsuarioExcepcion ex =
                new UsuarioExcepcion("Mensaje de error");

        assertEquals("Mensaje de error", ex.getMessage());
    }
}
