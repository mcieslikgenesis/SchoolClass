import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SchoolClassTest {



    @Test
    public void addStudent(){

        //arrange

        var studentsList = new ArrayList<Student>();
        var martyna = new Student("Martyna");
        var bartek = new Teacher("Bartek");
        var schoolClass = new schoolClass(studentsList,bartek);
        //act
        schoolClass.setStudents(martyna);
        //assert
        assertEquals(1, schoolClass.getStudents().size());
        assertEquals("Martyna",schoolClass.getStudents().get(0).getName());
        assertEquals(martyna,schoolClass.getStudents().get(0));

    }

    @Test
    public void removeStudent(){

        //arrange
        var studentsList = new ArrayList<Student>();
        var martyna = new Student("Martyna");
        var bartek = new Teacher("Bartek");
        var schoolClass = new schoolClass(studentsList,bartek);
        schoolClass.setStudents(martyna);
        //act
        schoolClass.removeStudent(martyna);
        //assert
        assertEquals(0, schoolClass.getStudents().size());



    }
    @Test
    public void updateTeacher(){

        //arrange
        var studentsList = new ArrayList<Student>();
        var bartek = new Teacher("Bartek");
        var schoolClass = new schoolClass(studentsList,bartek);
        var mirek = new Teacher("Mirek");
        //act
        schoolClass.setTeacher(mirek);
        //assert
        assertEquals( "Mirek", schoolClass.getTeacher().getName());



    }
    @Test
    public void setGrade(){
        //arrange
        var martyna = new Student("Martyna");
        var bartek = new Teacher("Bartek");
        var studentsList = new ArrayList<Student>();
        studentsList.add(martyna);
        var schoolClass = new schoolClass(studentsList,bartek);
        var journal = new gradingJournal(studentsList);

        //act
        journal.addGrade(martyna, 3d);
        journal.addGrade(martyna, 6d);

        //assert
        assertEquals(6.0,journal.getJournal().get(martyna).get(1));
    }

    @Test
    public void clearGrade(){
        //arrange
        var martyna = new Student("Martyna");
        var bartek = new Teacher("Bartek");
        var studentsList = new ArrayList<Student>();
        studentsList.add(martyna);
        var schoolClass = new schoolClass(studentsList,bartek);
        var journal = new gradingJournal(studentsList);

        //act
        journal.addGrade(martyna, 3d);
        journal.removeGrade(martyna);

        //assert
        assertEquals(0,journal.getJournal().get(martyna).size());
    }

    @Test
    public void updateGrade(){
        //arrange
        var martyna = new Student("Martyna");
        var bartek = new Teacher("Bartek");
        var studentsList = new ArrayList<Student>();
        studentsList.add(martyna);
        var schoolClass = new schoolClass(studentsList,bartek);
        var journal = new gradingJournal(studentsList);

        //act
        journal.addGrade(martyna, 3d);
        journal.updateGrade(martyna, Arrays.asList(5d, 6d));

        //assert
        assertEquals(5.0,journal.getJournal().get(martyna).get(0));
        assertEquals(6.0,journal.getJournal().get(martyna).get(1));

    }

    @Test
    public void getStudentGradeAvg(){
        //arrange
        var martyna = new Student("Martyna");
        var bartek = new Teacher("Bartek");
        var studentsList = new ArrayList<Student>();
        studentsList.add(martyna);
        var schoolClass = new schoolClass(studentsList,bartek);
        var journal = new gradingJournal(studentsList);
        journal.addGrade(martyna, 5d);
        journal.addGrade(martyna, 6d);
        //act
         var result =journal.getStudentAverageGrade(martyna);


        //assert
        assertEquals(5.5,result);


    }

    @Test
    public void getTopStudents(){
        //arrange
        var martyna = new Student("Martyna");
        var julia = new Student("Julia");
        var bartek = new Teacher("Bartek");
        var studentsList = new ArrayList<Student>();
        studentsList.add(martyna);
        studentsList.add(julia);
        var schoolClass = new schoolClass(studentsList,bartek);
        var journal = new gradingJournal(studentsList);
        journal.addGrade(martyna, 5d);
        journal.addGrade(martyna, 6d);
        journal.addGrade(julia, 2d);
        journal.addGrade(julia, 3d);
        //act
        var avgOfBestStudentResult =journal.getStudentAverageGrade(martyna);
        var result = journal.getTopStudents(2);


        //assert
        assertEquals(avgOfBestStudentResult,result.get(0).getValue());



    }



}
