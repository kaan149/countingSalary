import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

// This is a super class which contains Academician, Officer, Security and Employee.
public class Personnel {

    private static final DecimalFormat df = new DecimalFormat("##.00"); // For creating salary output with double zero.
    private static final DecimalFormatSymbols dfs = df.getDecimalFormatSymbols(); // For creating salary output with using dot.

    // This method count severance pay for every position
    public double SalaryCalculation(int yearOfStart){
        return (2020 - yearOfStart) * 20 * 0.8;
    }

    // This method write output files for every person.
    public void writingFile(String name, String surname, String registrationNumber, String position, int yearOfStart, double salary){
        dfs.setDecimalSeparator('.');
        df.setDecimalFormatSymbols(dfs);
        try {
            FileWriter myWriter = new FileWriter(registrationNumber + ".txt");
            myWriter.write("Name : " + name + "\n");
            myWriter.write("Surname : " + surname + "\n");
            myWriter.write("Registration Number : " + registrationNumber + "\n");
            myWriter.write("Position : " + position + "\n");
            myWriter.write("Year of Start : " + yearOfStart + "\n");
            myWriter.write("Salary : " + df.format(salary) + " TL");
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
