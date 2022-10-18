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
        //given
        int expected = 1;
        //when
        people.add(new Person(6969L,"Andrew"));
        //then
        Assertions.assertEquals(expected, people.ArraylistSize());
    }
    @Test
    public void testRemove(){
        //given
        int expected = 0;
        Person person1 = new Person(1337L,"Saad");
        //when
        people.add(person1);
        people.remove(person1);
        //then
        Assertions.assertEquals(expected, people.ArraylistSize());
    }
    @Test
    public void testFindById(){
        //given
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(80085L,"Durran"));
        people.setPersonList(personList);
        Person expected = personList.get(0);
        //when
        Person actual = people.findById(80085L);
        //then
        Assertions.assertEquals(expected, actual);
    }
}
