public class Student {
    public String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "\n{" + name + "}\n";
    }

    public String getName() {
        return name;
    }
}
