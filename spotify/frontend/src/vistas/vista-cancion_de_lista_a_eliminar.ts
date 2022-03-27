import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-cancion_de_lista_a_eliminar')
export class VistaCancion_de_lista_a_eliminar extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }

    .label-cancion label {
    	font-size: 1rem;
    	line-height: 1.5rem;
    	text-transform: none;
    	letter-spacing: normal;
    	font-weight: 700;

    }

    svg:hover {
    	fill:white;
    }
      `;
  }

  render() {
    return html`
<vaadin-horizontal-layout class="content label-cancion" style="background-color:#181818; width: 100%; height: 100%; align-items: center; justify-content: space-between; max-width: 100%; max-height: 100%;" id="hL_fondo">
 <vaadin-horizontal-layout theme="spacing" style="max-width: 50%; width: 100%; height: 100%; align-items: center;" id="hL_imagenTitulo">
  <img style="max-height: 100%; max-width: 100%;" src="https://i.scdn.co/image/ab67616d0000b273b808f59ccba69a0afcaa79bc" id="imagen">
  <vaadin-vertical-layout class="label-lista" style="align-self: center; width: 100%; height: 100%; align-items: center; justify-content: center; flex-direction: column; display: flex; align-items: center;" id="vL_tituloArtista">
   <label style="align-self: flex-start; color:#FFFFFF; width: 100%;" id="label_titulo">En tus planes</label>
   <label style="align-self: flex-start; color:#9D9D9D; font-weight: 400; width: 100%;" id="label_artista">David Bisbal</label>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; justify-content: flex-end; align-items: center; margin-right: var(--lumo-space-xl);" id="hL_botones">
  <button style="background:none; border:none; height: 100%; max-height: 55%; cursor: pointer;" id="button_eliminar">
   <svg xmlns="http://www.w3.org/2000/svg" height="24px" viewbox="0 0 24 24" width="24px" fill="#A8A8A8" style="width: 100%; height: 100%;">
    <path d="M0 0h24v24H0z" fill="none"></path>
    <path d="M6 19c0 1.1.9 2 2 2h8c1.1 0 2-.9 2-2V7H6v12zM19 4h-3.5l-1-1h-5l-1 1H5v2h14V4z"></path>
   </svg></button>
 </vaadin-horizontal-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}