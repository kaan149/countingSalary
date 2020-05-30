public class Worker extends FullTimeEmployee {

    public void SalaryCalculation(String name, String surname, String registrationNumber, String position, int yearOfStart, double overWorkDay){
        double severancePay = super.SalaryCalculation(yearOfStart);
        double dayOfWork = 105.0 * 20; //Workers are paid 105TL per day but only weekdays
        double overWorkSalary = overWorkDay * 11; //Workers can work a maximum of 10 hours a week and are paid 11 TL per hour
        double salary = severancePay + dayOfWork + overWorkSalary;
        super.writingFile(name, surname, registrationNumber, position, yearOfStart, salary);
    }
}
