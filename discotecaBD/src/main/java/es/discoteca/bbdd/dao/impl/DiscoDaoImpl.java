/**
 * 
 */
package es.discoteca.bbdd.dao.impl;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import es.discoteca.bbdd.bean.Disco;
import es.discoteca.bbdd.dao.DiscoDao;

/**
 * @author dsblanco
 * 
 */
@Repository("discoDao")
@Transactional(value = "transactionManagerLocal")
public class DiscoDaoImpl extends JpaDaoImpl<Integer, Disco> implements DiscoDao {

	@Autowired
	EntityManagerFactory entityManagerFactoryLocal;


	@PostConstruct
	public void init() {
		super.setEntityManagerFactory(entityManagerFactoryLocal);
	}

}
