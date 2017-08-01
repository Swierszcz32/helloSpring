package pl.akademiakodu.helloSpring.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import pl.akademiakodu.helloSpring.dao.PersonDao;
import pl.akademiakodu.helloSpring.dao.PersonDaoImpl;
import pl.akademiakodu.helloSpring.model.Person;

/**
 * Created by user on 28.07.2017.
 */
@Controller
public class PersonController {

    private PersonDao personDao = new PersonDaoImpl();

    @GetMapping("/addd")
    public String add(ModelMap modelMap) {
        return "addd";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Person person, ModelMap modelMap) {
        modelMap.addAttribute("person", person);
        return "showw";
    }

    @GetMapping("/search")
    public String search() {
        return "search";
    }

    @GetMapping("/results")
    public String results(@ModelAttribute Person person, ModelMap modelMap) {
        System.out.println("Parametr" + person.getLastName());
        String lastName = person.getLastName();
        modelMap.addAttribute("people", personDao.findLastName(lastName));

        return "results";
    }

    @GetMapping("/all")
    public String all(ModelMap modelMap) {
        modelMap.addAttribute("people",personDao.findAll());
        return "all";
    }

    @GetMapping("/{id}")
    public String display(@PathVariable Long id, ModelMap modelMap){
        System.out.print("Moje id to"+id);
        modelMap.addAttribute("person",personDao.findOne(id));
        return "showw";
    }

}
