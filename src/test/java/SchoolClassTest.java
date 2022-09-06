import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SchoolClassTest {


    @Test
    public void addNewStudentToList(){

        //arrange

        var studentsList = new ArrayList<Student>();
        var martyna = new Student("Martyna");
        //act
        studentsList.add(martyna);
        //assert
        assertEquals(1,studentsList.size());


    }

    @Test
    public void removeStudentFromList(){

        //arrange

        var studentsList = new ArrayList<Student>();
        var martyna = new Student("Martyna");
        //act
        studentsList.remove(martyna);
        //assert
        assertEquals(0,studentsList.size());


    }


}
