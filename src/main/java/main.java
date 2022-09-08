import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class main {
    public static void main(String args[]){
        System.out.println("Hello");

        var martyna = new Student("Martyna");
        var mateusz = new Student("Mateusz");
        var patrycja = new Student("Patrycja");
        var julia = new Student("Julia");
        var anita = new Student("Anita");
        var bartek = new Teacher("Bartek");

        var studentsList = new ArrayList<Student>();
        studentsList.add(martyna);
        studentsList.add(mateusz);
        studentsList.add(patrycja);
        studentsList.add(julia);
        studentsList.add(anita);

        var schoolClass = new SchoolClass(studentsList,bartek);

        var journal = new GradingJournal(studentsList);

        journal.AddGrade(martyna, 3d);
        journal.AddGrade(martyna, 6d);

        journal.AddGrade(mateusz, 5d);
        journal.AddGrade(mateusz, 4.5);

        journal.AddGrade(patrycja, 2d);
        journal.AddGrade(patrycja, 3d);

        journal.AddGrade(julia, 6d);
        journal.AddGrade(julia, 6d);

        journal.AddGrade(anita, 20d);
        journal.RemoveGrade(anita);
        journal.AddGrade(anita, 4d);
        journal.AddGrade(anita, 3d);

        journal.UpdateGrade(martyna, Arrays.asList(5d, 6d));




        var average = journal.GetStudentAverageGrade(martyna);

        var a = journal.GetTopStudents(3);

        Stream<Student> stream = studentsList.stream();

        System.out.println(studentsList);



    }
}
