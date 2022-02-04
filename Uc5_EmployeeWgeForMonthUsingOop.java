package com.employeewageusingoop;

public class Uc5_EmployeeWgeForMonthUsingOop {
	//static variable
	public static final int PER_HOUR_WAGE = 20;
	public static final int DAYS_IN_MONTH = 20;

	public void employeeWageForMonth() {
		//local variable
		int salary = 0;
		int workingHour = 0;
		int totalSalary = 0;
		int checkEmp;

		//computation for daily wage 
		for (int day = 1 ; day <= DAYS_IN_MONTH ; day ++)
		{
			checkEmp = (int)(Math.random()*3);
			System.out.print("Day : "+day);
			switch(checkEmp){
			case 0:
				System.out.println(" Employee is absent");
				workingHour = 0;
				break;

			case 1:
				System.out.println(" Employee is present");
				workingHour = 8;
				break;

			default :
				System.out.println(" Employee is working as part time");
				workingHour = 4;

			}

			salary = ( PER_HOUR_WAGE * workingHour );
			totalSalary = (totalSalary + salary);
		}

		System.out.println("Employee has earned totalSalary in a month = " +totalSalary);
	}

	public static void main(String[] args) {
		Uc5_EmployeeWgeForMonthUsingOop obj1 = new Uc5_EmployeeWgeForMonthUsingOop();
		obj1.employeeWageForMonth();
	}
}

