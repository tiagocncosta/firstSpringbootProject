package academy.mindswap.myfirstproject.service;

import academy.mindswap.myfirstproject.model.Person;
import academy.mindswap.myfirstproject.repository.PersonRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person getPerson(){
        return Person.builder()
                .name("John")
                .surname("Doe")
                .age(30)
                .city("New York")
                .country("USA")
                .email("aluno@swap.pt")
                .phone("+1-212-555-1234")
                .address("123 Main Street")
                .zip("10001")
                .password("password")
                .confirmPassword("password")
                .build();

    }

    public Person createPerson( Person person){
        return personRepository.addPerson(person);

    }

    public List<Person> getPersonList() {
        return personRepository.getPersonList();
    }

    public List<Person> findByName(String name){
        return  personRepository.findByName(name);
    }
}
