package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;
import vistas.VistaCabecera;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import vistas.VistaCanciones_del_album_administrador;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.html.Input;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Span;

/**
 * A Designer generated component for the vista-anadir_nuevo_album template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-anadir_nuevo_album")
@JsModule("./src/vistas/vista-anadir_nuevo_album.ts")
public class VistaAnadir_nuevo_album extends LitTemplate {

    @Id("vL_fondo")
	private Element vL_fondo;
	@Id("label_anadeNuevoAlbum")
	private Label label_anadeNuevoAlbum;
	@Id("hL_cancionesDatosImagen")
	private HorizontalLayout hL_cancionesDatosImagen;
	@Id("vL_cancionesAlbum")
	private Element vL_cancionesAlbum;
	@Id("label_cancionesAlbum")
	private Label label_cancionesAlbum;
	@Id("hL_cancionesDelAlbumAdministrador")
	private HorizontalLayout hL_cancionesDelAlbumAdministrador;
	@Id("button_anadirCancion")
	private NativeButton button_anadirCancion;
	@Id("vL_datosAlbum")
	private Element vL_datosAlbum;
	@Id("label_tituloAlbum")
	private Label label_tituloAlbum;
	@Id("input_tituloAlbum")
	private Input input_tituloAlbum;
	@Id("label_artistaAlbum")
	private Label label_artistaAlbum;
	@Id("input_tituloAlbum1")
	private Input input_tituloAlbum1;
	@Id("label_fechaAlbum")
	private Label label_fechaAlbum;
	@Id("input_fechaAlbum")
	private Input input_fechaAlbum;
	@Id("button_anadirAlbum")
	private NativeButton button_anadirAlbum;
	@Id("label_errorTitulo")
	private Label label_errorTitulo;
	@Id("label_errorArtistas")
	private Label label_errorArtistas;
	@Id("vL_imagen")
	private Element vL_imagen;
	@Id("imagen")
	private Image imagen;
	@Id("span")
	private Span span;
	@Id("labelinput_file")
	private Label labelinput_file;
	@Id("input_file")
	private Input input_file;
	
	

	public Element getvL_fondo() {
		return vL_fondo;
	}



	public void setvL_fondo(Element vL_fondo) {
		this.vL_fondo = vL_fondo;
	}



	public Label getLabel_anadeNuevoAlbum() {
		return label_anadeNuevoAlbum;
	}



	public void setLabel_anadeNuevoAlbum(Label label_anadeNuevoAlbum) {
		this.label_anadeNuevoAlbum = label_anadeNuevoAlbum;
	}



	public HorizontalLayout gethL_cancionesDatosImagen() {
		return hL_cancionesDatosImagen;
	}



	public void sethL_cancionesDatosImagen(HorizontalLayout hL_cancionesDatosImagen) {
		this.hL_cancionesDatosImagen = hL_cancionesDatosImagen;
	}



	public Element getvL_cancionesAlbum() {
		return vL_cancionesAlbum;
	}



	public void setvL_cancionesAlbum(Element vL_cancionesAlbum) {
		this.vL_cancionesAlbum = vL_cancionesAlbum;
	}



	public Label getLabel_cancionesAlbum() {
		return label_cancionesAlbum;
	}



	public void setLabel_cancionesAlbum(Label label_cancionesAlbum) {
		this.label_cancionesAlbum = label_cancionesAlbum;
	}



	public HorizontalLayout gethL_cancionesDelAlbumAdministrador() {
		return hL_cancionesDelAlbumAdministrador;
	}



	public void sethL_cancionesDelAlbumAdministrador(HorizontalLayout hL_cancionesDelAlbumAdministrador) {
		this.hL_cancionesDelAlbumAdministrador = hL_cancionesDelAlbumAdministrador;
	}




	public NativeButton getButton_anadirCancion() {
		return button_anadirCancion;
	}



	public void setButton_anadirCancion(NativeButton button_anadirCancion) {
		this.button_anadirCancion = button_anadirCancion;
	}



	public Element getvL_datosAlbum() {
		return vL_datosAlbum;
	}



	public void setvL_datosAlbum(Element vL_datosAlbum) {
		this.vL_datosAlbum = vL_datosAlbum;
	}



	public Label getLabel_tituloAlbum() {
		return label_tituloAlbum;
	}



	public void setLabel_tituloAlbum(Label label_tituloAlbum) {
		this.label_tituloAlbum = label_tituloAlbum;
	}



	public Input getInput_tituloAlbum() {
		return input_tituloAlbum;
	}



	public void setInput_tituloAlbum(Input input_tituloAlbum) {
		this.input_tituloAlbum = input_tituloAlbum;
	}



	public Label getLabel_artistaAlbum() {
		return label_artistaAlbum;
	}



	public void setLabel_artistaAlbum(Label label_artistaAlbum) {
		this.label_artistaAlbum = label_artistaAlbum;
	}



	public Input getInput_tituloAlbum1() {
		return input_tituloAlbum1;
	}



	public void setInput_tituloAlbum1(Input input_tituloAlbum1) {
		this.input_tituloAlbum1 = input_tituloAlbum1;
	}



	public Label getLabel_fechaAlbum() {
		return label_fechaAlbum;
	}



	public void setLabel_fechaAlbum(Label label_fechaAlbum) {
		this.label_fechaAlbum = label_fechaAlbum;
	}



	public Input getInput_fechaAlbum() {
		return input_fechaAlbum;
	}



	public void setInput_fechaAlbum(Input input_fechaAlbum) {
		this.input_fechaAlbum = input_fechaAlbum;
	}



	public NativeButton getButton_anadirAlbum() {
		return button_anadirAlbum;
	}



	public void setButton_anadirAlbum(NativeButton button_anadirAlbum) {
		this.button_anadirAlbum = button_anadirAlbum;
	}


	public Label getLabel_errorTitulo() {
		return label_errorTitulo;
	}


	public Element getvL_imagen() {
		return vL_imagen;
	}



	public void setvL_imagen(Element vL_imagen) {
		this.vL_imagen = vL_imagen;
	}



	public Image getImagen() {
		return imagen;
	}



	public void setImagen(Image imagen) {
		this.imagen = imagen;
	}



	public Span getSpan() {
		return span;
	}



	public void setSpan(Span span) {
		this.span = span;
	}



	public Label getLabelinput_file() {
		return labelinput_file;
	}



	public void setLabelinput_file(Label labelinput_file) {
		this.labelinput_file = labelinput_file;
	}



	public Input getInput_file() {
		return input_file;
	}



	public void setInput_file(Input input_file) {
		this.input_file = input_file;
	}



	public void setLabel_errorTitulo(Label label_errorTitulo) {
		this.label_errorTitulo = label_errorTitulo;
	}



	public Label getLabel_errorArtistas() {
		return label_errorArtistas;
	}



	public void setLabel_errorArtistas(Label label_errorArtistas) {
		this.label_errorArtistas = label_errorArtistas;
	}



	/**
     * Creates a new VistaAnadir_nuevo_album.
     */
    public VistaAnadir_nuevo_album() {
        // You can initialise any data required for the connected UI components here.
    }

}
