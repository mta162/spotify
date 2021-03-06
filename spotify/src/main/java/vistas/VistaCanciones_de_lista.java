package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import vistas.VistaCancion_lista;

/**
 * A Designer generated component for the vista-canciones_de_lista template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-canciones_de_lista")
@JsModule("./src/vistas/vista-canciones_de_lista.ts")
public class VistaCanciones_de_lista extends LitTemplate {

    @Id("vL_contendorCancionesLista")
	private Element vL_contendorCancionesLista;
	
	

	public Element getvL_contendorCancionesLista() {
		return vL_contendorCancionesLista;
	}



	public void setvL_contendorCancionesLista(Element vL_contendorCancionesLista) {
		this.vL_contendorCancionesLista = vL_contendorCancionesLista;
	}



	/**
     * Creates a new VistaCanciones_de_lista.
     */
    public VistaCanciones_de_lista() {
        // You can initialise any data required for the connected UI components here.
    }

}
