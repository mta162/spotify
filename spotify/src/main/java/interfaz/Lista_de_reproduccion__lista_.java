package interfaz;

import vistas.VistaLista_de_reproduccion_lista;

public class Lista_de_reproduccion__lista_ extends VistaLista_de_reproduccion_lista {
	public Listas_de_reproduccion_buscadas _listas_de_reproduccion_buscadas;
	public Listas_del_usuario _listas_del_usuario;
	public Ver_lista_de_reproduccion_ajena _ver_lista_de_reproduccion_ajena;
	
	public Lista_de_reproduccion__lista_() {
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
	}
}