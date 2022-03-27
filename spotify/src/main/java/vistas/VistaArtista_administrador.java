package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.NativeButton;

/**
 * A Designer generated component for the vista-artista_administrador template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-artista_administrador")
@JsModule("./src/vistas/vista-artista_administrador.ts")
public class VistaArtista_administrador extends LitTemplate {

    @Id("hL_fondo")
	private HorizontalLayout hL_fondo;
	@Id("hL_imagenArtista")
	private HorizontalLayout hL_imagenArtista;
	@Id("imagen")
	private Image imagen;
	@Id("vL_nombreArtista")
	private Element vL_nombreArtista;
	@Id("label_nombre")
	private Label label_nombre;
	@Id("label_artista")
	private Label label_artista;
	@Id("hL_botones")
	private HorizontalLayout hL_botones;
	@Id("button_eliminar")
	private NativeButton button_eliminar;
	@Id("button_editar")
	private NativeButton button_editar;
	
	

	public HorizontalLayout gethL_fondo() {
		return hL_fondo;
	}



	public void sethL_fondo(HorizontalLayout hL_fondo) {
		this.hL_fondo = hL_fondo;
	}



	public HorizontalLayout gethL_imagenArtista() {
		return hL_imagenArtista;
	}



	public void sethL_imagenArtista(HorizontalLayout hL_imagenArtista) {
		this.hL_imagenArtista = hL_imagenArtista;
	}



	public Image getImagen() {
		return imagen;
	}



	public void setImagen(Image imagen) {
		this.imagen = imagen;
	}



	public Element getvL_nombreArtista() {
		return vL_nombreArtista;
	}



	public void setvL_nombreArtista(Element vL_nombreArtista) {
		this.vL_nombreArtista = vL_nombreArtista;
	}



	public Label getLabel_nombre() {
		return label_nombre;
	}



	public void setLabel_nombre(Label label_nombre) {
		this.label_nombre = label_nombre;
	}



	public Label getLabel_artista() {
		return label_artista;
	}



	public void setLabel_artista(Label label_artista) {
		this.label_artista = label_artista;
	}



	public HorizontalLayout gethL_botones() {
		return hL_botones;
	}



	public void sethL_botones(HorizontalLayout hL_botones) {
		this.hL_botones = hL_botones;
	}



	public NativeButton getButton_eliminar() {
		return button_eliminar;
	}



	public void setButton_eliminar(NativeButton button_eliminar) {
		this.button_eliminar = button_eliminar;
	}



	public NativeButton getButton_editar() {
		return button_editar;
	}



	public void setButton_editar(NativeButton button_editar) {
		this.button_editar = button_editar;
	}



	/**
     * Creates a new VistaArtista_administrador.
     */
    public VistaArtista_administrador() {
        // You can initialise any data required for the connected UI components here.
    }

}
