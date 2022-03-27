package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.NativeButton;

/**
 * A Designer generated component for the vista-lista_de_reproduccion_bloque template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-lista_de_reproduccion_bloque")
@JsModule("./src/vistas/vista-lista_de_reproduccion_bloque.ts")
public class VistaLista_de_reproduccion_bloque extends LitTemplate {

    @Id("vL_fondo")
	private Element vL_fondo;
	@Id("imagen")
	private Image imagen;
	@Id("hL_tituloBoton")
	private HorizontalLayout hL_tituloBoton;
	@Id("vL_tituloCreador")
	private Element vL_tituloCreador;
	@Id("label_titulo")
	private Label label_titulo;
	@Id("label_creador")
	private Label label_creador;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("button_play")
	private NativeButton button_play;
	
	

	public Element getvL_fondo() {
		return vL_fondo;
	}



	public void setvL_fondo(Element vL_fondo) {
		this.vL_fondo = vL_fondo;
	}



	public Image getImagen() {
		return imagen;
	}



	public void setImagen(Image imagen) {
		this.imagen = imagen;
	}



	public HorizontalLayout gethL_tituloBoton() {
		return hL_tituloBoton;
	}



	public void sethL_tituloBoton(HorizontalLayout hL_tituloBoton) {
		this.hL_tituloBoton = hL_tituloBoton;
	}



	public Element getvL_tituloCreador() {
		return vL_tituloCreador;
	}



	public void setvL_tituloCreador(Element vL_tituloCreador) {
		this.vL_tituloCreador = vL_tituloCreador;
	}



	public Label getLabel_titulo() {
		return label_titulo;
	}



	public void setLabel_titulo(Label label_titulo) {
		this.label_titulo = label_titulo;
	}



	public Label getLabel_creador() {
		return label_creador;
	}



	public void setLabel_creador(Label label_creador) {
		this.label_creador = label_creador;
	}



	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}



	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}



	public NativeButton getButton_play() {
		return button_play;
	}



	public void setButton_play(NativeButton button_play) {
		this.button_play = button_play;
	}



	/**
     * Creates a new VistaLista_de_reproduccion_bloque.
     */
    public VistaLista_de_reproduccion_bloque() {
        // You can initialise any data required for the connected UI components here.
    }

}
