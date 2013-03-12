package es.discoteca.bbdd.test.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import es.discoteca.bbdd.bean.Cancion;
import es.discoteca.bbdd.bean.Disco;
import es.discoteca.bbdd.service.DiscoService;

/**
 * @author xe29197
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:appContextDBD_TEST.xml")
public class DiscoServiceTest {

	private static final Logger LOGGER = Logger.getLogger(DiscoServiceTest.class);

	@Autowired
	DiscoService service;

	@Test
	@Ignore
	public void create() {
		LOGGER.info("DiscoServiceTest - create - init");
		try {
			service.create("disco X", "grupo X");
			Assert.assertTrue(true);
		} catch (Exception except) {
			LOGGER.error("Exception: ", except);
		}
		LOGGER.info("DiscoServiceTest - create - end");
	}

	@Test
	public void findAll() {
		LOGGER.info("DiscoServiceTest - create - init");
		try {
			List<Disco> discos = service.findAll();
			for (Disco bean : discos) {
				LOGGER.info("Disco nombre: " + bean.getNombre());
				for (Cancion bean2 : bean.getCanciones()) {
					LOGGER.info("Cancion nombre: " + bean2.getNombre());
				}
			}
			Assert.assertTrue(true);
		} catch (Exception except) {
			LOGGER.error("Exception: ", except);
		}
		LOGGER.info("DiscoServiceTest - create - end");
	}

	public DiscoService getService() {
		return service;
	}

	public void setService(final DiscoService service) {
		this.service = service;
	}
}
