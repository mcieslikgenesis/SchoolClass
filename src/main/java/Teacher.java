public class Teacher {

    public String name;



    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return "\n{"+ name +"}\n";
    }

    public Teacher (String name) {
        this.name = name;
    }

}
