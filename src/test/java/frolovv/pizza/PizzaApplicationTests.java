package frolovv.pizza;

import frolovv.pizza.entity.Showcase;
import frolovv.pizza.repository.ShowcaseRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.stream.Stream;

@Slf4j
@SpringBootTest(classes = PizzaApplication.class)
@RunWith(SpringRunner.class)
public class PizzaApplicationTests {
	@Autowired
	ShowcaseRepository showcaseRepository;

	@Before
	public void setUp() throws Exception
	{
		Stream.of("Felix", "Garfield", "Whiskers").forEach(
				n -> showcaseRepository.save(new Showcase(n)));
	}

	@org.junit.Test
	public void testShowcaseRepositoryFindAll() {
		log.error("******Start test testFindAll*****");
		Iterable<Showcase> allShowcase = showcaseRepository.findAll();
		for (Showcase showcase : allShowcase)
		{
			log.error(showcase.getName());
		}
		assert (showcaseRepository.count() == 3);
		log.error("******End test testFindAll*****");
	}

}
