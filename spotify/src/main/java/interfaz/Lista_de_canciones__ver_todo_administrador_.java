package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import interfaz.Cancion__lista_administrador_;
import vistas.VistaLista_de_canciones_ver_todo_administrador;

public class Lista_de_canciones__ver_todo_administrador_ extends VistaLista_de_canciones_ver_todo_administrador{
	public Ver_todas_canciones_buscadas__administrador_ _ver_todas_canciones_buscadas__administrador_;
	public Vector<Cancion__lista_administrador_> _list_Cancion__lista_administrador_ = new Vector<Cancion__lista_administrador_>();

	private VerticalLayout cuerpo;
	
	public Lista_de_canciones__ver_todo_administrador_(VerticalLayout cuerpo, basededatos.Cancion[] cancionesBuscadas) {
		
		this.cuerpo = cuerpo;
		
		Cancion__lista_administrador_ c;
		for(int i = 0; i < cancionesBuscadas.length; i++) {
			c = new Cancion__lista_administrador_(cuerpo, cancionesBuscadas[i]);
			_list_Cancion__lista_administrador_.add(c);
		}
		
		
		for(int i = 0; i < _list_Cancion__lista_administrador_.size(); i++) {
			this.getvL_contenedorCancionAdministrador().as(VerticalLayout.class).add(_list_Cancion__lista_administrador_.get(i));
		}
		
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
	}

}