package pl.akademiakodu.helloSpring.dao;

import pl.akademiakodu.helloSpring.model.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonDaoImpl implements PersonDao {

    private static List<Person> people = new ArrayList<>();
    static {
        people.add(new Person(1L,"Adam","Kowalski"));
        people.add(new Person(2L,"Piotr","Kowalski"));
        people.add(new Person(3L,"Hans","Ziom"));
        people.add(new Person(4L,"Michał","Tes"));
        people.add(new Person(5L,"Joanna","Muchiborska"));
    }
    @Override
    public List<Person> findLastName(String lastName) {
        List<Person> resuls = new ArrayList<>();

        for(Person person:people){
            if(person.getLastName().equals(lastName)){
                resuls.add(person);
            }
        }
        return resuls;
    }
    public List<Person> findAll(){
        return people;
    }

    @Override
    public Person findOne(Long id) {
        Person result = null;
        for(Person person: people) {
            if (person.getId().longValue()==id.longValue()){
                result=person;
            }

        }
        return result;

    }
}
