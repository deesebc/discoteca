/**
 * 
 */
package es.discoteca.bbdd.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import es.discoteca.bbdd.bean.Cancion;
import es.discoteca.bbdd.dao.GenericDao;
import es.discoteca.bbdd.service.CancionService;

/**
 * @author xe29197
 * 
 */
public class CancionServiceImpls implements CancionService {
	@Autowired
	private GenericDao<Cancion> dao;

	@Override
	public void create(final String nombre, final String duracion) {
		Cancion bean = new Cancion();
		bean.setDuracion(duracion);
		bean.setNombre(nombre);
		dao.create(bean);
	}
}
