/**
 * 
 */
package es.discoteca.bbdd.dao.impl;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.JpaCallback;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import es.discoteca.bbdd.bean.Libro;
import es.discoteca.bbdd.bean.Pagination;
import es.discoteca.bbdd.dao.LibroDao;

/**
 * @author dsblanco
 * 
 */
@Repository("libroDao")
@Transactional(value = "transactionManagerLocal")
public class LibroDaoImpl extends JpaDaoImpl<Integer, Libro> implements LibroDao {

	@Autowired
	EntityManagerFactory entityManagerFactoryLocal;

	@Override
	public List<Libro> find(final String name, final String author, final String serie) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<Libro> findPaginate(final String name, final String author, final String serie,
			final Pagination pagination) {
		List<Libro> res = getJpaTemplate().execute(new JpaCallback() {
			@Override
			public Object doInJpa(final EntityManager em) throws PersistenceException {
				StringBuilder sql = new StringBuilder();
				sql.append("SELECT h FROM ");
				sql.append(entityClass.getName());
				sql.append(" 1 = 1 ");
				sql.append(" h ORDER BY ");
				sql.append(pagination.getOrderBy());
				sql.append(" ");
				sql.append(pagination.getOrder());
				final Query q = em.createQuery(sql.toString());
				q.setFirstResult(pagination.getFirst());
				q.setMaxResults(pagination.getPageSize());
				return q.getResultList();
			}

		});
		return res;
	}

	@PostConstruct
	public void init() {
		super.setEntityManagerFactory(entityManagerFactoryLocal);
	}

}
