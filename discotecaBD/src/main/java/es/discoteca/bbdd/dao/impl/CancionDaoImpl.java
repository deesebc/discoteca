/**
 * 
 */
package es.discoteca.bbdd.dao.impl;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import es.discoteca.bbdd.bean.Cancion;
import es.discoteca.bbdd.dao.CancionDao;

/**
 * @author dsblanco
 * 
 */
@Repository("cancionDao")
@Transactional(value = "transactionManagerLocal")
public class CancionDaoImpl extends JpaDaoImpl<Integer, Cancion> implements CancionDao {

	@Autowired
	EntityManagerFactory entityManagerFactoryLocal;

	@PostConstruct
	public void init() {
		super.setEntityManagerFactory(entityManagerFactoryLocal);
	}

}
