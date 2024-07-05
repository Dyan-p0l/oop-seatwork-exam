package studentRecord;

public class student extends course{
    private String  idnum, fname, lname, email,  suffix, phnum;
    private int age, yrlvl;
    
    
    student (String idnum, 
             String fname, 
             String lname, 
             String suffix, 
             String phnum, 
             int age, 
             int yrlvl, 
             String email) {
        
        this.idnum = idnum;
        this.fname = fname;
        this.lname = lname;
        this.suffix = suffix;
        this.phnum = phnum;
        this.age = age;
        this.yrlvl = yrlvl;
        this.email = email;
    }
    
    //GETTERS
    String getidnum () {
        return idnum;
    }
    String getfname () {
        return fname;
    }
    String getlname () {
        return lname;
    }
    String getsuffix () {
        return suffix;
    }
    String getphnum () {
        return phnum;
    }
    int getAge () {
        return age;
    }
    int getyrlvl () {
        return yrlvl;
    }
    String getemail () {
        return email;
    }
    
    
    //SETTERS
    void setfname (String fname) {
        this.fname = fname;
    }
    void setlname (String lname) {
        this.lname = lname;
    }
    void setsuffix (String suffix) {
        this.suffix = suffix;
    }
    void setphnum (String phnum) {
        this.phnum = phnum;
    }
    void setemail (String email) {
        this.email = email;
    }
    void setidnum (String idnum) {
        this.idnum = idnum;
    }
    void setAge (int age) {
        this.age = age;
    }
    void setyrlvl (int yrlvl) {
        this.yrlvl = yrlvl;
    }
    
    
    void displayDetails() {
        System.out.println("");
        System.out.println("Student's Profile Details");
        System.out.println("-----------------------------");
        System.out.println("ID number: " + getidnum());
        System.out.println("First name: " + getfname());
        System.out.println("Last name: " + getlname());
        System.out.println("Phone number: " + getphnum());
        System.out.println("Email: " + getemail());
        System.out.println("Age: " + getAge());
        System.out.println("Suffix: " + getsuffix());
        System.out.println("Year Level: " + getyrlvl());
                
    }
    
}
