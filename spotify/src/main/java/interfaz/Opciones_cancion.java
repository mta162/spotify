package interfaz;

import vistas.VistaOpciones_cancion;

public class Opciones_cancion extends VistaOpciones_cancion {
//	private Button _anadir_a_favoritosB;
//	private Button _anadir_A_ListaB;
	public Anadir_cancion_a_una_lista _anadir_cancion_a_una_lista;
	
	public Opciones_cancion() {
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
		this.getButton_reproducir().setVisible(false);
		this.getButton_verAlbum().setVisible(false);
		this.getButton_verArtista().setVisible(false);
		
		this.getButton_anadirFavoritos().getStyle().set("margin-top", "0px");
	}

	public void Anadir_a_favoritos() {
		throw new UnsupportedOperationException();
	}
}