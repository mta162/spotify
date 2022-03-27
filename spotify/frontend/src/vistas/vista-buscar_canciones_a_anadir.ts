import { LitElement, html, css, customElement } from 'lit-element';
import './vista-cabecera';
import './vista-reproductor_resumido';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-barra_buscador';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-canciones_buscadas_a_anadir';

@customElement('vista-buscar_canciones_a_anadir')
export class VistaBuscar_canciones_a_anadir extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }

    ::-webkit-scrollbar {
		width: 8px;
    }

    ::-webkit-scrollbar-thumb {
		background: #414141;
		background: #A8A8A8;
		border-radius: 5px;
    }

    .fuentes label {
    	font-size: 1.3rem;
    	letter-spacing: -0.04em;
    	font-weight: 700; 
    	color:#FFFFFF;
    	}

      .boton-rectangulo button {
    		border:none; 
    		background:none;
    		border: 1px solid #A8A8A8;
    		border-radius: 5px;
    		cursor: pointer; 
    		color: #FFFFFF;
    		align-self: center;
    		font-size: 0.875rem;
    		padding: 7px 15px;
      }

      .boton-rectangulo button:hover {
    		border: 1px solid #FFFFFF; 

      }

      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="background:#121212; max-width: 100%; max-height: 100%; align-items: flex-start; height: 100%;" class="fuentes boton-rectangulo" id="vL_fondo">
 <vista-cabecera style="width: 100%; height: 10%;" id="vistaCabecera"></vista-cabecera>
 <vaadin-vertical-layout theme="spacing-l" style="max-height: 80%; padding-top: var(--lumo-space-l); padding-right: var(--lumo-space-l); padding-left: var(--lumo-space-l); overflow-y:scroll; width: 100%; height: 100%;" id="vL_cuerpo">
  <vaadin-horizontal-layout style="width: 100%; justify-content: space-between;" id="hL_anadeCancionVolver">
   <label style="align-self: flex-start; font-size: 2.5rem; flex-shrink: 1;" id="label_anadeCancion">Añade una canción a la lista "nombre lista"</label>
   <button style="align-self: center; width: 100%; max-width: 10%;" id="button_volver">VOLVER</button>
  </vaadin-horizontal-layout>
  <vista-barra_buscador style="max-width: 100%; max-height: 5%; width: 50%;" id="vistaBarra_buscador"></vista-barra_buscador>
  <vaadin-horizontal-layout theme="spacing" style="width: 100%;" id="hL_todasCancionesNuevaCancion">
   <label style="font-size: 1.5rem; line-height: 1.75rem; letter-spacing: -0.04em; text-transform: none; font-weight: 700; color:#FFFFFF; width: 100%;" id="label_todasCancionesPara">Todas las canciones para "búsqueda"</label>
   <button style="align-self: center; width: 100%; max-width: 10%;" id="button_nuevaCancion">NUEVA CANCIÓN</button>
  </vaadin-horizontal-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 100%; max-height: 10%; height: 100%;" id="vL_cancionesBuscadasAAnadir">
   <vista-canciones_buscadas_a_anadir style="width: 100%;" id="vistaCanciones_buscadas_a_anadir"></vista-canciones_buscadas_a_anadir>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <vista-reproductor_resumido style="width: 100%; height: 10%;" id="vistaReproductor_resumido"></vista-reproductor_resumido>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
