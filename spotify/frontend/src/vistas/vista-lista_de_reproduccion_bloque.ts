import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-lista_de_reproduccion_bloque')
export class VistaLista_de_reproduccion_bloque extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }

    .label-lista label {
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
<vaadin-vertical-layout style="background-color:#181818; border-radius: 0.7rem; width: 100%; height: 100%; padding: var(--lumo-space-l); align-items: center;" theme="spacing-l" class="label-lista" id="vL_fondo">
 <img style="border-radius: 0.7rem; max-width: 100%; max-height: 90%;" id="imagen">
 <vaadin-horizontal-layout theme="spacing" style="align-self: flex-start; width: 100%; flex-shrink: 0; max-width: 100%; margin-right: 0px; margin-left: 0px;" id="hL_tituloBoton">
  <vaadin-vertical-layout style="width: 100%; margin-right: 0px; margin-left: 0px;" id="vL_tituloCreador">
   <label style="align-self: flex-start; color:#FFFFFF; margin-left: 0px; margin-right: 0px;" id="label_titulo">Pop con Ñ Clásicos</label>
   <label style="align-self: flex-start; color:#9D9D9D; font-weight: 400; width: 100%;" id="label_creador">Creador</label>
  </vaadin-vertical-layout>
  <vaadin-horizontal-layout theme="spacing" id="hL_botones" style="margin-right: 0px;">
   <button style="align-self: flex-start; flex-grow: 0; flex-shrink: 0; width: 3rem; height: 3rem; border:none; align-self:center; cursor:pointer; background-color:#1ED760;border-radius:50%" id="button_play">
    <svg role="img" height="" width="" viewbox="0 0 24 24" class="Svg-sc-1bi12j5-0 hDgDGI" style="text-align; center; display: flex; align-items: center;">
     <path d="M7.05 3.606l13.49 7.788a.7.7 0 010 1.212L7.05 20.394A.7.7 0 016 19.788V4.212a.7.7 0 011.05-.606z"></path>
    </svg></button>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
