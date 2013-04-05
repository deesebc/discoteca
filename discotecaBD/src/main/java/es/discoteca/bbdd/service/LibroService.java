/**
 * 
 */
package es.discoteca.bbdd.service;

import java.util.List;

import es.discoteca.bbdd.bean.Libro;

/**
 * @author xe29197
 * 
 */
public interface LibroService {

	void create(String nombre, String autor, String argumento, String paginas);

	List<Libro> findAll();

	Libro findById(final Integer id);

	void update(final Libro entity);

}
