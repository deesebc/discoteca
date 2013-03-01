/**
 * 
 */
package es.discoteca.bbdd.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import es.discoteca.bbdd.dao.GenericDao;

/**
 * @author xe29197
 * 
 */
public abstract class GenericDaoImpl<T> implements GenericDao<T> {

	@PersistenceContext
	protected EntityManager entity;

	private final Class<T> type;

	@SuppressWarnings("unchecked")
	public GenericDaoImpl() {
		Type t = getClass().getGenericSuperclass();
		ParameterizedType pt = (ParameterizedType) t;
		type = (Class<T>) pt.getActualTypeArguments()[0];
	}

	@Override
	public long countAll(final Map<String, Object> params) {

		final StringBuffer queryString = new StringBuffer("SELECT count(o) from ");

		queryString.append(type.getSimpleName()).append(" o ");
		// queryString.append(this.entity.getQueryClauses(params, null));

		final Query query = this.entity.createQuery(queryString.toString());

		return (Long) query.getSingleResult();

	}

	@Override
	public T create(final T t) {
		this.entity.persist(t);
		return t;
	}

	@Override
	public void delete(final Object id) {
		this.entity.remove(this.entity.getReference(type, id));
	}

	@Override
	public T find(final Object id) {
		return this.entity.find(type, id);
	}

	@Override
	public T update(final T t) {
		return this.entity.merge(t);
	}
}
