package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaVer_todas_canciones_buscadas_administrador;

public class Ver_todas_canciones_buscadas__administrador_ extends VistaVer_todas_canciones_buscadas_administrador {
	public Buscador_administrador _buscador_administrador;
	public Lista_de_canciones__ver_todo_administrador_ _lista_de_canciones__ver_todo_administrador_;
	
	//ANADIDO A MANO
	public Barra_buscador _barra_buscador;
	
	public Ver_todas_canciones_buscadas__administrador_(VerticalLayout cuerpo, String cadenaBusqueda, basededatos.Cancion[] canciones) {
		this.getStyle().set("margin", "0px");
		this.getStyle().set("padding", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
		_barra_buscador = new Barra_buscador();
		this.gethL_barraBuscador().add(_barra_buscador);
		
		_lista_de_canciones__ver_todo_administrador_ = new Lista_de_canciones__ver_todo_administrador_(cuerpo, canciones);
		this.gethL_listaDeCancionesVerTodoAdmin().add(_lista_de_canciones__ver_todo_administrador_);
		
		this.getLabel_todasLasCancionesPara().setText("Todas las canciones para:  \" " + cadenaBusqueda + " \"");
		
		_barra_buscador.getButton_buscar().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				_buscador_administrador = new Buscador_administrador(cuerpo, _barra_buscador.getInput_buscar().getValue());
				cuerpo.removeAll();
				cuerpo.add(_buscador_administrador);
			}
		});
	}
}