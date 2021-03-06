import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-crear_nuevo_estilo')
export class VistaCrear_nuevo_estilo extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }

    .fuentes label {
    	font-size: 1.3rem;
    	letter-spacing: -0.04em;
    	font-weight: 700; 
    	color:#FFFFFF;
    	}


    .fuentes input {
    	color: #FFFFFF;
    	font-size: 1.1rem;
    	border: 1px solid #FFFFFF;
    	background-color:#121212;
    	outline-color: #FFFFFF;
    }

    .fuentes input::placeholder {
    	color:#A8A8A8;
    }

    button{
    	font-size:12px
    }

    button:hover{
    	font-size: 13px;
    }

      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="background:#121212; max-width: 100%; max-height: 100%; align-items: flex-start; height: 100%;" class="fuentes" id="vL_fondo">
 <vaadin-vertical-layout theme="spacing" style="max-height: 100%; padding-top: var(--lumo-space-l); padding-right: var(--lumo-space-l); padding-left: var(--lumo-space-l); height: 100%; width: 100%; max-width: 40%; align-self: center;" id="vL_cuerpo" class="botones-cabecera">
  <label style="align-self: center; font-size: 2.5rem; text-align: center;" id="label_anadeEstilo">Añade un nuevo estilo</label>
  <label style="flex-shrink: 0;" id="label_nombreEstilo">Ponle un nombre al estilo</label>
  <label style="flex-shrink: 0; align-self: center; text-align:center; display: flex; align-items: center; background-color:#E91429; width: 100%; justify-content: center; min-width: 100%; max-width: 100%; padding-right: 10px; padding-left: 10px; margin-left: var(--lumo-space-l); padding-top: var(--lumo-space-xs); padding-bottom: var(--lumo-space-xs);font-weight:400; font-size:1.1rem" id="label_errorEstilo">
   <svg xmlns="http://www.w3.org/2000/svg" height="24px" viewbox="0 0 24 24" width="24px" fill="#FFFFFF" style="margin-right: var(--lumo-space-s);">
    <path d="M11 15h2v2h-2v-2zm0-8h2v6h-2V7zm.99-5C6.47 2 2 6.48 2 12s4.47 10 9.99 10C17.52 22 22 17.52 22 12S17.52 2 11.99 2zM12 20c-4.42 0-8-3.58-8-8s3.58-8 8-8 8 3.58 8 8-3.58 8-8 8z"></path>
   </svg>Ya existe un estilo con este nombre</label>
  <input type="email" placeholder="Pon el nombre del estilo." style="width: 100%; padding: 10px;" id="input_nombreEstilo">
  <button style="color:#000000; background-color:#FFFFFF; max-height: 8%; max-width: 40%; margin-top: var(--lumo-space-l);" id="button_andirEstilo">AÑADIR ESTILO</button>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
