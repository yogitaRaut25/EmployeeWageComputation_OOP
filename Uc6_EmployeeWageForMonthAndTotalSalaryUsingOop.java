package com.employeewageusingoop;

public class Uc6_EmployeeWageForMonthAndTotalSalaryUsingOop {
	//static & final variable
	public static final int PER_HOUR_WAGE = 20;
	public static final int DAYS_IN_MONTH = 20;
	
	public void employeeWageForMonth() {
		//local variable 
		int workingHour=0, totalSalary=0, totalWorkingHrs=0,isChecking;

		//computation for employee wage for month & total salary
		for (int day=1; day<=DAYS_IN_MONTH; day++)
		{
			System.out.print("Day : "+day);
			isChecking=(int)(Math.random()*3);


			switch(isChecking){
			case 0:
				System.out.println(" Employee is absent");
				workingHour=0;
				break;

			case 1:
				System.out.println(" Employee is present");
				workingHour=8;
				break;

			default :
				System.out.println(" Employee is working as part time");
				workingHour=4;

			}
			if(totalWorkingHrs == 100 && isChecking == 0) {
				continue;
			}
			else if(isChecking > 0 && totalWorkingHrs == 100) {
				break;
			}
			else {

				totalWorkingHrs+=workingHour;
				int salary=(PER_HOUR_WAGE * workingHour);
				totalSalary=(totalSalary + salary);
			}
		}

		System.out.println("Employee has earned totalSalary in a month = " +totalSalary);
		System.out.println("Total working hours = "+totalWorkingHrs);
	}

	public static void main(String[] args) {
		Uc6_EmployeeWageForMonthAndTotalSalaryUsingOop obj1 = new Uc6_EmployeeWageForMonthAndTotalSalaryUsingOop();
		obj1.employeeWageForMonth();
	}
}

