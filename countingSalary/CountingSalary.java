import java.util.ArrayList;

public class CountingSalary {
    // This method is working for counting salaries for every person
    public void getLists(ArrayList<ArrayList<String>> personnel){

        for(ArrayList<String> a: personnel) {
            switch (a.get(2)) {
                case "FACULTY_MEMBER": {
                    String name = a.get(0).split(" ")[0];
                    String surname = a.get(0).split(" ")[1];
                    String registrationNumber = a.get(1);
                    String position = a.get(2);
                    int year = Integer.parseInt(a.get(3));
                    double total = 0;
                    for (int i = 4; i < a.size(); i++) {
                        int q1 = Integer.parseInt(a.get(i));
                        if (q1 < 48) {
                            int w1 = q1 - 40;
                            total += w1;
                        } else {
                            total += 8;
                        }
                    }
                    FacultyMembers fm = new FacultyMembers();
                    fm.SalaryCalculation(name, surname, registrationNumber, position, year, total);
                    break;
                }
                case "WORKER": {
                    String name = a.get(0).split(" ")[0];
                    String surname = a.get(0).split(" ")[1];
                    String registrationNumber = a.get(1);
                    String position = a.get(2);
                    int year = Integer.parseInt(a.get(3));
                    double total = 0;
                    for (int i = 4; i < a.size(); i++) {
                        int q1 = Integer.parseInt(a.get(i));
                        if (q1 == 40) {
                            continue;
                        } else if (q1 < 50) {
                            int w1 = q1 - 40;
                            total += w1;
                        } else {
                            total += 10;
                        }
                    }
                    Worker wk = new Worker();
                    wk.SalaryCalculation(name, surname, registrationNumber, position, year, total);
                    break;
                }
                case "SECURITY": {
                    String name = a.get(0).split(" ")[0];
                    String surname = a.get(0).split(" ")[1];
                    String registrationNumber = a.get(1);
                    String position = a.get(2);
                    int year = Integer.parseInt(a.get(3));
                    double total = 0;
                    int numberOfWeek = 0;
                    for (int i = 4; i < a.size(); i++) {
                        if(Integer.parseInt(a.get(i)) >= 30){
                            int q1 = Integer.parseInt(a.get(i));
                            total += q1;
                            numberOfWeek += 1;
                        }
                        else{
                            continue;
                        }
                    }
                    Security sc = new Security();
                    sc.SalaryCalculation(name, surname, registrationNumber, position, year, total, numberOfWeek);
                    break;
                }
                case "OFFICER": {
                    String name = a.get(0).split(" ")[0];
                    String surname = a.get(0).split(" ")[1];
                    String registrationNumber = a.get(1);
                    String position = a.get(2);
                    int year = Integer.parseInt(a.get(3));
                    double total = 0;
                    for (int i = 4; i < a.size(); i++) {
                        int q1 = Integer.parseInt(a.get(i));
                        if (q1 == 40) {
                            continue;
                        } else if (q1 < 50) {
                            int w1 = q1 - 40;
                            total += w1;
                        } else {
                            total += 10;
                        }
                    }
                    Officers ofc = new Officers();
                    ofc.SalaryCalculation(name, surname, registrationNumber, position, year, total);
                    break;
                }
                case "CHIEF": {
                    String name = a.get(0).split(" ")[0];
                    String surname = a.get(0).split(" ")[1];
                    String registrationNumber = a.get(1);
                    String position = a.get(2);
                    int year = Integer.parseInt(a.get(3));
                    double total = 0;
                    for (int i = 4; i < a.size(); i++) {
                        int q1 = Integer.parseInt(a.get(i));
                        if (q1 == 40) {
                            continue;
                        } else if (q1 < 48) {
                            int w1 = q1 - 40;
                            total += w1;
                        } else {
                            total += 8;
                        }
                    }
                    Chief chf = new Chief();
                    chf.SalaryCalculation(name, surname, registrationNumber, position, year, total);
                    break;
                }
                case "PARTTIME_EMPLOYEE": {
                    String name = a.get(0).split(" ")[0];
                    String surname = a.get(0).split(" ")[1];
                    String registrationNumber = a.get(1);
                    String position = a.get(2);
                    int year = Integer.parseInt(a.get(3));
                    double total = 0;
                    for (int i = 4; i < a.size(); i++) {
                        int q1 = Integer.parseInt(a.get(i));
                        if (q1 < 10) {
                            continue;
                        } else if (q1 < 21) {
                            total += q1;
                        } else {
                            total += 20;
                        }
                    }
                    PartTimeEmployee pte = new PartTimeEmployee();
                    pte.SalaryCalculation(name, surname, registrationNumber, position, year, total);
                    break;
                }
                case "RESEARCH_ASSISTANT": {
                    String name = a.get(0).split(" ")[0];
                    String surname = a.get(0).split(" ")[1];
                    String registrationNumber = a.get(1);
                    String position = a.get(2);
                    int year = Integer.parseInt(a.get(3));
                    ResearchAssistant ra = new ResearchAssistant();
                    ra.SalaryCalculation(name, surname, registrationNumber, position, year);
                    break;
                }
                default:
                    System.out.println("invalid transaction");
                    break;
            }
        }
    }



}
