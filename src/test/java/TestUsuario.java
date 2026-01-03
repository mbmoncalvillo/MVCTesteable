import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import modelo.Usuario;

class TestUsuario {

	@Test
	void crearUsuario_guardaNombre() {
        Usuario usuario = new Usuario("ANA");
        assertEquals("ANA", usuario.getNombre());
    }

}
