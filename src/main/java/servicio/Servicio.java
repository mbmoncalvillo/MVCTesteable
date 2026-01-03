package servicio;


import excepciones.UsuarioExcepcion;
import modelo.Usuario;

import java.util.ArrayList;
import java.util.List;

public class Servicio {

    private List<Usuario> usuarios = new ArrayList<>();

    public Usuario crearUsuario(String nombre) throws UsuarioExcepcion {

        validarNombre(nombre);

        String nombreNormalizado = normalizarNombre(nombre);

        Usuario usuario = new Usuario(nombreNormalizado);
        usuarios.add(usuario);

        return usuario;
    }

    public List<Usuario> obtenerUsuarios() {
        return usuarios;
    }

    /* --- Lógica de negocio --- */

    private void validarNombre(String nombre) throws UsuarioExcepcion {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new UsuarioExcepcion("El nombre no puede estar vacío");
        }
        if (nombre.length() < 3) {
            throw new UsuarioExcepcion("El nombre debe tener al menos 3 caracteres");
        }
    }

    private String normalizarNombre(String nombre) {
        return nombre.trim().toUpperCase();
    }
}

