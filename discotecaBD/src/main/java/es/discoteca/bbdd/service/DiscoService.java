/**
 * 
 */
package es.discoteca.bbdd.service;

import java.util.List;

import es.discoteca.bbdd.bean.Disco;

/**
 * @author xe29197
 * 
 */
public interface DiscoService {

	void create(String nombre, String grupo);

	List<Disco> findAll();

	Disco findById(final Integer id);

	void update(final Disco entity);

}
