package studentRecord;

import java.util.Scanner;

public class mainclass {
    
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        
        String  idnum = "", fname = "", lname = "", email = "", suffix = "", phnum = "";
        int age = 0, yrlvl = 0;
        
        String coursename = "", coursecode = "", department="";
        
        student s = new student(idnum, fname, lname, suffix, phnum, age, yrlvl, email);
        course c = new course(coursename, coursecode, department);
        
        System.out.println("Student Record Management App");
        System.out.println("-----------------------------");
        System.out.println("1. Create Student Record");
        int choice = scan.nextInt();
        if (choice == 1) {
            System.out.println("Please Enter Student Details");
            System.out.println("-----------------------------");
            System.out.print("Enter ID number: ");
            idnum = scan.next();
            System.out.print("Enter first name: ");
            fname = scan.next();
            System.out.print("Enter last name: ");
            lname = scan.next();
            System.out.print("Enter suffix(type NA if none): ");
            suffix = scan.next();
            System.out.print("Enter phone number: ");
            phnum = scan.next();
            System.out.print("Enter age: ");
            age = scan.nextInt();
            System.out.print("Enter year level: ");
            yrlvl = scan.nextInt();
            System.out.print("Enter email address: ");
            email = scan.next();
            System.out.println("Choose course");
            System.out.println("1.Bachelor of Science in Information Technology\n2.Bachelor of Science in Computer Science\n3.Bachelor of Science in Computer Engineering");
            int coursech = scan.nextInt();
            
            switch(coursech){
                case 1:
                    coursename = "Bachelor of Science in Information Technology";
                    coursecode = "BSIT";
                    department  = "College of Computer Studies";
                    break;
                case 2:
                    coursename = "Bachelor of Science in Computer Science";
                    coursecode = "BSCS";
                    department  = "College of Computer Studies";
                    break;
                case 3:
                    coursename = "Bachelor of Science in Computer Engineering";
                    coursecode = "BSCpE";
                    department  = "College of Engineering";
                    break;    
            }
        }
        c.setcoursename(coursename);
        c.setcoursecode(coursecode);
        c.setdepartment(department);
        
        s.setidnum(idnum);
        s.setfname(fname);
        s.setlname(lname);
        s.setsuffix(suffix);
        s.setphnum(phnum);
        s.setAge(age);
        s.setyrlvl(yrlvl);
        s.setemail(email);
        
        s.displayDetails();
        c.displaycourse();
        
        System.out.print("UPDATE STUDENT RECORD? (Y = 'yes' / N = 'no'): ");
        System.out.println("\n");
        System.out.println("----------------------------------------------");
        String userchoice = scan.next();
        
        if (userchoice.equalsIgnoreCase("Y")) {
            
            int updatechoice;
            do{
                System.out.println("Choose Details to be updated");
                System.out.println("-----------------------------");
                System.out.println("1.Update ID number");
                System.out.println("2.Update first name");
                System.out.println("3.Update last name");
                System.out.println("4.Update suffix");
                System.out.println("5.Update phone number");
                System.out.println("6.Update age");
                System.out.println("7.Update year level");
                System.out.println("8.Update email address");
                System.out.println("9.Update course");
                System.out.println("0.Exit Update menu");
                updatechoice = scan.nextInt();
                
                switch(updatechoice){ 
                    case 1:
                        System.out.print("Enter ID number: ");
                        idnum = scan.next();
                        s.setidnum(idnum);
                        break;
                    case 2:  
                        System.out.print("Enter first name: ");
                        fname = scan.next();
                        s.setfname(fname);
                        break;
                    case 3: 
                        System.out.print("Enter last name: ");
                        lname = scan.next();
                        s.setlname(lname);
                        break;
                    case 4: 
                        System.out.print("4.Enter suffix: ");
                        suffix = scan.next();
                        s.setsuffix(suffix);
                        break;
                    case 5:
                        System.out.print("5.Enter phone number: ");
                        phnum = scan.next();
                        s.setphnum(phnum);
                        break;
                    case 6: 
                        System.out.print("6.Enter age: ");
                        age = scan.nextInt();
                        s.setAge(age);
                        break;
                    case 7:
                        System.out.print("7.Enter year level: ");
                        yrlvl = scan.nextInt();
                        s.setyrlvl(yrlvl);
                        break;
                    case 8:
                        System.out.print("Enter email address: ");
                        email = scan.next();
                        s.setemail(email);
                        break;
                    case 9:
                        System.out.println("1.Bachelor of Science in Information Technology\n2.Bachelor of Science in Computer Science\n3.Bachelor of Science in Computer Engineering");
                        int newcourse = scan.nextInt();
                        switch(newcourse){
                            case 1:
                                coursename = "Bachelor of Science in Information Technology";
                                coursecode = "BSIT";
                                department  = "College of Computer Studies";
                                break;
                            case 2:
                                coursename = "Bachelor of Science in Computer Science";
                                coursecode = "BSCS";
                                department  = "College of Computer Studies";
                                break;
                            case 3:
                                coursename = "Bachelor of Science in Computer Engineering";
                                coursecode = "BSCpE";
                                department  = "College of Engineering";
                                break;    
                        }
                        c.setcoursename(coursename);
                        c.setcoursecode(coursecode);
                        c.setdepartment(department);
                        break;
                    case 0:
                        s.displayDetails();
                        c.displaycourse();
                        break;
                    default: System.out.println("Invalid choice");
                }
            }while(updatechoice != 0);
        }
        else if (userchoice.equalsIgnoreCase("N")) {
            System.out.println("No updates to be made");
        }
    }
}
