public class Security extends Personnel {
    public void SalaryCalculation(String name, String surname, String registrationNumber, String position, int yearOfStart, double hourOfWork, int numberOfWeek) {

        double connector = super.SalaryCalculation(yearOfStart);
        double tmANDfm = 6 * numberOfWeek * 15; // Counting travel money and food money
        double totalHourOfWork = hourOfWork * 10;
        double salary = connector + tmANDfm + totalHourOfWork;
        super.writingFile(name, surname, registrationNumber, position, yearOfStart, salary);
    }
}
