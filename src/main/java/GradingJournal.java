import java.util.*;

public class GradingJournal {

    public HashMap<Student, List<Double>> journal;

    public GradingJournal(List<Student> students) {
        this.journal = new HashMap<Student, List<Double>>();

        for (var i = 0; i < students.size(); i++) {
            var studentToAdd = students.get(i);
            var studentGrades = new ArrayList<Double>();
            journal.put(studentToAdd, studentGrades);
        }
    }

    public HashMap<Student, List<Double>> getJournal() {
        return journal;
    }

    public void addGrade(Student student, Double grade) {
        var studentGrades = this.journal.get(student);
        studentGrades.add(grade);
    }

    public void removeGrade(Student student) {
        var studentGrades = this.journal.get(student);
        studentGrades.clear();
    }

    public void updateGrade(Student student, List<Double> grades) {
        journal.put(student, grades);
    }

    public Double getStudentAverageGrade(Student student) {
        var studentGrades = this.journal.get(student);
        var sum = 0.0;
        var studentGradesLength = studentGrades.size();

        for (int i = 0; i < studentGradesLength; i++) {
            sum += studentGrades.get(i);
        }
        double averageGrade = sum / studentGradesLength;

        return averageGrade;
    }

    public List<Map.Entry<Student, Double>> getTopStudents(int topStudentsCount) {
        var studentsAverage = new HashMap<Student, Double>();
        var students = journal.keySet();

        for(var student : students){
            var studentAverage = getStudentAverageGrade(student);
            studentsAverage.put(student, studentAverage);
        }

        var results = new ArrayList<>(studentsAverage.entrySet());
        Collections.sort(results, (student1,student2) -> {
            if (student1.getValue() < student2.getValue()) {
                return 1;
            } else if (student1.getValue() > student2.getValue()) {
                return -1;
            }
            return 0;
        });

        var topStudents = results.subList(0, topStudentsCount);

        return topStudents;
    }
}
