import java.util.ArrayList;
public class SchoolClass {
    public ArrayList<Student> students;
    public Teacher teacher;

    public SchoolClass( ArrayList<Student> students, Teacher teacher ){
        this.students = students;
        this.teacher = teacher;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setStudents(Student newStudents){
        this.students.add(newStudents);
    }

    public void removeStudent(Student student) {
        this.students.remove(student);
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }


}