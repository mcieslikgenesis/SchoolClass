import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class SchoolClassTest {

    @Test
    public void listAllStudents(){
        //arrange
        SchoolClass class1 = new SchoolClass();
        List<Students> students = new ArrayList<Students>();
        Students student1 = new Students("Andrzej","Kowalski");
        Students student2 = new Students("Ryszard","Nowicki");
        class1.setStudents(student1);
        class1.setStudents(student2);
        //act


        List<Students> students1 = class1.getStudents();

        //assert

        assertEquals(2,students1.size());


    }

    @Test
    public void listStudentMarks(){
        //arrnage
        SchoolClass class1 = new SchoolClass();
        Students student1 = new Students("Andrzej","Kowalski");
        Students student2 = new Students("Ryszard","Nowicki");
        Teacher teacher1 = new Teacher("Jan", "Nowak");
        class1.setTeacher(teacher1);
        class1.setStudents(student1);
        class1.setStudents(student2);



        //act

        //assert

    }









}

