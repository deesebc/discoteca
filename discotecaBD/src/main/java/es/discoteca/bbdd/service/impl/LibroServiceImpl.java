/**
 * 
 */
package es.discoteca.bbdd.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import es.discoteca.bbdd.bean.Libro;
import es.discoteca.bbdd.bean.Pagination;
import es.discoteca.bbdd.dao.LibroDao;
import es.discoteca.bbdd.service.LibroService;

/**
 * @author xe29197
 * 
 */
@Service("libroService")
@Transactional(value = "transactionManagerLocal")
public class LibroServiceImpl implements LibroService {

	@Autowired
	private LibroDao dao;

	@Override
	public void create(final Libro entity) {
		dao.persist(entity);
	}

	@Override
	public List<Libro> find(final String name, final String author, final String serie) {
		return dao.find(name, author, serie);
	}

	@Override
	public List<Libro> findAll() {
		return dao.findAll();
	}

	@Override
	public Libro findById(final Integer id) {
		return dao.findById(id);
	}

	@Override
	public List<Libro> findPaginate(final String name, final String author, final String serie,
			final Pagination pagination) {
		return dao.findPaginate(name, author, serie, pagination);
	}

	@Override
	public void remove(final Libro entity) {
		// TODO Auto-generated method stub
		dao.remove(entity);
	}

	@Override
	public void update(final Libro entity) {
		dao.merge(entity);
	}

}
