package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaVer_todas_listas_buscadas;

public class Ver_todas_listas_buscadas extends VistaVer_todas_listas_buscadas {
//	private Label _listasL;
	public Buscador _buscador;
	public Listas_de_reproduccion__ver_todo_ _listas_de_reproduccion__ver_todo_;
	
	//ANADIDO A MANO
	public Barra_buscador _barra_buscador;
	
	public Ver_todas_listas_buscadas() {
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
		_barra_buscador = new Barra_buscador();
		this.gethL_barraBuscador().add(_barra_buscador);
		_listas_de_reproduccion__ver_todo_ = new Listas_de_reproduccion__ver_todo_();
		this.getvL_cuerpo().as(VerticalLayout.class).add(_listas_de_reproduccion__ver_todo_);
		
	}
	
}