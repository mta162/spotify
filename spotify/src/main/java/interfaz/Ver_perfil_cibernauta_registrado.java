package interfaz;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Ver_perfil_cibernauta_registrado extends Ver_perfil {
//	private Button _consultar_AnunciosB;
	public Cabecera_cibernauta_registrado _cabecera_cibernauta_registrado;
	public Ver_anuncios_de_artistas _ver_anuncios_de_artistas;
	public Modificar_perfil _modificar_perfil;
	
	public Ver_perfil_cibernauta_registrado(VerticalLayout cuerpo, HorizontalLayout minireproductor) {
		super(cuerpo, minireproductor);
		this.getButton_crearAnuncio().setVisible(false);
		this.getButton_recuperarPerfil().setVisible(false);
	}
	
}