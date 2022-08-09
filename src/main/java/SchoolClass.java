import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class SchoolClass {


    private List<Students> students = new ArrayList<Students>();
    private Teacher teacher;
    private SchoolClass schoolClass;
    private JournalClass journalClass;
    HashMap<Students,JournalClass> classJournal = new HashMap<Students,JournalClass>();



    public void setStudents (Students newStudent){
        this.students.add(newStudent);

    }

    public void removeStudents (int removeStudent){
        this.students.remove(removeStudent);
    }

    public void setTeacher (Teacher newTeacher){
        this.teacher = (newTeacher);

    }

    public List<Students> getStudents() {
        return students;
    }


   public void putMarkToStudent(Students typeStudent, JournalClass typeMark){

       this.classJournal.put(typeStudent, typeMark);
   }

   public void removeMarkFromStudent( Students typeStudent){
       this.classJournal.remove(typeStudent);
   }

    public JournalClass getStudentMarks(Students typeStudent) {

        return classJournal.get(typeStudent);


    }

    public JournalClass getAvgForEachStudent(Students typeStudent){
        return classJournal.get(typeStudent);



    }



}







