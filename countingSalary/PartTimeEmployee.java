public class PartTimeEmployee extends Employee{

    public void SalaryCalculation(String name, String surname, String registrationNumber, String position, int yearOfStart, double hourOfWork){
        double severancePay = super.SalaryCalculation(yearOfStart);
        double totalHourOfWork = hourOfWork * 18; //Part-time Employees can work a minimum of 10 hours and a maximum of 20 hours a week and they are paid 18 TL per hour
        double salary = severancePay + totalHourOfWork;
        super.writingFile(name, surname, registrationNumber, position, yearOfStart, salary);
    }
}
