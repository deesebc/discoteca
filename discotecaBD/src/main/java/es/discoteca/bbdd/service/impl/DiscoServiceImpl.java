/**
 * 
 */
package es.discoteca.bbdd.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import es.discoteca.bbdd.bean.Disco;
import es.discoteca.bbdd.dao.DiscoDao;
import es.discoteca.bbdd.service.DiscoService;

/**
 * @author xe29197
 * 
 */
@Service("discoService")
@Transactional(value = "transactionManagerLocal")
public class DiscoServiceImpl implements DiscoService {

	@Autowired
	private DiscoDao dao;

	@Override
	public void create(final String nombre, final String grupo) {
		Disco bean = new Disco();
		bean.setGrupo(grupo);
		bean.setNombre(nombre);
		dao.persist(bean);
	}

	@Override
	public List<Disco> findAll() {
		return dao.findAll();
	}

}
