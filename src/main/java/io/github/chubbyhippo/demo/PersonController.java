package io.github.chubbyhippo.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PersonController {
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("people", personService.getPeople(20));
        model.addAttribute("nextPage", 2);
        return "index";
    }

    @GetMapping("/people")
    public String people(
            @RequestParam(defaultValue = "1") int page,
            Model model
    ) {
        model.addAttribute("people", personService.getPeople(20));
        model.addAttribute("nextPage", page + 1);
        return "people";
    }
}
