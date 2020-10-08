package frolovv.pizza;

import frolovv.pizza.entity.Showcase;
import frolovv.pizza.repository.ShowcaseRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import javax.persistence.EntityManager;
import java.util.stream.Stream;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
class PizzaApplicationTests {

	@Autowired
	EntityManager entityManager;

	@Autowired
	ShowcaseRepository showcaseRepository;

	@Before
	public void setUp() throws Exception
	{
		Stream.of("Felix", "Garfield", "Whiskers").forEach(
				n -> showcaseRepository.save(new Showcase(n)));

		Showcase sc = new Showcase("Mark");
		sc.setId(1L);
		sc.setName("Margarita");
		sc.setNumber(1);
		sc.setCapacity(1);
		showcaseRepository.save(sc);
	}

	@Test
	void contextLoads() {
		log.error("******Start test testFindAll*****");
		Iterable<Showcase> allShowcase = showcaseRepository.findAll();
		for (Showcase showcase : allShowcase)
		{
			log.error(showcase.getName());
		}
		log.error("******End test testFindAll*****");
	}

}
