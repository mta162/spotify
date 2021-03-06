package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.dom.Style;

import basededatos.BDPrincipal;
import basededatos.iCibernauta_no_registrado;
import interfaz.Cancion__bloque_sin_opciones_;
import vistas.VistaUltimos_exitos;

public class Ultimos_exitos extends VistaUltimos_exitos{
//	private Label _tituloL;
	public Cibernauta_no_registrado _cibernauta_no_registrado;
	public Vector<Cancion__bloque_sin_opciones_> _list_Cancion__bloque_sin_opciones_ = new Vector<Cancion__bloque_sin_opciones_>();
	
	private VerticalLayout cuerpo;
	private HorizontalLayout minireproductor;
	
	iCibernauta_no_registrado _iCibernauta_no_registrado = new BDPrincipal();
	
	public Ultimos_exitos(VerticalLayout cuerpo, HorizontalLayout minireproductor) {
		
		this.cuerpo = cuerpo;
		this.minireproductor = minireproductor;
		
		cargar_ultimos_exitos();
		
		int cont = 0;
		HorizontalLayout layout = this.gethL_contenedorCanciones();
		for(int i = 0; i < _list_Cancion__bloque_sin_opciones_.size(); i++) {
			if(cont == 6) {
				layout = new HorizontalLayout();
				layout.getStyle().set("width", "100%");
				layout.getStyle().set("max-height", "50%");
				layout.getThemeList().set("spacing", true);
				this.getvL_filasCanciones().add(layout);
				cont = 0;
			}
			
			layout.add(_list_Cancion__bloque_sin_opciones_.get(i));
			layout.getThemeList().set("spacing", true);
			cont++;
			
		}
		
		this.getStyle().set("margin", "0px");
	}
	
	public void cargar_ultimos_exitos() {
		basededatos.Cancion[] canciones = _iCibernauta_no_registrado.cargar_ultimos_exitos();
		Cancion__bloque_sin_opciones_ c;
		
		for(int i = 0; i < canciones.length; i++) {
			c = new Cancion__bloque_sin_opciones_(cuerpo, minireproductor, canciones[i]);
			_list_Cancion__bloque_sin_opciones_.add(c);
		}
	}
	
}