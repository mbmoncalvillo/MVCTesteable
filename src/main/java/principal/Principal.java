package principal;

import controlador.Controlador;
import servicio.Servicio;
import vista.Vista;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vista vista = new Vista();
        Servicio servicio = new Servicio();

        Controlador controller =
                new Controlador(vista, servicio);

        controller.crearUsuario();
        controller.crearUsuario();
        controller.listarUsuarios();
	}

}
