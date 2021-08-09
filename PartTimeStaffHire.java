
/**
 * Write a description of class g here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
 public class PartTimeStaffHire extends StaffHire
{
    // declearing different instance variable of child class.
    // using private as an access modifier
    private String staffName;
    private String qualification;
    private String appointedBy;
    private String joiningDate;
    private String shifts;
    private float workingHour;
    private float wagesPerHour;
    private boolean joined;
    private boolean terminated;
    //creating a constructor for initializing instance variables
    public PartTimeStaffHire(int vacancyNumber, String designation, String jobType, float workingHour, float wagesPerHour, String shifts){
        super(vacancyNumber,designation,jobType);
         this.staffName = "";
         this.qualification = "";
         this.appointedBy = "";
         this.joiningDate = "";
         this.shifts = shifts;
         this.workingHour = workingHour;
         this.wagesPerHour = wagesPerHour;
         this.joined = false;
         this.terminated = false;
   }
        // creating accessor methods which return values of instance variables.
     public String getstaffName(){
       return this.staffName;
   }
    public String getqualification(){
       return this.qualification;
   }
    public String getappointedBy(){
       return this.staffName;
   }
   public String getjoiningDate(){
       return this.joiningDate;
    }
    public String getshifts(){
       return this.shifts;
   }
   public float getworkingHour(){
       return this.workingHour;
   }
   public float getwagesPerHour(){
       return this.wagesPerHour;
   }
   public boolean getjoined(){
       return this.joined;
   }
   public boolean getterminated(){
       return this.terminated;
   }
   public void setshifts (String shifts){
       if(this.joined){
            System.out.println("Staff is already hired therefore new shifts is not allowed");
        }
        else{
            this.shifts = shifts;
        }
   }
   public void hirePartTime(String staffName, String joiningDate, String qualification, String appointedBy){
       if(this.joined){
            System.out.println("Sorry! Staff has been already hired");
        }
        else{
               this.staffName = staffName;
               this.qualification = qualification;
               this.appointedBy = appointedBy;
               this.joiningDate = joiningDate;
               this.joined = true;
               this.terminated = false;
         }
   }
      // creating method to check weather the staff has been terminated or not.
   public void staffTerminated(){
        if(this.terminated){
            System.out.println("Sorry! Staff has been terminated.");
        }
        else{
            this.staffName = "";
            this.qualification = "";
            this.appointedBy = "";
            this.joiningDate = "";
            this.joined = false;
            this.terminated = true;
        }
   }
    public void display()
    {
    super.display();
        if(this.joined){
        System.out.println("staffName :" + this.getstaffName());
        System.out.println("qualification :" + this.getqualification());
        System.out.println("appontedBy :" + this.getappointedBy());
        System.out.println("joiningDate :" + this.getjoiningDate());
        System.out.println("workingHour :" + this.getworkingHour());
        System.out.println("wagesPerHour :" + this.getwagesPerHour());
        System.out.println("incomePerDay :" + this.getwagesPerHour() * this.getworkingHour());
    }
   }
}