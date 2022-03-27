package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import vistas.VistaCabecera;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.Input;
import vistas.VistaReproductor_resumido;

/**
 * A Designer generated component for the vista-crear_anuncio template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-crear_anuncio")
@JsModule("./src/vistas/vista-crear_anuncio.ts")
public class VistaCrear_anuncio extends LitTemplate {

    @Id("vL_fondo")
	private Element vL_fondo;
	@Id("vistaCabecera")
	private VistaCabecera vistaCabecera;
	@Id("vL_cuerpo")
	private Element vL_cuerpo;
	@Id("label_creaNuevoAnuncio")
	private Label label_creaNuevoAnuncio;
	@Id("vL_tituloDescripcion")
	private Element vL_tituloDescripcion;
	@Id("label_titulo")
	private Label label_titulo;
	@Id("input_titulo")
	private Input input_titulo;
	@Id("label_descripcion")
	private Label label_descripcion;
	@Id("vistaReproductor_resumido")
	private VistaReproductor_resumido vistaReproductor_resumido;
	
	
	public Element getvL_fondo() {
		return vL_fondo;
	}


	public void setvL_fondo(Element vL_fondo) {
		this.vL_fondo = vL_fondo;
	}


	public VistaCabecera getVistaCabecera() {
		return vistaCabecera;
	}


	public void setVistaCabecera(VistaCabecera vistaCabecera) {
		this.vistaCabecera = vistaCabecera;
	}


	public Element getvL_cuerpo() {
		return vL_cuerpo;
	}


	public void setvL_cuerpo(Element vL_cuerpo) {
		this.vL_cuerpo = vL_cuerpo;
	}


	public Label getLabel_creaNuevoAnuncio() {
		return label_creaNuevoAnuncio;
	}


	public void setLabel_creaNuevoAnuncio(Label label_creaNuevoAnuncio) {
		this.label_creaNuevoAnuncio = label_creaNuevoAnuncio;
	}


	public Element getvL_tituloDescripcion() {
		return vL_tituloDescripcion;
	}


	public void setvL_tituloDescripcion(Element vL_tituloDescripcion) {
		this.vL_tituloDescripcion = vL_tituloDescripcion;
	}


	public Label getLabel_titulo() {
		return label_titulo;
	}


	public void setLabel_titulo(Label label_titulo) {
		this.label_titulo = label_titulo;
	}


	public Input getInput_titulo() {
		return input_titulo;
	}


	public void setInput_titulo(Input input_titulo) {
		this.input_titulo = input_titulo;
	}


	public Label getLabel_descripcion() {
		return label_descripcion;
	}


	public void setLabel_descripcion(Label label_descripcion) {
		this.label_descripcion = label_descripcion;
	}


	public VistaReproductor_resumido getVistaReproductor_resumido() {
		return vistaReproductor_resumido;
	}


	public void setVistaReproductor_resumido(VistaReproductor_resumido vistaReproductor_resumido) {
		this.vistaReproductor_resumido = vistaReproductor_resumido;
	}


	/**
     * Creates a new VistaCrear_anuncio.
     */
    public VistaCrear_anuncio() {
        // You can initialise any data required for the connected UI components here.
    }

}