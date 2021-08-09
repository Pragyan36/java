
/**
 * Write a description of class v here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
 public class FullTimeStaffHire extends StaffHire
{
    //declearing instance variable
    //using private as an access modifier
    private String staffName;
    private String qualification;
    private String appointedBy;
    private float workingHour;
    private float salary;
    private String joiningDate;
    private boolean joined;
    //creating constructor for initializing variables
    public FullTimeStaffHire(int vacancyNumber,String designation,String jobType, float salary, float workingHour){
        //using super keyword to access instance variables and methods from parent class
        super(vacancyNumber, designation, jobType);
        this.staffName = "";
        this.qualification = "";
        this.appointedBy = "";
        this.workingHour = workingHour;
        this.salary = salary;
        this.joiningDate = "";
        this.joined = false;
    }
    //creating different accessor methods which return values of instance variables
    public String getstaffName(){
        return this.staffName;
    }
    public String getqualification(){
        return this.qualification;
    }
    public String getappointedBy(){
        return this.appointedBy;
    }
    public float getworkingHour(){
        return this.workingHour;
    }
    public float getsalary(){
        return this.salary;
    }
    public String getjoiningDate(){
        return this.joiningDate;
    }
    public boolean getjoined(){
        return this.joined;
    }
   
    //creating method to change salary if the staff has not been hired yet.
    public void setsalary(float salary){
        if(this.joined){
            System.out.println("Hi! Staff have been hired therefore salary can't be changed.");
        }
        else{
            this.salary = salary;
        }
    }
    public void workingHour(float workingHour){
        this.workingHour = workingHour;
    }
    //creating method to check whether the staff has been already hired or not.
    public void appointFullTimeStaff (String staffName, String joiningDate, String appointedBy, String qualification){
        if(this.joined){
            System.out.println("Sorry! Staff has been already hired");
      }
      else{
          this.staffName = staffName;
          this.joined = true;
        }
        this.qualification = qualification;
        this.joiningDate = joiningDate;
        this.appointedBy = appointedBy;
    }


    //Using display method to print information of FullTimeStaffHire.
    public void display(){
      super.display();
      if (this.joined){
          System.out.println("staffName :" + this.getstaffName());
          System.out.println("qualification :" + this.getqualification());
          System.out.println("appointedBy :" + this.getappointedBy());
          System.out.println("workingHour :" + this.getworkingHour());
          System.out.println("salary :" + this.getsalary());
          System.out.println("joiningDate :" + this.getjoiningDate());
        }
    }
}

