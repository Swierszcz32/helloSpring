package pl.akademiakodu.helloSpring.dao;

import pl.akademiakodu.helloSpring.model.Person;

import java.util.List;

/**
 * Created by user on 31.07.2017.
 */
public interface PersonDao {
    List<Person> findLastName(String lastName);
    List<Person> findAll();
    Person findOne(Long id);


}
