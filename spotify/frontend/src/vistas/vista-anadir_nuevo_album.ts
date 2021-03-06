import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-anadir_nuevo_album')
export class VistaAnadir_nuevo_album extends LitElement {
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

    .fuentes input {
    	color: #FFFFFF;
    	font-family: helvetica;
    	font-size: 1.1rem;
    	border: 1px solid #FFFFFF;
    	background-color:#121212;
    	outline-color: #FFFFFF;
    }

    .botonlabel label {
    	font-size:12px;
    }

    .botonlabel label:hover {
    	font-size:13px;
    }

    .fuentes input::placeholder {
    	color:#A8A8A8;
    }

    button {
    	font-size:12px;
    }

    button:hover {
    	font-size:13px;
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
<vaadin-vertical-layout style="width: 100%; height: 100%; background-color:#121212; overflow-y:scroll" class="fuentes botones-cabecera" theme="spacing" id="vL_fondo">
 <label style="align-self: center; font-size: 2.5rem; text-align: center;" id="label_anadeNuevoAlbum">Añade un nuevo álbum</label>
 <vaadin-horizontal-layout theme="spacing-xl" style="width: 100%; max-width: 80%; align-self: center; max-height: 70%; height: 100%;" id="hL_cancionesDatosImagen">
  <vaadin-vertical-layout theme="spacing" style="max-width: 20%; width: 100%; align-items: center; align-self: flex-start; height: 100%; margin-right: var(--lumo-space-s); margin: 0px;" id="vL_cancionesAlbum">
   <label style="flex-shrink: 0; align-self: flex-start;" id="label_cancionesAlbum">Canciones del álbum</label>
   <vaadin-horizontal-layout theme="spacing" style="overflow-y:scroll; border: 1px solid #FFFFFF; height: 100%; max-height: 70%; width: 100%;" id="hL_cancionesDelAlbumAdministrador"></vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" class="boton-rectangulo" style="width: 100%; margin-bottom: 0px; padding-bottom: 0px;">
    <button style="align-self: center; width: 100%; margin: 0px; min-width: 100%; max-width: 100%; font-size: 0.875rem; font-weight:400;letter-spacing: 0.0em;" id="button_anadirCancion">AÑADIR CANCIÓN</button>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="max-width: 60%; width: 100%; margin-right: var(--lumo-space-xl);" theme="spacing" id="vL_datosAlbum">
   <label style="flex-shrink: 0;" id="label_tituloAlbum">¿Cuál es el título del álbum?</label>
   <label style="flex-shrink: 0; align-self: center; text-align:center; display: flex; align-items: center; background-color:#E91429; width: 100%; justify-content: center; min-width: 100%; max-width: 100%; padding-right: 10px; padding-left: 10px; margin-left: var(--lumo-space-l); padding-top: var(--lumo-space-xs); padding-bottom: var(--lumo-space-xs);font-weight:400; font-size:1.1rem" id="label_errorTitulo">
    <svg xmlns="http://www.w3.org/2000/svg" height="24px" viewbox="0 0 24 24" width="24px" fill="#FFFFFF" style="margin-right: var(--lumo-space-s);">
     <path d="M11 15h2v2h-2v-2zm0-8h2v6h-2V7zm.99-5C6.47 2 2 6.48 2 12s4.47 10 9.99 10C17.52 22 22 17.52 22 12S17.52 2 11.99 2zM12 20c-4.42 0-8-3.58-8-8s3.58-8 8-8 8 3.58 8 8-3.58 8-8 8z"></path>
    </svg>Título del álbum incorrecto</label>
   <input type="text" placeholder="Pon un título al álbum." style="width: 100%; padding: 10px;" id="input_tituloAlbum">
   <label style="flex-shrink: 0; margin-top: var(--lumo-space-l);" id="label_artistaAlbum">¿Qué artista(s) han creado el álbum?</label>
   <label style="flex-shrink: 0; align-self: center; text-align:center; display: flex; align-items: center; background-color:#E91429; width: 100%; justify-content: center; min-width: 100%; max-width: 100%; padding-right: 10px; padding-left: 10px; margin-left: var(--lumo-space-l); padding-top: var(--lumo-space-xs); padding-bottom: var(--lumo-space-xs);font-weight:400; font-size:1.1rem" id="label_errorArtistas">
    <svg xmlns="http://www.w3.org/2000/svg" height="24px" viewbox="0 0 24 24" width="24px" fill="#FFFFFF" style="margin-right: var(--lumo-space-s);">
     <path d="M11 15h2v2h-2v-2zm0-8h2v6h-2V7zm.99-5C6.47 2 2 6.48 2 12s4.47 10 9.99 10C17.52 22 22 17.52 22 12S17.52 2 11.99 2zM12 20c-4.42 0-8-3.58-8-8s3.58-8 8-8 8 3.58 8 8-3.58 8-8 8z"></path>
    </svg>Artistas para el álbum incorrectos</label>
   <input type="text" placeholder="Pon el artisa(s) que ha creado el álbum." style="width: 100%; padding: 10px;" id="input_tituloAlbum1">
   <label style="flex-shrink: 0; margin-top: var(--lumo-space-l);" id="label_fechaAlbum">¿Cual es la fecha de edición?</label>
   <input type="date" placeholder="Pon la fecha de edición del álbum." style="width: 100%; padding: 10px; " id="input_fechaAlbum">
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing-l" class="botonlabel" style="max-width: 20%; width: 100%; align-items: center; align-self: flex-start; margin-top: var(--lumo-space-m);" id="vL_imagen">
   <img style="max-width: 90%; max-height: 90%; border-radius:0%; border: 2px solid #FFFFFF;" id="imagen">
   <span class="input_file" id="span"><input type="file" name="input_file" id="input_file" style="display:none" accept="image/*"></span>
   <label for="input_file" id="labelinput_file" style="color:#121212; background-color:#FFFFFF; border-radius:500px; display: flex; align-items: center; cursor:pointer; padding: 8px 34px; letter-spacing: 1.76px; padding-top: 12px; padding-bottom: 12px; justify-content: center; width: 100%; margin-top: var(--lumo-space-xs);">
    <svg xmlns="http://www.w3.org/2000/svg" height="24px" viewbox="0 0 24 24" width="24px" fill="#121212" style="padding-right: var(--lumo-space-s);">
     <path d="M0 0h24v24H0V0z" fill="none"></path>
     <path d="M18 20H4V6h9V4H4c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2v-9h-2v9zm-7.79-3.17l-1.96-2.36L5.5 18h11l-3.54-4.71zM20 4V1h-2v3h-3c.01.01 0 2 0 2h3v2.99c.01.01 2 0 2 0V6h3V4h-3z"></path>
    </svg><span>ELEGIR FOTO</span></label>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <button style="color:#000000; background-color:#FFFFFF; max-height: 7%; max-width: 15%; height: 7%; min-height: 7%; margin-top: var(--lumo-space-m);" id="button_anadirAlbum" class="registro">AÑADIR ÁLBUM</button>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
