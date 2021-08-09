
/**
 * Write a description of class knk here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StaffHire
{
    private String designation;
    private String jobType;
    private int vacancyNumber;
    public StaffHire(int vacancyNumber, String designation, String jobType){
        this.designation=designation;
        this.jobType=jobType;
        this.vacancyNumber=vacancyNumber;
    }
    public String getdesignation(){
        return this.designation;
    }
    public void setdesignation(String designation){
        this.designation=designation;
    }
    public String getjobType(){
        return this.jobType;
    }
    public void setjobType(String jobtype){
        this.jobType=jobType;
    }
    public int getvacancyNumber(){
        return this.vacancyNumber;
    }    
    public void setVacancy(int vacancy){
        this.vacancyNumber=vacancyNumber;
    }
    public void display(){
        System.out.println("designation=" + this.getdesignation());
        System.out.println("jobType=" + this.getjobType());
        System.out.println("vacancyNumber=" + this.getvacancyNumber());
    }
}

