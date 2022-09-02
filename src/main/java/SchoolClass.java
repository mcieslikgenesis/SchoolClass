import java.util.List;

public class SchoolClass {
    private List<Student> students;
    private Teacher teacher;

    public SchoolClass( List<Student> students, Teacher teacher ){
        this.students = students;
        this.teacher = teacher;
    }

    public void setStudents(List<Student> newStudents){
        this.students = newStudents;
    }

    public void removeStudent(Student student) {
        this.students.remove(student);
    }
}