package es.discoteca.bbdd.test.service;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import es.discoteca.bbdd.service.CancionService;

/**
 * @author xe29197
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:appContextDBD_TEST.xml")
public class CancionServiceTest {

	private static final Logger LOGGER = Logger.getLogger(CancionServiceTest.class);

	@Autowired
	CancionService service;

	@Test
	public void create() {
		LOGGER.info("CancionServiceTest - create - init");
		try {
			service.create("Cancion", "01:00");
			Assert.assertTrue(true);
		} catch (Exception except) {
			LOGGER.error("Exception: ", except);
		}
		LOGGER.info("CancionServiceTest - create - end");
	}

	public CancionService getService() {
		return service;
	}

	public void setService(final CancionService service) {
		this.service = service;
	}
}
