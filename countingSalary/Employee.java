public class Employee extends Personnel {
    // This is a super class that contains full time employee and part time employee also is a subclass of Personnel
    public double SalaryCalculation(int yearOfStart) {
        return super.SalaryCalculation(yearOfStart);
    }
}
