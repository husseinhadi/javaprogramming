package practice_12_01_2021;

public class patientInfo {
    public static void main(String[] args) {


        String name ="Hussein";
        int age =12;
        char gender ='A';
        String dateOfBirth ="09-25-1987";
        boolean isMarried = true;
        String phoneNum ="703-987-6125";
        boolean havingInsurance =true;
        String insuranceNum ="38494024";
        String Employer ="Cydeo";
        double copayWithInsurance =20.23;
        double copayWithoutInsurance =234.43;

        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("dateOfBirth = " + dateOfBirth);
        System.out.println("isMarried = " + isMarried);
        System.out.println("phoneNum = " + phoneNum);
        System.out.println("havingInsurance = " + havingInsurance);
        System.out.println("Employer = " + Employer);
        System.out.println("copayWithInsurance = " + copayWithInsurance);
        System.out.println("copayWithoutInsurance = " + copayWithoutInsurance);

        System.out.println("=======Escape Sequences========");
        System.out.println("\tname:"+name+"\n\tage:"+age+"\n\tgender:"+gender+"\n\tDOB:"+dateOfBirth+
                "\n\tIs Married:"+isMarried+"\n\tphone Number:"+phoneNum+"\n\thaving Insurance:"+havingInsurance+
                "\n\tEmployer:"+Employer+"\n\tcopay With Insurance:"+copayWithInsurance+"\n\tcopay Without Insurance:"+copayWithoutInsurance);

        System.out.println("===================");

        if (havingInsurance){
            System.out.println("copay of patient = " + copayWithInsurance);
        }else {
            System.out.println("copayWithoutInsurance = " + copayWithoutInsurance);
        }

        /*
        Create a class named PatientInfo. declare the following variables:

                         1. name (String)
                         2. age (int)
                         3. gender (char)
                         4. date of birth (String)
                         5. isMarried (boolean)
                         6. phone number (String)
                         7. havingInsurance (boolean)
                         8. Insurance number (String)
                         9. Employer (String)
                        10. copayWithInsurance (double)
                        11. copayWithoutInsurance (double)
         */
    }
}
