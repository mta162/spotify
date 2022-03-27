import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-lista_de_reproduccion_lista';

@customElement('vista-listas_del_usuario')
export class VistaListas_del_usuario extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="background:#121212; width: 100%; height: 100%;" theme="spacing" id="vL_contenedorListaReproduccionLista">
 <vista-lista_de_reproduccion_lista style="width: 100%;" id="vistaLista_de_reproduccion_lista"></vista-lista_de_reproduccion_lista>
 <vista-lista_de_reproduccion_lista style="width: 100%;" id="vistaLista_de_reproduccion_lista1"></vista-lista_de_reproduccion_lista>
 <vista-lista_de_reproduccion_lista style="width: 100%;" id="vistaLista_de_reproduccion_lista2"></vista-lista_de_reproduccion_lista>
 <vista-lista_de_reproduccion_lista style="width: 100%;" id="vistaLista_de_reproduccion_lista3"></vista-lista_de_reproduccion_lista>
 <vista-lista_de_reproduccion_lista style="width: 100%;"></vista-lista_de_reproduccion_lista>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
