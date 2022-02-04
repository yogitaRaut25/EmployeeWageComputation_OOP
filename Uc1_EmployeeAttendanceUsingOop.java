package com.employeewageusingoop;

public class Uc1_EmployeeAttendanceUsingOop {
	//static variable
	public static final int IS_PRESENT = 1;
	
	public void presentyCheck() {
		//local variables
		int workHrs;
		int empCheck = (int)(Math.random()*10)%2;

		//computation to check presenty
		if(empCheck == IS_PRESENT) {
			workHrs = 8;
			System.out.println("Employee is present & working hours = "+workHrs);
		}
		else {
			workHrs = 0;
			System.out.println("Employee is absent & working hours = "+workHrs);
		}
	}


	public static void main(String[] args) {
		Uc1_EmployeeAttendanceUsingOop obj1 = new Uc1_EmployeeAttendanceUsingOop();
		obj1.presentyCheck();
	}

}
