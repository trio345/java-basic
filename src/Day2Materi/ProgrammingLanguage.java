package Day2Materi;

import java.util.List;

public class ProgrammingLanguage {
    public String name;
    public List<String> frameworks = List.of();
    private static ProgrammingLanguage language;

//    public ProgrammingLanguage

    public static ProgrammingLanguage getInstance() {
        if (language == null) language = new ProgrammingLanguage();
        return language;
    }

    public void  print(){
        System.out.println(name + " Programming language with "+
                String.join(", ",frameworks)
                );
    }

}
