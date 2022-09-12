import java.util.ArrayList;
import java.util.Arrays;

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

        var schoolClass = new schoolClass(studentsList,bartek);

        var journal = new GradingJournal(studentsList);

        journal.addGrade(martyna, 3d);
        journal.addGrade(martyna, 6d);

        journal.addGrade(mateusz, 5d);
        journal.addGrade(mateusz, 4.5);

        journal.addGrade(patrycja, 2d);
        journal.addGrade(patrycja, 3d);

        journal.addGrade(julia, 6d);
        journal.addGrade(julia, 6d);

        journal.addGrade(anita, 20d);
        journal.removeGrade(anita);
        journal.addGrade(anita, 4d);
        journal.addGrade(anita, 3d);

        journal.updateGrade(martyna, Arrays.asList(5d, 6d));



        var average = journal.getStudentAverageGrade(martyna);

        var a = journal.getTopStudents(5);

        System.out.println(a);







    }
}
