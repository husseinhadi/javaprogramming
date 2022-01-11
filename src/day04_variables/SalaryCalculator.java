package day04_variables;

public class SalaryCalculator {

    public static void main(String[] args) {
        //hourlyRate, weeklyHours

        int hourlyRate = 65;
        int weeklyHours = 45;
        int number0fweeks = 52;

        int salary = hourlyRate * weeklyHours *52;

       // System.out.println(salary);
        System.out.println("hourlyRate = $" + hourlyRate);
        System.out.println("weeklyHours = " + weeklyHours);
        System.out.println("number0fweeks = " + number0fweeks);
        System.out.println("-----------------------");
        System.out.println("salary = $" + salary);
    }


}
