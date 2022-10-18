import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PeopleTest {
    People people;
    @BeforeEach
    public void beforeEach(){
        people = new People();
    }
    @Test
    public void testAdd(){
        //Given
        int expected = 1;
        //When
        people.add(new Person(6969L,"Andrew"));
        //Then
        Assertions.assertEquals(expected, people.ArraylistSize());
    }
    @Test
    public void testRemove(){
        //Given
        int expected = 0;
        Person person1 = new Person(1337L,"Saad");
        //When
        people.add(person1);
        people.remove(person1);
        //Then
        Assertions.assertEquals(expected, people.ArraylistSize());
    }
    @Test
    public void testFindById(){
        //Given
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(80085L,"Durran"));
        people.setPersonList(personList);
        Person expected = personList.get(0);
        //When
        Person actual = people.findById(80085L);
        //Then
        Assertions.assertEquals(expected, actual);
    }
}