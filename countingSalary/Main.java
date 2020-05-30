import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<ArrayList<String>> data = ReadingFile.allToOneList(args);
        CountingSalary cs = new CountingSalary();
        cs.getLists(data);
    }
}
