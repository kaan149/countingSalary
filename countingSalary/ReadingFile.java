import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFile {
    // For reading input files and makes them lists
    public static ArrayList<ArrayList<String>> convertToList(String path) {
        ArrayList<ArrayList<String>> input = null;
        try {
            File myObj = new File(path);
            Scanner myReader = new Scanner(myObj);
            input = new ArrayList<>();
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] arrOfData = data.split("\t");
                ArrayList<String> template = new ArrayList<>(Arrays.asList(arrOfData));
                input.add(template);
            }
            myReader.close();
            return input;
        }
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            return null;
        }
    }

    // For matching working hours with persons(registration number) and combines in them same list
    public static ArrayList<ArrayList<String>> allToOneList(String[] args){
        ArrayList<ArrayList<String>> personnel = ReadingFile.convertToList(args[0]);
        ArrayList<ArrayList<String>> record = ReadingFile.convertToList(args[1]);
        for(int i = 0; i < personnel.size(); i++){
            if(personnel.get(i).get(1).equals(record.get(i).get(0))){
                personnel.get(i).add(record.get(i).get(1));
                personnel.get(i).add(record.get(i).get(2));
                personnel.get(i).add(record.get(i).get(3));
                personnel.get(i).add(record.get(i).get(4));

            }
        }
        return personnel;
    }
}
