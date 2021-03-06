package basededatos;

public interface iComun {

	public Cancion[] cargar_recomendaciones();

	public Cancion[] cargar_escuchadas_recientemente(String aLogin);

	public Cancion[] cargar_favoritas(String aLogin);

	public Cancion[] buscar_canciones(String aCadena_busqueda);

	public Artista[] buscar_artistas(String aCadena_busqueda);

	public Lista_de_reproduccion[] buscar_listas(String aCadena_busqueda);

	public void guardar_lista(Lista_de_reproduccion aLista, String aLogin);

	public void anadir_cancion_historial(int aId_Cancion, String aLogin);

	public boolean anadir_a_favoritos(int aId_Cancion, String aLogin);

	public void anadir_cancion_a_la_lista(String aLogin, int aId_Cancion, int aId_Lista);

	public void crear_lista(String aLogin, String aNombre_lista, String aFoto);

	public Artista[] cargar_artistas_similares(String aLogin_artista);

	public boolean seguir_usuario(String aLogin_usuario, String aLogin_usuario_a_seguir);

	public Cancion cargar_cancion_mas_escuchada();

	public Anuncio[] cargar_anuncios(String aLogin);

	public void eliminar_perfil(String aLogin);

	public void eliminar_lista(int aId_Lista);

	public void eliminar_cancion_lista(int aId_Lista, int aId_Cancion);

	public void cambiar_nombre_lista(int aId_Lista, String aNombre_nuevo_lista);
	
	public Artista recargar_artista(String aLogin);

	public Usuario_registrado recargar_usuario(String login_u);
	
	public Cancion recargar_cancion(int id_cancion);
	
	public Lista recargar_lista(int id_lista);
}