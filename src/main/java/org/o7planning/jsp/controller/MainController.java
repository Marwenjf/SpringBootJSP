package org.opg.jsp.controller;

import org.o7planning.jsp.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {
private static List<Person> persons = new ArrayList<Person>();
static {
    persons.add(new Person("Jaffel","jaffel"));
    persons.add(new Person("Jaffel","jaffel1"));
}
@RequestMapping(value = {"/","index"},method = RequestMethod.GET)
    public String index(Model model){
    String message = "Hello Spring Boot + JSP";
    model.addAttribute("message",message);
    return "index";
}
@RequestMapping(value = {"personList"},method = RequestMethod.GET)
    public String viewPersonList(Model model){
    model.addAttribute("persons",persons);
    return "personList";
}
}
