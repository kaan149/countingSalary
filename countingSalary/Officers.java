public class Officers extends Personnel{

    public void SalaryCalculation(String name, String surname, String registrationNumber, String position, int yearOfStart, double overworkSalary){
        double baseSalary = 2600.0;
        double ssBenefits = baseSalary * 65 / 100; // Officers are paid special service benefits that is 65% of base salary
        double totalOverworkSalary = overworkSalary * 20; // Officers are paid 20TL per overwork day
        double almost = super.SalaryCalculation(yearOfStart);
        double salary = baseSalary + ssBenefits + almost + totalOverworkSalary;
        super.writingFile(name, surname, registrationNumber, position, yearOfStart, salary);

    }
}
