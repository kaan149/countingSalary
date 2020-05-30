public class Chief extends FullTimeEmployee{

    public void SalaryCalculation(String name, String surname, String registrationNumber, String position, int yearOfStart, double overWorkDay){
        double severancePay = super.SalaryCalculation(yearOfStart);
        double dayOfWork = 125.0 * 20; //Chiefs are paid 125TL per day but only weekdays
        double overWorkSalary = overWorkDay * 15; //Chiefs can work a maximum of 8 hours a week and are paid 15 TL per hour to gain overwork salary
        double salary = severancePay + dayOfWork + overWorkSalary;
        super.writingFile(name, surname, registrationNumber, position, yearOfStart, salary);
    }
}
