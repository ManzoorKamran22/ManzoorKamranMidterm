package design;

import java.util.Scanner;

public class EmployeeInfo extends CompanyDesc {

    /*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
     * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
     * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
     * go to FortuneEmployee class to apply all the fields and attributes.
     *
     * Important: YOU MUST USE the
     * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
     * Use all kind of keywords(super,this,static,final........)
     * Implement Nested class.
     * Use Exception Handling.
     *
     */


    /*
     * declare few static and final fields and some non-static fields
     */
    static String companyName;
    private int employeeId;
    private String employeeName;
    private String gender;
    private static double weeklySalary;
    private static int numberOfYearsWithCompany;
    private String departmentName;
    private String dateOfJoin;
    private String jobTitle;
    private int benefit;
    private String performance;
    //double monthlySalary;


    /*
     * You must implement the logic for below 2 methods and
     * following 2 methods are prototype as well for other methods need to be design,
     * as you will come up with the new ideas.
     */

    /*
     * you must have multiple constructor.
     * Must implement below constructor.
     */
    public EmployeeInfo() {
    }

    ;

    public EmployeeInfo(int numberOfYearsWithCompany) {

        this.numberOfYearsWithCompany = numberOfYearsWithCompany;
    }

    public EmployeeInfo(String name, int employeeId) {
        this.employeeName = name;
        this.employeeId = employeeId;
    }

    public EmployeeInfo(String name, int employeeId, String gender, double salary, String jobTitle) {
        this.employeeName = name;
        this.employeeId = employeeId;
        this.gender = gender;
        this.weeklySalary = salary;
        this.jobTitle = jobTitle;

        System.out.println("Name: " + this.employeeName + "\n" +
                "ID: " + this.employeeId + "\n" +
                "Sex: " + this.gender + "\n" +
                "Weekly Salary: " + this.weeklySalary + "\n" +
                "Job Title: " + this.jobTitle + "\n");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }


    /*
     * This methods should calculate Employee bonus based on salary and performance.
     * Then it will return the total yearly bonus. So you need to implement the logic.
     * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on.
     * You can set arbitrary number for performance.
     * So you probably need to send 2 arguments.
     *
     */
    public static double calculateEmployeeBonus(int numberOfYearsWithCompany, double weeklySalary) {
        double total = 0;
        if (numberOfYearsWithCompany > 10) {
            total = ((weeklySalary * 52) * 0.10);
            System.out.println("You have earned 10% bonus");
        } else if (numberOfYearsWithCompany > 5 && numberOfYearsWithCompany <= 10) {
            total = ((weeklySalary * 52) * 0.05);
            System.out.println("You have earned 5% bonus");
        } else if (numberOfYearsWithCompany > 2 && numberOfYearsWithCompany <= 5) {
            total = ((weeklySalary * 52) * 0.02);
            System.out.println("You have earned 2% bonus");
        } else {
            total = (weeklySalary * 52);
            System.out.println("No bonus: You are fairly new to the company. You need to work atleast 3 years to earn any bonus.");
        }

        //System.out.println("Bonus: " + total);

        return total;
    }

    /*
     * This methods should calculate Employee Pension based on salary and numbers of years with the company.
     * Then it will return the total pension. So you need to implement the logic.
     * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
     *
     */
    public static int calculateEmployeePension() {
        int total = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter start date in format (example: May,2015): ");
        String joiningDate = sc.nextLine();
        System.out.println("Please enter today's date in format (example: August,2017): ");
        String todaysDate = sc.nextLine();
        String convertedJoiningDate = DateConversion.convertDate(joiningDate);
        String convertedTodaysDate = DateConversion.convertDate(todaysDate);

        //implement numbers of year from above two dates
        String startYear = convertedJoiningDate.substring(convertedJoiningDate.length() - 4,
                convertedJoiningDate.length());
        String currentYear = convertedTodaysDate.substring(convertedTodaysDate.length() - 4,
                convertedTodaysDate.length());

        int start = Integer.parseInt(startYear);
        int current = Integer.parseInt(currentYear);

        numberOfYearsWithCompany = (current - start);

        //Calculate pension

        total = (int) (((weeklySalary * 52) * 0.02) * numberOfYearsWithCompany * 12);

        System.out.println("Your total yearly pension will be: $" + total);

        return total;

    }


    public static String getCompanyName() {
        return EmployeeInfo.companyName;
    }

    public static void setCompanyName(String companyName) {
        EmployeeInfo.companyName = companyName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return weeklySalary;
    }

    public void setSalary(double salary) {
        this.weeklySalary = salary;
    }

    public static int getNumberOfYearsWithCompany() {
        return numberOfYearsWithCompany;
    }

    public static void setNumberOfYearsWithCompany(int numberOfYearsWithCompany) {
        EmployeeInfo.numberOfYearsWithCompany = numberOfYearsWithCompany;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDateOfJoin() {
        return dateOfJoin;
    }

    public void setDateOfJoin(String dateOfJoin) {
        this.dateOfJoin = dateOfJoin;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getBenefit() {
        return benefit;
    }

    public void setBenefit(int benefit) {
        this.benefit = benefit;
    }

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }


    @Override
    public String companyName(String compName) {
        return compName;
    }

    @Override
    public String companyMission(String compMission) {
        return compMission;
    }

    @Override
    public int employeeId() {
        return employeeId;
    }

    @Override
    public String employeeName() {
        return employeeName;
    }

    @Override
    public String employeeGender() {
        return gender;
    }

    @Override
    public String employeeJobTitle() {
        return jobTitle;
    }

    @Override
    public void assignDepartment() {

    }

    @Override
    public int calculateSalary() {
        return ((int) weeklySalary * 52);
    }

    @Override
    public void benefitLayout() {
        System.out.println("We provide Health Insurance, 401k, Life Insurance, and Paid 14 sick days yearly");

    }

    private static class DateConversion {

        public DateConversion(Months months) {
        }

        public static String convertDate(String date) {
            String[] extractMonth = date.split(",");
            String givenMonth = extractMonth[0];
            int monthDate = whichMonth(givenMonth);
            String actualDate = monthDate + "/" + extractMonth[1];
            return actualDate;
        }

        public static int whichMonth(String givenMonth) {
            Months months = Months.valueOf(givenMonth);
            int date = 0;
            switch (months) {
                case January:
                    date = 1;
                    break;
                case February:
                    date = 2;
                    break;
                case March:
                    date = 3;
                    break;
                case April:
                    date = 4;
                    break;
                case May:
                    date = 5;
                    break;
                case June:
                    date = 6;
                    break;
                case July:
                    date = 1;
                    break;
                case August:
                    date = 1;
                    break;
                case September:
                    date = 1;
                    break;
                case October:
                    date = 1;
                    break;
                case November:
                    date = 1;
                    break;
                case December:
                    date = 1;
                    break;
                default:
                    date = 0;
                    break;
            }
            return date;

        }
    }
}
