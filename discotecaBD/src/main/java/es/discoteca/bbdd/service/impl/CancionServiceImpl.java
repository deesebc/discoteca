/**
 * 
 */
package es.discoteca.bbdd.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import es.discoteca.bbdd.bean.Cancion;
import es.discoteca.bbdd.dao.CancionDao;
import es.discoteca.bbdd.service.CancionService;

/**
 * @author xe29197
 * 
 */
@Service("cancionService")
@Transactional(value = "transactionManagerLocal")
public class CancionServiceImpl implements CancionService {
	
	@Autowired
	private CancionDao dao;

	@Override
	public void create(final String nombre, final String duracion) {
		Cancion bean = new Cancion();
		bean.setDuracion(duracion);
		bean.setNombre(nombre);
		dao.persist(bean);
	}
}
