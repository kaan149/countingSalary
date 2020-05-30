public class FullTimeEmployee extends Employee{
    // Full time employee is a super class which contains worker and chief also is a sub class of Employee
    public double SalaryCalculation(int yearOfStart){
        return super.SalaryCalculation(yearOfStart);
    }
}
