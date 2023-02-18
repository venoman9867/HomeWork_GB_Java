import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;

public class JsonStringBuilder {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File(JsonStringBuilder.class.getClassLoader().getResource("Students.json").getFile());
        System.out.println(jsonParser(file));
    }

    public static String jsonParser(File file) throws FileNotFoundException {
        Gson gson = new Gson();
        StringBuilder stringBuilder = new StringBuilder();
        JsonReader reader = new JsonReader(new FileReader(file));
        Student[] students = gson.fromJson(reader, Student[].class);
        Arrays.stream(students).forEach(student -> stringBuilder.append("Студент "+student.getФамилия()+
                " получил "+student.getОценка()+" по предмету "+ student.getПредмет()+"\n"));
        return stringBuilder.toString();
    }
    //Студент [фамилия] получил [оценка] по предмету [предмет]
}
