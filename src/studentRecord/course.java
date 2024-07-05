package studentRecord;

public class course {
    
    private String coursename, coursecode, department;
    
    
    course () {
        
    }
    course (String coursename, String coursecode, String department) {
        this.coursename = coursename;
        this.coursecode = coursecode;
        this.department = department;
    }
    
    //GETTERS
    String getcoursename() {
        return coursename;
    }
    String getcoursecode() {
        return coursecode;
    }
    String getdepartment() {
        return department;
    }
    
    
    //SETTERS
    void setcoursename(String coursename) {
        this.coursename = coursename;
    }
    void setcoursecode(String coursecode){
        this.coursecode = coursecode;
    }
    void setdepartment(String department) {
        this.department = department;
    }
    
    
    
    
    
    void displaycourse(){
        System.out.println("Course name: " + getcoursename());
        System.out.println("Course code: " + getcoursecode());
        System.out.println("Department: " + getdepartment());
        System.out.println("\n");
    }
   
}
