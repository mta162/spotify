package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaVer_todos_los_albumes_buscados_administrador;

public class Ver_todos_los_albumes_buscados__administrador_ extends VistaVer_todos_los_albumes_buscados_administrador {
	public Buscador_administrador _buscador_administrador;
	public Lista_de_albumes__ver_todo_administrador_ _lista_de_albumes__ver_todo_administrador_;
	
	//ANADIDO A MANO
	public Barra_buscador _barra_buscador;
	
	public Ver_todos_los_albumes_buscados__administrador_(VerticalLayout cuerpo, String cadenaBusqueda, basededatos.Album[] albumes) {
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
		_barra_buscador = new Barra_buscador();
		this.gethL_barraBuscador().add(_barra_buscador);
		
		this.getLabel_todosAlbumesPara().setText("Todos los albumes para:  \" " + cadenaBusqueda + " \"");
		
		_lista_de_albumes__ver_todo_administrador_ = new Lista_de_albumes__ver_todo_administrador_(cuerpo, albumes);
		this.gethL_listaDeAlbumesVerTodoAdmin().add(_lista_de_albumes__ver_todo_administrador_);
		
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