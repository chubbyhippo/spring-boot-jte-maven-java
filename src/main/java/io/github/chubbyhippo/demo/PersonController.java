package io.github.chubbyhippo.demo;

import gg.jte.TemplateEngine;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PersonController {
    private final PersonService personService;
    private final TemplateEngine templateEngine;

    public PersonController(PersonService personService, TemplateEngine templateEngine) {
        this.personService = personService;
        this.templateEngine = templateEngine;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("people", personService.getPeople(1, 20));
        model.addAttribute("nextPage", 2);
        return "index";
    }

    @GetMapping("/people")
    public String people(
            @RequestParam(defaultValue = "1") int page,
            Model model
    ) {
        model.addAttribute("people", personService.getPeople(page, 20));
        model.addAttribute("nextPage", page + 1);
        return "people";
    }
}
