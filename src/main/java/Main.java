import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class Main {


    public static void main(String[] args) {



        SchoolClass class1 = new SchoolClass();
        Students student1 = new Students("Andrzej","Kowalski");
        Students student2 = new Students("Ryszard","Nowicki");
        Teacher teacher1 = new Teacher("Jan", "Nowak");
        class1.setTeacher(teacher1);
        class1.setStudents(student1);
        class1.setStudents(student2);
        JournalClass markRow1 = new JournalClass(1,2,6,6,7);
        JournalClass markRow2 = new JournalClass(1,1,1,1,1);
        class1.putMarkToStudent(student1, markRow1);
        class1.putMarkToStudent(student2,markRow2);


        System.err.println(class1.getStudentMarks(student1));
        System.err.println(class1.getStudentMarks(student2));


























    }
}
