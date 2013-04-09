/**
 * 
 */
package es.discoteca.bbdd.service;

import java.util.List;

import es.discoteca.bbdd.bean.Libro;
import es.discoteca.bbdd.bean.Pagination;

/**
 * @author xe29197
 * 
 */
public interface LibroService {

	void create(final Libro entity);

	List<Libro> find(final String name, final String author, final String serie);

	List<Libro> findAll();

	Libro findById(final Integer id);

	List<Libro> findPaginate(final String name, final String author, final String serie,
			final Pagination pagination);

	void remove(final Libro entity);

	void update(final Libro entity);

}
