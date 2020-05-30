public class ResearchAssistant extends Academician{

    public void SalaryCalculation(String name, String surname, String registrationNumber, String position, int yearOfStart){
        double ssBenefits = 2600.0 * 105 / 100; // Research assistants are paid ssBenefits that is 105% of base salary
        double almost = super.SalaryCalculation(yearOfStart);
        double salary = ssBenefits + almost;
        super.writingFile(name, surname, registrationNumber, position, yearOfStart, salary);

    }

}
