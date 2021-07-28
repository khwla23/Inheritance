package inheritance11.pkg2;

import java.util.Scanner;

/**
 *
 * @author khwla akbar
 */

class person{
    private String name;
    private String address;
    private int phone_number;
    private String email_address;
    
    public person(){
        this("unknown","unknown",0,"unknown");
    }
    public person(String name, String address, int phone_number, String email_address){
        this.name = name;
        this.address = address;
        this.email_address = email_address;
        this.phone_number = phone_number;
    }
    public String getName() {
	return name;
    }
    public void setName(String name) {
	this.name = name;
    }
    public String getAddress() {
	return address;
    }
    public void setAddress(String address) {
	this.address = address;
    }
    public int getPhone() {
	return phone_number;
    }
    public void setPhone(int phone_number) {
	this.phone_number = phone_number;
    }
    public String getEmail() {
	return email_address;
    }
    public void setEmail(String email) {
	this.email_address = email_address;
    }
    public String toString(){
        return "Name = "+name+"\t\tClass ="+ getClass().getName();
    }
}

class student extends person{
    public final String Freshman = "Freshman";
    public final String Sophmore = "Sophmore";
    public final String Junior = "Junior";
    public final String Senior = "Senior";
    private String status;
    
    public student(String name, String address, int phone_number,
            String email_address, String status){
        super(name, address, phone_number, email_address);
        this.status = status;
    }
    
    public void setStatus(String status){
        this.status = status;
    }
    public String getStatus(){
        switch (status){
            case "Freshman": return "Freshman"; 
            case "Sophmore": return "Sophmore";
            case "Juior": return "Junior";
            case "Senior": return "Senior";
            default : return "unknown";
        }
    }
    public String toString(){
        return super.toString();
    }
}

class employee extends person{
    private int office;
    private double salary;
   private String date_hired;
   public employee(){
       this("unknown","unknown",0,"unknown",0,0.0,"unknown");
    }
    public employee(String name, String address, int phone_number, String email_address, 
            int office, double salary, String date){
        super(name, address, phone_number, email_address);
        this.office = office;
        this.salary = salary;
        this.date_hired = date_hired;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public int getOffice() {
        return office;
    }
    public void setOffice(int office) {
        this.office = office;
    }
    public String toString(){
        return super.toString();
    }
}
/**class MyDate{
    private int day;
    private int year;
    private int date;
    MyDate(int date, int day, int year){
        this.date = date;
        this.day = day;
        this.year = year;
    }
    public String toString(){
        return date+","+day+","+year;
    }
}
**/
class faculty extends employee{
    private String officeHours;
    private String rank;
    public faculty(){
        
    }
    public faculty(String name, String address, int phone_number, String email_address,
            int office, double salary, String date ,String officeHours, String rank){
        super(name, address, phone_number, email_address, office, salary, date);
        this.officeHours = officeHours;
        this.rank = rank;
    }
    
    public String getOfficeHours() {
	return officeHours;
    }
    
    public void setOfficeHours(String officeHours) {
	this.officeHours = officeHours;
    }
    
    public String getRank() {
	return rank;
    }
    
    public void setRank(String rank) {
	this.rank = rank;
    }
    
    public String toString(){
        return super.toString();
    }
}

class staff extends employee{
    private String title;
    public staff(String name, String address, int phone_number, String email_address,
            int office, double salary, String date ,String title){
        
        super(name, address, phone_number, email_address, office, salary, date);
        this.title = title;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String toString(){
        return super.toString();
    }
}


public class Inheritance112 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many persons do you want to add? ");
        int size = input.nextInt();
        
        person[] array = new person[size];
        int n = 0;
        char another_person;
        
        do{
            if (n <= size){
                System.out.println("1) Person is Student\n2) Person is Employee.\nEnter your choice.");
                int choice = input.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Enter the name of student");
                        String name = input.next();
                        System.out.println("Enter the address of the student.");
                        String address = input.next();
                        System.out.println("Enter the Email Address of the student.");
                        String email = input.next();
                        System.out.println("Enter the phone number of the student.");
                        int phone = input.nextInt();
                        System.out.println("Enter the Student's Status.\nFreshman, Junior, Sophmore, Senior ");
                        String status = input.next();
                        
                        array[n] = new student(name, address, phone, email, status);
                        n++;
                        break;
                    case 2:
                        System.out.println("Enter the name of Employee: ");
                        name = input.next();
                        System.out.println("Enter the address of Employee: ");
                        address = input.next();
                        System.out.println("Enter the Email Address of the Employee: ");
                        email = input.next();
                        System.out.println("Enter the phone number of the Employee: ");
                        phone = input.nextInt();
                        System.out.println("Enter the office number of the Employee: ");
                        int office = input.nextInt();
                        System.out.println("Enter the salary of the Employee: ");
                        double salary = input.nextDouble();
                        System.out.println("Enter the hired date of the Employee: ");
                        String date = input.next();
                        System.out.println("1) Employee is Staff\n2) Employee is faculty.\nEnter your choice.");
                        int ch = input.nextInt();
                        switch (ch) {
                            case 1:
                                System.out.println("Enter the title of the staff: ");
                                String title = input.next();
                                array[n] = new staff(name, address, phone, email, office, salary, date, title);
                                break;
                            case 2:
                                System.out.println("Enter the office hours of the faculty: ");
                                String office_hours = input.next();
                                System.out.println("Enter the rank of the faculty: ");
                                String rank = input.next();
                                array[n] = new faculty(name, address, phone, email, office, salary, date, office_hours, rank);
                                break;
                            default:
                                System.out.println("Wrong choice");
                                break;
                        }
                        n++;
                        break;
                    default:
                        System.out.println("Wrong choice");
                        break;
                }
              
            }
            else{
                System.out.println("Array size has been reached. you can not add more person.");
                break;}
            System.out.println("\nDo you want to enter another Person? enter your choice by pressing Y for yes and N for no.");
            another_person = input.next().charAt(0);
            
        }while (another_person == 'y' || another_person == 'Y');
        
        int x;
        for (x = 0 ; x < size ; x++){
            System.out.print(x+1+" ");
            System.out.println(array[x].toString());
            
        }
    }
    
}
