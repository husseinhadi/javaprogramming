package day09_IfStatements;

public class LeapYear {
    public static void main(String[] args) {

      int year = 200;
      boolean leapYear = year % 4 ==0;

      if (leapYear){
          System.out.println("year "+year+ " is a");
      }



    }
}


/*
Topics: If & Else Statement
		Multi-Branch If

Package name: day09_If Statements


Warmup tasks:
	1. Create a class called MinNumber, Write a program that can print the minimum number between two numbers, if both are equal then print Equal

			Ex:
				n1= 100, n2 = 200;

			output:
				100 is the minimum number


			n1 & n2

			possibility #1: n1 is Min
			possibility #2: n2 is Min
			possibility #3: equal


	2. Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers

			Ex:
				a = 10, b= 15, c = 20;

			Output:
				15 is the median number


			Posibility #1: a could be median number
			Posibility #2: b could be median number
			Posibility #3: c could be median number




Single if: for one condition


if & else: when there are only two option/possibilities ( not more not less than 2 condition)


		if(Condition){
			StatementA
		}else{ // otherwise
			StatementB
		}

		StatementA: if condition MUST be true
		StatementB: if condition MUST be false


		Yes or No
		Leap year
		Female or Male
		Pass or Fail
		Married or not Married
		employeed or not employeed
		Odd or Even
		Enligible or not eligible


Multi-branch if: when there are three or more option/possibilities

		if(Condition1){
			StatementA
		}else if(Condition2){
			StatementB
		}else{
			StatementC
		}

		ONLY one block gets executed

		StatementA: Condition1 MUST be true
		StatementB: Condition1 MUST be false, Condition2 MUST be true
		StatementC: Condition1 & Condition2 MUST be false


task:
		1. Maximum number between two different numbers
		2. Minimum number between two different numbers
		3. Write a progrm that can check if the person is eligible to buy alcohol
		4. Write a progrm that can check if the person is eligible to vote

 */