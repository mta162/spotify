/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Miguel(University of Almeria)
 * License Type: Academic
 */
package basededatos;

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class Usuario_registradoCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression tieneId;
	public final AssociationExpression tiene;
	public final StringExpression login;
	public final StringExpression password;
	public final StringExpression nick;
	public final StringExpression foto;
	public final IntegerExpression seguidores;
	public final IntegerExpression dias_baja;
	public final CollectionExpression marca_como_favorita;
	public final CollectionExpression sigue;
	public final CollectionExpression reproduce;
	public final CollectionExpression gestiona;
	public final CollectionExpression es_seguido_por;
	public final CollectionExpression guarda;
	
	public Usuario_registradoCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		tieneId = new IntegerExpression("tiene.id_Estadisticas", this);
		tiene = new AssociationExpression("tiene", this);
		login = new StringExpression("login", this);
		password = new StringExpression("password", this);
		nick = new StringExpression("nick", this);
		foto = new StringExpression("foto", this);
		seguidores = new IntegerExpression("seguidores", this);
		dias_baja = new IntegerExpression("dias_baja", this);
		marca_como_favorita = new CollectionExpression("ORM_marca_como_favorita", this);
		sigue = new CollectionExpression("ORM_sigue", this);
		reproduce = new CollectionExpression("ORM_reproduce", this);
		gestiona = new CollectionExpression("ORM_gestiona", this);
		es_seguido_por = new CollectionExpression("ORM_es_seguido_por", this);
		guarda = new CollectionExpression("ORM_guarda", this);
	}
	
	public Usuario_registradoCriteria(PersistentSession session) {
		this(session.createCriteria(Usuario_registrado.class));
	}
	
	public Usuario_registradoCriteria() throws PersistentException {
		this(MDS12022PFCastellsTorresPersistentManager.instance().getSession());
	}
	
	public EstadisticasCriteria createTieneCriteria() {
		return new EstadisticasCriteria(createCriteria("tiene"));
	}
	
	public CancionCriteria createMarca_como_favoritaCriteria() {
		return new CancionCriteria(createCriteria("ORM_marca_como_favorita"));
	}
	
	public Usuario_registradoCriteria createSigueCriteria() {
		return new Usuario_registradoCriteria(createCriteria("ORM_sigue"));
	}
	
	public CancionCriteria createReproduceCriteria() {
		return new CancionCriteria(createCriteria("ORM_reproduce"));
	}
	
	public Lista_de_reproduccionCriteria createGestionaCriteria() {
		return new Lista_de_reproduccionCriteria(createCriteria("ORM_gestiona"));
	}
	
	public Usuario_registradoCriteria createEs_seguido_porCriteria() {
		return new Usuario_registradoCriteria(createCriteria("ORM_es_seguido_por"));
	}
	
	public Lista_de_reproduccionCriteria createGuardaCriteria() {
		return new Lista_de_reproduccionCriteria(createCriteria("ORM_guarda"));
	}
	
	public Usuario_registrado uniqueUsuario_registrado() {
		return (Usuario_registrado) super.uniqueResult();
	}
	
	public Usuario_registrado[] listUsuario_registrado() {
		java.util.List list = super.list();
		return (Usuario_registrado[]) list.toArray(new Usuario_registrado[list.size()]);
	}
}

