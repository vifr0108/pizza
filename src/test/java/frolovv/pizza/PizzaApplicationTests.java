package frolovv.pizza;

import frolovv.pizza.entity.Showcase;
import frolovv.pizza.repository.ShowcaseRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import java.util.stream.Stream;

@Slf4j
@SpringBootTest(classes = PizzaApplication.class)
@RunWith(SpringRunner.class)
public class PizzaApplicationTests
{
    @Autowired
    ShowcaseRepository showcaseRepository;

    @Before
    public void setUp()
    {
        Stream.of("Peperoni", "Margarita", "Gavai").forEach(n -> showcaseRepository.save(new Showcase(n)));
    }

    @org.junit.Test
    public void testShowcaseRepositoryFindAll()
    {
        log.error("******Start test testShowcaseRepositoryFindAll*****");
        showcaseRepository.findAll().forEach(
                sc -> log.error("id=" + sc.getId() + "; name=" +
                        sc.getName() + "; number=" +
                        sc.getNumber().toString()));

        Assert.isTrue(showcaseRepository.count() == 4);
        log.error("******End test testShowcaseRepositoryFindAll*****");
    }

    @org.junit.Test
    public void testReducePizza()
    {
        log.error("******Start test testReducePizza*****");
//        new ShowcaseService().reducePizza("Gavai");
//        Stream.of("Peperoni", "Margarita", "Gavai").forEach(n -> showcaseRepository.save(new Showcase(n)));
//        new ShowcaseService().increasePizza("Gavai1");
        log.error("******Start test testReducePizza*****");
    }

}
