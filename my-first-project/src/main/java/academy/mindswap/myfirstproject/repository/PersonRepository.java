package academy.mindswap.myfirstproject.repository;

import academy.mindswap.myfirstproject.model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class PersonRepository {

    List<Person> personList;

    public PersonRepository() {
        personList = new ArrayList<>(List.of(
                Person.builder()
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
                        .build())) ;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public Person addPerson(Person person) {
        personList.add(person);
        return person;
    }

    public  List<Person> findByName(String name){
        return personList.stream()
                .filter(person -> person.getName().equalsIgnoreCase(name))
                .collect(Collectors.toList());
    }
}