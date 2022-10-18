import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Student student;
    @BeforeEach
    public void beforeEach(){
        student = new Student(69L, "Kratos");
    }

    @Test
    public void testImplementation(){
        //given
        //when
        //then
        Assert.assertTrue(student instanceof Learner); //Can change to asserFalse to make it fail since we know that the element in implementing the interface
    }
    @Test
    public void testInheritance(){
        //given
        //when
        //then
        Assert.assertTrue(student instanceof Person);
    }
    @Test
    public void testLearn(){
        //given
        Double expected = 5.0;
        student.learn(5.0);
        //when
        Double actual = student.getTotalStudyTime();
        //then
        Assert.assertEquals(expected, actual);
    }

}