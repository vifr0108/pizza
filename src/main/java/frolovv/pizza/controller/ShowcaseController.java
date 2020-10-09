package frolovv.pizza.controller;

import frolovv.pizza.entity.Showcase;
import frolovv.pizza.service.ShowcaseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/showcases")
public class ShowcaseController
{
    @GetMapping("/")
    public List<Showcase> getAll(){
        return new ShowcaseService().findAll();
    }

    @GetMapping("/eat/{pizza_name}")
    public String eatPizza(@PathVariable String pizzaName){
        log.error(new ShowcaseService().reducePizza(pizzaName).toString());
        return "eat";
    }


}