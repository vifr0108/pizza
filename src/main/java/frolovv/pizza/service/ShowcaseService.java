package frolovv.pizza.service;

import frolovv.pizza.entity.Showcase;
import frolovv.pizza.repository.ShowcaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Stream;

@Service
public class ShowcaseService
{
    @Autowired
    ShowcaseRepository showcaseRepository;

    public List<Showcase> findAll(){
        return showcaseRepository.findAll();
    }

    public Integer reducePizza(String pizzaName){
//TODO: rewrite to predicate and stream
        if (showcaseRepository.count()>0) {
            List<Showcase> scs = showcaseRepository.findByName(pizzaName);
            for (Showcase showcase : scs){
                showcase.setNumber(showcase.getNumber() - 1);
            }
            Stream.of(pizzaName).forEach(
                    n -> showcaseRepository.save(new Showcase(n)));
        }
//        else
//TODO: implement rest client call to cookPizza
        return Math.toIntExact(showcaseRepository.count());
    }


}
