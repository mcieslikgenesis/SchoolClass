import java.util.HashMap;
import java.util.Map;

public class JournalClass {


    private Integer mark1;

    private Integer mark2;

    private Integer mark3;

    private Integer mark4;

    private Integer mark5;


    public JournalClass ( Integer mark1, Integer mark2, Integer mark3, Integer mark4, Integer mark5    ){


        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        this.mark4 = mark4;
        this.mark5 = mark5;


    }


    public String toString(){
        return "\n{" + mark1 + " " + mark2 + " " + mark3 + " " + mark4 + " " + mark5 + " }\n";
    }





}
