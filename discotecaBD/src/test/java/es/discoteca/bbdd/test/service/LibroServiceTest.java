/**
 * 
 */
package es.discoteca.bbdd.test.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import es.discoteca.bbdd.bean.Libro;
import es.discoteca.bbdd.bean.Pagination;
import es.discoteca.bbdd.service.LibroService;

/**
 * @author xe29197
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:appContextDBD_TEST.xml")
public class LibroServiceTest {

	private static final Logger LOGGER = Logger.getLogger(LibroServiceTest.class);

	@Autowired
	LibroService service;

	@Test
	public void findPaginate() {
		LOGGER.info("LibroServiceTest - findPaginate - init");
		try {
			Pagination pagination = new Pagination();
			pagination.setFirst(1);
			pagination.setPageSize(10);
			pagination.setOrder("asc");
			pagination.setOrderBy("nombre");
			List<Libro> bean = service.findPaginate("n", null, null, pagination);
			for (Libro book : bean) {
				LOGGER.info("Nombre: " + book.getNombre());
			}
		} catch (Exception except) {
			LOGGER.error("Exception: ", except);
			Assert.assertTrue(false);
		}
		LOGGER.info("LibroServiceTest - findPaginate - end");
	}
}
