package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import interfaz.Cancion__lista_;
import vistas.VistaCanciones_de_lista;

public class Canciones_de_lista extends VistaCanciones_de_lista{
	public Lista_de_reproduccion _lista_de_reproduccion;
	public Vector<Cancion__lista_> _list_Cancion__lista_ = new Vector<Cancion__lista_>();
	
	public Canciones_de_lista() {
		
		cargarCancionesLista();
		
		for(int i = 0; i < _list_Cancion__lista_.size(); i++) {
			this.getvL_contendorCancionesLista().as(VerticalLayout.class).add(_list_Cancion__lista_.get(i));
		}
		
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
	}
	
	public void cargarCancionesLista() {
		
		Cancion__lista_ c;
		
		for(int i = 0; i < 6; i++) {
			c = new Cancion__lista_();
			c.getStyle().set("margin-top", "var(--lumo-space-m)");
			_list_Cancion__lista_.add(c);
		}
		
	}
	
	
}