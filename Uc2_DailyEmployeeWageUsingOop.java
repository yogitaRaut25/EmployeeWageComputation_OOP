package com.employeewageusingoop;

public class Uc2_DailyEmployeeWageUsingOop {
	//static & final variables
	public static final int IS_PRESENT = 1;
	public static final int WAGE_PER_HOUR = 20;

	public void dailyWageOfEmployee() {
		//local variable
		int workHrs;
		int empCheck = (int)(Math.random()*10)%2;

		//computation to check daily wage of employee
		if(empCheck == IS_PRESENT) {
			workHrs = 8;
			System.out.println("Employee is present & working hours = "+workHrs);
		}
		else {
			workHrs = 0;
			System.out.println("Employee is absent & working hours = "+workHrs);
		}
		System.out.println("Employee daily wage = "+(workHrs*WAGE_PER_HOUR));
	}

	public static void main(String[] args) {
		Uc2_DailyEmployeeWageUsingOop obj1 = new Uc2_DailyEmployeeWageUsingOop();
		obj1.dailyWageOfEmployee();
	}
}
