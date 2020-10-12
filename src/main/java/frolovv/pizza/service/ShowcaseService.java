package frolovv.pizza.service;

import frolovv.pizza.entity.Showcase;
import frolovv.pizza.repository.ShowcaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShowcaseService
{
    private final ShowcaseRepository showcaseRepository;

    @Autowired
    public ShowcaseService(ShowcaseRepository showcaseRepository)
    {
        this.showcaseRepository = showcaseRepository;
    }

//    public List<Showcase> findAll(){
//        showcaseRepository.count();
//        return showcaseRepository.findAll();
//    }

    public String reducePizza(String pizzaName)
    {
//TODO: rewrite to Optional due to can be empty
        List<Showcase> sc = showcaseRepository.findByName(pizzaName);
        sc.forEach(t -> t.setNumber(t.getNumber() - 1));
        showcaseRepository.saveAll(sc);
        return "Pizza eat " + pizzaName;
    }

    public String increasePizza(String pizzaName)
    {
        Showcase sc = new Showcase(pizzaName);
        showcaseRepository.save(sc);
        return "Pizza cooked " + pizzaName;
    }

    //TODO: rewrite rest client call to cookPizza
    public String increasePizzaClient()
    {
        return null;
    }

}
