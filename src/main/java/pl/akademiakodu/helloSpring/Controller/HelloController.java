package pl.akademiakodu.helloSpring.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.akademiakodu.helloSpring.model.Book;
import pl.akademiakodu.helloSpring.model.Lotto;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;


@Controller
public class HelloController {


    @GetMapping("/")
    public String hello(ModelMap modelMap){
        modelMap.addAttribute("person", "Adrian");
        return "hello";
    }

    @ResponseBody
    @GetMapping("/hello")
    public String helloName(){
        return "Hello Adrian!";
    }

    @GetMapping("/random")
    public String getRandom(ModelMap modelMap) {

        modelMap.addAttribute("numbers", Lotto.getRandomNumbers());
        return "random";
    }
    @GetMapping("/if")
    public String ifStatement(ModelMap modelMap) {
        modelMap.addAttribute("text", "Adrian");
        modelMap.addAttribute("myText", "Sample text");
        modelMap.addAttribute("a", 123);
        modelMap.addAttribute("b", 456);
        return "if";
    }



}
