import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.junit.jupiter.api.Assertions.*;

class InstructorTest {
    Instructor instructor;
    Student student;
    @BeforeEach
    public void beforeEach(){
        instructor = new Instructor(69L,"Groo");
        student = new Student(420L, "Kevin");
    }

    @Test
    public void testImplementation(){
        //given
        //then
        //when
        Assert.assertTrue(instructor instanceof Teacher);
    }
    @Test
    public void testInheritance(){
        //given
        //then
        //when
        Assert.assertTrue(instructor instanceof Person);
    }
    @Test
    public void testTeach(){
        //given
        Double expected = 15.0;
        instructor.teach(student, 15.0);
        //then
        Double actual = student.getTotalStudyTime();
        //when
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testLecture(){
        //given
        Student student1 = new Student(69L,"Oakley");
        Student[] students ={student, student1};
        instructor.lecture(students,6);
        Double expected = 3.0;
        //then
        Double actual = student.getTotalStudyTime();
        //when
        Assertions.assertEquals(expected, actual);
    }

}