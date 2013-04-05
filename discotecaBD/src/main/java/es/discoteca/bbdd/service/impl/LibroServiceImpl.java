/**
 * 
 */
package es.discoteca.bbdd.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import es.discoteca.bbdd.bean.Libro;
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
	public void create(final String nombre, final String autor, final String argumento,
			final String paginas) {
		// TODO Auto-generated method stub
		Libro bean = new Libro();
		bean.setArgumento(argumento);
		bean.setNombre(nombre);
		bean.setAutor(autor);
		bean.setPaginas(Integer.valueOf(paginas));
		dao.persist(bean);
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
	public void update(final Libro entity) {
		dao.merge(entity);
	}

}
