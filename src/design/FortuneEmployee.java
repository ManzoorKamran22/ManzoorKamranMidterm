package design;
import databases.ConnectToSqlDB;

import java.sql.Connection;

import java.io.IOException;
import java.sql.SQLException;

public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/


	public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {

		CompanyDesc comDesc = new EmployeeInfo();

		System.out.println("Company Name: " + comDesc.companyName("InfoTech") + "\n" +
							comDesc.companyMission("Our mission is to change people's living standard" +
									                            " by helping them to enter into the IT industry"));
		comDesc.benefitLayout();

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		EmployeeInfo emp1 = new EmployeeInfo("John", 101, "Male", 1800, "Developer");
		EmployeeInfo emp2 = new EmployeeInfo("Jenny", 102, "Female", 1200, "Manual Tester");
		EmployeeInfo emp3 = new EmployeeInfo("Jack", 103, "Male", 2800, "Tech Lead");
		EmployeeInfo emp4 = new EmployeeInfo("Jackson", 104, "Male", 1700, "BA");
		EmployeeInfo emp5 = new EmployeeInfo("Jonny", 105, "Male", 3000, "DBA");
		EmployeeInfo emp6 = new EmployeeInfo("Jennifer", 106, "Female", 2500, "Automation Engineer");

		//Calculate Employees bonus based on years of working with the company
		System.out.println("Yearly Bonus: " + EmployeeInfo.calculateEmployeeBonus(8, 1500));

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		//Calculate Employees pension based on years of working with the company
		EmployeeInfo.calculateEmployeePension();

		//Database Insertion
		//ConnectToSqlDB connection = new ConnectToSqlDB();
		//connection.insertDataFromStringToSqlTable("employees","column1","column2");

	}
}
