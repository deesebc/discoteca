/**
 * 
 */
package es.discoteca.bbdd.dao;

import java.util.List;

import es.discoteca.bbdd.bean.Libro;
import es.discoteca.bbdd.bean.Pagination;

/**
 * @author dsblanco
 * 
 */
public interface LibroDao extends JpaDao<Integer, Libro> {

	List<Libro> find(final String name, final String author, final String serie);

	List<Libro> findPaginate(final String name, final String author, final String serie,
			final Pagination pagination);

}
