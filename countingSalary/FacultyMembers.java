public class FacultyMembers extends Academician{

    public void SalaryCalculation(String name, String surname, String registrationNumber, String position, int yearOfStart, double addCourseFee){
        double ssBenefits = 2600.0 * 135 / 100; // Faculty members are paid ssBenefits that is 135% of base salary
        double totalACF = addCourseFee * 20; // Faculty members are paid 20 TL per day for add course fee
        double almost = super.SalaryCalculation(yearOfStart);
        double salary = ssBenefits + almost + totalACF;
        super.writingFile(name, surname, registrationNumber, position, yearOfStart, salary);

    }


}
