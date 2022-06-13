package com.chainsys.springproject.beans;
//multiple factory methods in one class
//calender factory
public class CalenderFactory {
	//factory-method is not static here
		public Calender createCalender()
		{
			//The calender constructor is default access modifier so, can be called here
			//The calender class and the calender factory class are both in the same package
			return new Calender();
		}
		public Appointments createAppointments()
		{
			return new Appointments();
		}
}
