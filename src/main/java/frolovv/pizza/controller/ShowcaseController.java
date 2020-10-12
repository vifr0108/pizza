package frolovv.pizza.controller;

import frolovv.pizza.service.ShowcaseService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/showcases")
public class ShowcaseController
{
    private final ShowcaseService service;

//    @GetMapping("/")
//    public List<Showcase> getAll(){
//        return service.findAll();
//    }

    @GetMapping("/eat/{pizzaName}")
    public String eatPizza(@PathVariable String pizzaName){
        log.error(service.reducePizza(pizzaName));
        return "redirect:/showcases";
    }

    @GetMapping("/cookPizza/{pizzaName}")
    public String cookPizza(@PathVariable String pizzaName){
        log.error(service.increasePizza(pizzaName));
        return "redirect:/showcases";
    }


}