package interfaz;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaEnviar_correo_de_recuperacion;

public class Enviar_correo_de_recuperacion extends VistaEnviar_correo_de_recuperacion{
//	private Label _tituloL;
//	private Label _correo_EnviadoL;
//	private Button _aceptarB;
	public Recuperar_contrasena _recuperar_contrasena;
	public Gestor_correo_electronico _gestor_correo_electronico;
	
	public Enviar_correo_de_recuperacion(VerticalLayout cuerpo, HorizontalLayout minireproductor) {
    	getStyle().set("margin", "0px");
    	getStyle().set("width", "100%");
    	getStyle().set("height", "100%");
	}

	public void Enviar_correo() {
		throw new UnsupportedOperationException();
	}
}