import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    Person person;

    @BeforeEach
    public void beforeEach(){
        person = new Person(15L,"Carl");
    }


    @Test
    public void testConstructor(){
        //given
        String expectedName = "";
        long expectedId = 29L;
        //when
        person.setName(expectedName);
        String actualName = person.getName();
        long actualId = 29L;
        //then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedId, actualId);
    }
    @Test
    public void nameTest(){
        //given
        String expected = "Tayba";
        //when
        person.setName(expected);
        String actual = person.getName();
        //then
        Assert.assertEquals(expected, actual);
    }

}