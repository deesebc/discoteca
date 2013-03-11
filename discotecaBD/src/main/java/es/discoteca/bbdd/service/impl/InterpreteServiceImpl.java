/**
 * 
 */
package es.discoteca.bbdd.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import es.discoteca.bbdd.bean.Interprete;
import es.discoteca.bbdd.dao.InterpreteDao;
import es.discoteca.bbdd.service.InterpreteService;

/**
 * @author xe29197
 * 
 */
@Service("interpreteService")
@Transactional(value = "transactionManagerLocal")
public class InterpreteServiceImpl implements InterpreteService {

	@Autowired
	private InterpreteDao dao;

	@Override
	public List<Interprete> findAll() {
		return dao.findAll();
	}

}
