public class Academician extends Personnel{

    public double SalaryCalculation(int yearOfStart) {
        double baseSalary = 2600; // Given fact
        double connector = super.SalaryCalculation(yearOfStart);
        return (baseSalary + connector); // Total of base salary and severance pay
    }
}
