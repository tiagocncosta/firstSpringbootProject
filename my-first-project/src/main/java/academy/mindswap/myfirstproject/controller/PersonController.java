package academy.mindswap.myfirstproject.controller;

import academy.mindswap.myfirstproject.model.Person;
import academy.mindswap.myfirstproject.service.PersonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/person")
public class PersonController {


    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping
    public List<Person> getAllPerson() {
        return  personService.getPersonList();

    }

    @PostMapping
    public Person createPerson(@RequestBody Person person) {
        return personService.createPerson(person);
    }

    @GetMapping("/{name}/{age}") //agora para chegar à pessoa tenho de por o nome e um age qualquer porque nao defini
    public List<Person> findByName(@PathVariable String name){
        return personService.findByName(name);
    }
}