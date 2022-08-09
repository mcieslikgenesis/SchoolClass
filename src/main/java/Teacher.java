public class Teacher {

    private String name;
    private String surname;

    public Teacher( String name, String surname){


        this.name = name;
        this.surname = surname;

    }
    public String toString(){
        return "\n{" + name + " " + surname + "}\n";
    }
}
