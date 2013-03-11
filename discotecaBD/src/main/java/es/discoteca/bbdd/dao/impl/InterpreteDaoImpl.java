/**
 * 
 */
package es.discoteca.bbdd.dao.impl;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import es.discoteca.bbdd.bean.Interprete;
import es.discoteca.bbdd.dao.InterpreteDao;

/**
 * @author dsblanco
 * 
 */
@Repository("interpreteDao")
@Transactional(value = "transactionManagerLocal")
public class InterpreteDaoImpl extends JpaDaoImpl<Integer, Interprete> implements InterpreteDao {

	@Autowired
	EntityManagerFactory entityManagerFactoryLocal;

	@PostConstruct
	public void init() {
		super.setEntityManagerFactory(entityManagerFactoryLocal);
	}

}
