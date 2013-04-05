/**
 * 
 */
package es.discoteca.bbdd.dao.impl;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import es.discoteca.bbdd.bean.Libro;
import es.discoteca.bbdd.dao.LibroDao;

/**
 * @author dsblanco
 * 
 */
@Repository("libroDao")
@Transactional(value = "transactionManagerLocal")
public class LibroDaoImpl extends JpaDaoImpl<Integer, Libro> implements LibroDao {

	@Autowired
	EntityManagerFactory entityManagerFactoryLocal;

	@PostConstruct
	public void init() {
		super.setEntityManagerFactory(entityManagerFactoryLocal);
	}

}
