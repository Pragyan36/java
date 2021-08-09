
/**
 * Write a description of class INGnepal here.
 *
 * @author (Pragyan maharjan)
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.util.*;
import java.awt.event.*;

public class INGNepal implements ActionListener
{
       JTextField txtVacancyNumber,txtDesignation,txtSalary ,txtWorkingHour, txtvacancynumber, txtDesi,txtWages, txtWh,
       txtVacancynumber,txtStaffName, txtQualification,txtAppointedBy,txtVacancy, txtStaff,txtQual,txtAppo,
       txtvacancyNumber;
      JFrame fframe;
      JPanel ppanel;
      JLabel title,title1,lA,lB,lC,lD,lE,lF,lG,lH,lI,lJ,lK,lL,lM,lN,lO,lP,lQ,lR,lS,lT,lU,lV;
      JComboBox comboJobType,comboJobtype,comboShift,cmbYear, cmbMonth,cmbDay, cmbyear, cmbmonth, cmbday;
      String Year1,Month1,Day1,joiningDate, day1, month1, year1;
      PartTimeStaffHire bb, a, add, dis;
      FullTimeStaffHire hh, pr;
      int vno,VNO, vn,VN, vacant;
      String staff, qual, appo,join, jobTypes, desginations, shifts, staffNames, joinDates, qualifications, appointedBy, jobType, desgination,appointedBys;
      float salary, workingHour, wagess, workingHours;
      ArrayList<StaffHire> list = new ArrayList();
      JButton AddFullTime,AddPartTime ,AppointFullTime ,AppointPartTime,displayButton  ,clearButton ,terminateButton;
   
     public void p1(){
        fframe =  new JFrame("Staff Hire");
        fframe.setBounds(100,60,1210,760);
        fframe.setResizable(false);
        ppanel = new JPanel();
        ppanel .setLayout(null);
       
        //set background color
        Color  c = new Color(3, 40, 252);
        ppanel.setBackground(c);
       
        // add vacancy
       
        //for the title
        title = new JLabel();
        title.setText("For Fulltime Staff Hire");
        title.setBounds(510,15,510,55);
        ppanel.add(title);
       
        //font for title
        Font f= new Font("Arial", Font.BOLD,25);
        title.setFont(f);
       
         //for full time staff
         // vacancy number
        lA= new JLabel("Vacancy Number:");
        lA.setBounds(20, 55, 205, 35);
        ppanel.add(lA);
       
        txtVacancyNumber = new JTextField();
        txtVacancyNumber.setBounds(130, 55, 200,35);
        ppanel.add(txtVacancyNumber);
          //salary
        lB = new JLabel("Salary:");
        lB.setBounds(450, 55,620, 35);
        ppanel.add(lB);
       
        txtSalary = new JTextField();
        txtSalary .setBounds(550, 55, 200,35);
        
        ppanel.add(txtSalary);
        
        // job type
        lC = new JLabel("Job Type:");
        lC.setBounds(800, 55, 100, 35);
        ppanel.add(lC);
       
        String[] JobType ={"Full Time", "Part Time"};
        comboJobType = new JComboBox(JobType);
        comboJobType .setBounds(900,55,175,35);
        ppanel.add(comboJobType );
       

       
         //Working Hour
        lD = new JLabel("Working Hour:");
        lD.setBounds(20, 105, 100, 35);
        ppanel.add(lD);
     
        txtWorkingHour = new JTextField();
        txtWorkingHour.setBounds(130,105, 200,35);
        ppanel.add(txtWorkingHour);
 

        //Designation
        lE = new JLabel("Designation:");
        lE.setBounds(450, 105, 200, 35);
        ppanel.add(lE);
       
        txtDesignation = new JTextField();
        txtDesignation.setBounds(550, 105, 200,35);
        ppanel.add(txtDesignation);
       
        //button to add full time staff
       
        AddFullTime = new JButton("Add Vacancy");
        AddFullTime.setEnabled(true);
        AddFullTime.setBounds(850, 105, 200, 35);
        AddFullTime.addActionListener(this);
     
        // Button1
        Font button1_font = new Font("Tahoma",Font.PLAIN, 15);
        AddFullTime.setFont(button1_font);
        ppanel.add(AddFullTime);
        Color  c1 = new Color(77, 93, 184);
        AddFullTime.setBackground(c1);
        
        // for full time staff hire
         // vacancy number
        lF = new JLabel("Vacancy Number:");
        lF.setBounds(20,155,200, 35);
        ppanel.add(lF);
       
        txtVacancynumber = new JTextField();
        txtVacancynumber.setBounds(130, 155, 200,35);
        ppanel.add(txtVacancynumber);
       
       
         // Appointed By
        lG = new JLabel("Appointed By:");
        lG.setBounds(450,155,200, 35);
        ppanel.add(lG);
       
        txtAppointedBy = new JTextField();
        txtAppointedBy.setBounds(550, 155, 200,35);
        ppanel.add(txtAppointedBy);
       
       
         // joining date
        lH= new JLabel("Joining Date:");
        lH.setBounds(800, 155, 200, 35);
        ppanel.add(lH);
       
        String year[]={ "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013","2014","2015","2016","2017","2018","2019","2020","2021"};
        cmbYear=new JComboBox(year);
        cmbYear.setBounds(900, 155, 70,35);
        ppanel.add(cmbYear);
       
        String month[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
        cmbMonth=new JComboBox(month);
        cmbMonth.setBounds(970,155,70,35);
        ppanel.add(cmbMonth);
       
        String day[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        cmbDay=new JComboBox(day);
        cmbDay.setBounds(1040,155,40,35);
        ppanel.add(cmbDay);
       
     
        //Staff Name
         lI= new JLabel("Staff Name:");
        lI.setBounds(20, 205, 200, 35);
        ppanel.add(lI);
       
        txtStaffName= new JTextField();
        txtStaffName.setBounds(130, 205, 200,35);
        ppanel.add(txtStaffName);
       
         //Qualification
        lJ = new JLabel("Qualification:");
        lJ.setBounds(450, 205, 200, 35);
        ppanel.add(lJ);
     
        txtQualification = new JTextField();
        txtQualification.setBounds(550, 205, 200,35);
        ppanel.add(txtQualification);
       
        //button to appoint full time staff
       
        AppointFullTime = new JButton("Appoint staff");
        AppointFullTime.setEnabled(true);
        AppointFullTime.setBounds(850, 205, 200, 35);
        AppointFullTime.addActionListener(this);
     
        //button 2
        Font button2_font = new Font("Arial",Font.PLAIN, 15);
        AppointFullTime.setFont(button2_font);
        ppanel.add(AppointFullTime);
        Color  c2 = new Color(77, 93, 184);
        AppointFullTime.setBackground(c2);
        
       
        //for part time staff
        // vacancy number
        lK = new JLabel("Vacancy Number:");
        lK.setBounds(20, 350, 200, 35);
        ppanel.add(lK);
   
        txtvacancynumber = new JTextField();
        txtvacancynumber.setBounds(130, 350, 200,35);
        ppanel.add(txtvacancynumber);
       
        //Wages
        lL = new JLabel("Wages:");
        lL.setBounds(450, 350, 200, 35);
        ppanel.add(lL);
       
        txtWages = new JTextField();
        txtWages.setBounds(550, 350,200,35);
        ppanel.add(txtWages);
       
        // job type
        lM = new JLabel("Job Type:");
        lM.setBounds(800, 350, 200, 25);
        ppanel.add(lM);
       
        String[] eight ={"Full Time", "Part Time"};
        comboJobtype = new JComboBox(eight);
        comboJobtype.setBounds(900,350,200,35);
        ppanel.add(comboJobtype);
   
        //Working Hour
        lN = new JLabel("Working Hour:");
        lN.setBounds(20, 400, 200, 35);
        ppanel.add(lN);
       
        txtWh = new JTextField();
        txtWh.setBounds(130, 400, 200,35);
        ppanel.add(txtWh);
       
         //Designation:
        lO = new JLabel("Designation:");
        lO.setBounds(450, 400, 200, 35);
        ppanel.add(lO);
     
        txtDesi= new JTextField();
        txtDesi.setBounds(550, 400, 200,30);
        ppanel.add(txtDesi);
       
        //shift    
        lP = new JLabel("Shift:");
        lP.setBounds(800, 400, 200, 35);
        ppanel.add(lP);
       
        String[] eleven ={"Morning", "Evening"};
        comboShift = new JComboBox(eleven);
        comboShift.setBounds(900, 400, 200,35);
        ppanel.add(comboShift);
     
        //button to add part time staff
        AddPartTime = new JButton("Add Vacancy ");
        AddPartTime.setEnabled(true);
        AddPartTime.setBounds(900, 450, 200, 35);
        AddPartTime.addActionListener(this);
     
        //Button 3
        Font button3_font = new Font("Arial",Font.PLAIN, 15);
        AddPartTime.setFont(button3_font);
        ppanel.add(AddPartTime);
        Color  c3 = new Color(77, 93, 184);
        AddPartTime.setBackground(c3);
       
        //appoint staff hired
         //for the title
        title1 = new JLabel();
        title1.setText("For Parttime Staff Hire");
        title1.setBounds(510,310,510,55);
        ppanel.add(title1);
       
        //font for title
        Font f1= new Font("Arial", Font.BOLD,25);
        title1.setFont(f1);
       
        
       
       
        // for part time staff
        // vacancy number
        lQ = new JLabel("Vacancy Number:");
        lQ.setBounds(20, 500, 200, 35);
        ppanel.add(lQ);
       
        txtVacancy = new JTextField();
        txtVacancy.setBounds(130, 500, 200,35);
        ppanel.add(txtVacancy);
   
         // Appointed By
        lR = new JLabel("Appointed By:");
        lR.setBounds(450, 500, 200, 35);
        ppanel.add(lR);
       
        txtAppo = new JTextField();
        txtAppo.setBounds(550, 500, 200,35);
        ppanel.add(txtAppo);
       
       
         // joining date
        lS= new JLabel("Joining Date:");
        lS.setBounds(800, 500, 200, 35);
        ppanel.add(lS);
       
        String year1[]={"1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013","2014","2015","2016","2017","2018","2019","2020","2021"};
        cmbyear=new JComboBox(year1);
        cmbyear.setBounds(900, 500, 70,35);
        ppanel.add(cmbyear);
       
        String month1[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
        cmbmonth=new JComboBox(month1);
        cmbmonth.setBounds(970,500,70,35);
        ppanel.add(cmbmonth);
       
        String day1[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        cmbday=new JComboBox(day1);
        cmbday.setBounds(1040,500,40,35);
        ppanel.add(cmbday);
       
        //Staff Name
        lT= new JLabel("Staff Name:");
        lT.setBounds(20, 550, 200, 35);
        ppanel.add(lT);
       
        txtStaff = new JTextField();
        txtStaff.setBounds(130, 550, 200,35);
        ppanel.add(txtStaff);
       
         //Qualification
        lU = new JLabel("Qualification:");
        lU.setBounds(450, 550, 200, 35);
        ppanel.add(lU);
     
        txtQual = new JTextField();
        txtQual.setBounds(550, 550, 200,35);
        ppanel.add(txtQual);
       
        //button to appoint part time staff
        AppointPartTime = new JButton("Appoint Staff");
        AppointPartTime.setEnabled(true);
        AppointPartTime.setBounds(900, 550, 200, 35);
        AppointPartTime.addActionListener(this);
     
        //Button 4
        Font button4_font = new Font("Arial",Font.PLAIN, 15);
        AppointPartTime.setFont(button4_font);
        ppanel.add(AppointPartTime);
        Color  c4 = new Color(77, 93, 184);
        AppointPartTime.setBackground(c4);
       
       
        //terminate staff
        //add vacancy number
        lV = new JLabel("Vacancy Number");
        lV.setBounds(20, 600, 200, 35);
        ppanel.add(lV);
       
         txtvacancyNumber = new JTextField();
         txtvacancyNumber.setBounds(130, 600, 200,35);
        ppanel.add( txtvacancyNumber);
       
        //display
       
        displayButton = new JButton("Display");
        displayButton.setEnabled(true);
        displayButton.setBounds(130, 650, 200, 35);
        displayButton.addActionListener(this);
     
        //Button 5
        Font button5_font = new Font("Arial",Font.PLAIN, 15);
        displayButton.setFont(button5_font);
        ppanel.add(displayButton);
        Color  c5 = new Color(77, 93, 184);
        displayButton.setBackground(c5);
       
        //to clear the value
        clearButton = new JButton("Clear");
        clearButton.setEnabled(true);
        clearButton.setBounds(900, 650, 200, 35);
        clearButton.addActionListener(this);
     
        //Button 6
        Font button6_font = new Font("Arial",Font.PLAIN, 15);
        clearButton.setFont(button6_font);
        ppanel.add(clearButton);
        Color  c6 = new Color(77, 93, 184);
        clearButton.setBackground(c6);
       
        //to terminate the result
        terminateButton = new JButton("Terminate");
        terminateButton.setEnabled(true);
        terminateButton.setBounds(550, 600, 200, 35);
        terminateButton.addActionListener(this);
     
        //Button 7
        Font button7_font = new Font("Arial",Font.PLAIN, 15);
        terminateButton.setFont(button7_font);
        ppanel.add(terminateButton);
        Color  c7 = new Color(77, 93, 184);
        terminateButton.setBackground(c7);
       
        fframe.setVisible(true);
        fframe.add(ppanel);
        fframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
   
      }
        //add full time staff
        public void actionPerformed(ActionEvent e){
            if(e.getSource()==AddFullTime){
              vno=0;
              salary=0;
              workingHour=0;
              jobType="";
              desgination="";
             try{
                vno=Integer.parseInt(txtVacancyNumber.getText());
                desgination= txtDesignation.getText();
                salary=Float.parseFloat(txtSalary .getText());
                workingHour=Float.parseFloat(txtWorkingHour.getText());
                jobType=(comboJobType.getSelectedItem()).toString();
           
               //FOR COMPARING THE Vacancy No VALUES
               boolean isDuplicateVno=false;
               for(StaffHire obj:list) {
                if(obj.getvacancyNumber()==vno){
                   isDuplicateVno=true;
                  break;
                  }
                }
               if(isDuplicateVno==false){
                FullTimeStaffHire obj=new FullTimeStaffHire(vno, desgination,jobType,salary,workingHour);
                list.add(obj);
                JOptionPane.showMessageDialog(ppanel,"Vacancy added for Full Time staff "+list.size());
               }else{
                 JOptionPane.showMessageDialog(ppanel,"Input Vacancy no is already in the list. "+list.size());
                 }
              }
               
             catch(Exception exp){
                  JOptionPane.showMessageDialog(ppanel,"Please enter all the fields. ");
              }
             }
       
              //appoint full time staff
         
 if(e.getSource()==AppointFullTime){
     try{
             vn=Integer.parseInt(txtVacancynumber.getText());
             staffNames=txtStaffName.getText();
             Year1 = (cmbYear.getSelectedItem()).toString();
             Month1 = (cmbMonth.getSelectedItem()).toString();
            Day1 = (cmbDay.getSelectedItem()).toString();
            joinDates=(Year1+Month1+Day1).toString();
            qualifications=txtQualification.getText();
            appointedBys=txtAppointedBy.getText();
           
            boolean vnoFound=false;
            for(StaffHire obj: list){
                if(obj.getvacancyNumber()==vn){
                    vnoFound = true;
                    if(obj instanceof FullTimeStaffHire){
                   FullTimeStaffHire hh=(FullTimeStaffHire)obj;
                   if(hh.getjoined()==true){
                    JOptionPane.showMessageDialog(ppanel,"Staff is already hired!");
                }else{
                    hh.appointFullTimeStaff(staffNames, joinDates, appointedBys, qualifications);
                    JOptionPane.showMessageDialog(ppanel,"Staff is successfully appointed.");
                    break;
                }}
            }
            }
            }
                catch(Exception exp){
                  JOptionPane.showMessageDialog(ppanel,"Not for full time Staff ");
              }
             }
       
            //add Part Time Staff
           if(e.getSource()==AddPartTime){
             VNO=0;
             wagess=0;
             workingHours=0;
             jobTypes="";
             desginations="";
             shifts="";
             try{
                VNO=Integer.parseInt(txtvacancynumber.getText());
                desginations=txtDesi.getText();
                wagess=Float.parseFloat(txtWages.getText());
                shifts=(comboShift.getSelectedItem()).toString();
                workingHours=Float.parseFloat(txtWh.getText());
                jobTypes=(comboJobtype.getSelectedItem()).toString();
           
               //FOR COMPARING THE Vacancy No VALUES
                boolean isDuplicateVnoo=false;
                for(StaffHire var:list) {
                 if(var.getvacancyNumber()==VNO){
                   isDuplicateVnoo=true;
                    break;
                 }
               }
                if(isDuplicateVnoo==false){
                  PartTimeStaffHire abc=new PartTimeStaffHire(VNO, desginations,jobTypes,workingHours,wagess,shifts);
                  list.add(abc);
                  JOptionPane.showMessageDialog(ppanel,"Vacancy added for Part Time "+list.size());
                 }
                else{
                 JOptionPane.showMessageDialog(ppanel,"Input Vacancy no is already in the list. "+list.size());
                }
              }  
             catch(Exception exp){
             JOptionPane.showMessageDialog(ppanel,"Please enter all the fields. ");
             }    
           }
           
             //appoint part time staff
       
   if(e.getSource()==AppointPartTime){
     try{
      VN=Integer.parseInt(txtVacancy.getText());
              staff=txtStaff.getText();
              year1 = (cmbyear.getSelectedItem()).toString();
              month1 = (cmbmonth.getSelectedItem()).toString();
              day1 = (cmbday.getSelectedItem()).toString();
              join=(year1+month1+day1).toString();
              qual=txtQual.getText();
              appo=txtAppo.getText();
           
              boolean vnoFound=false;
              for(StaffHire var: list){
                if(var.getvacancyNumber()==VN){
                    vnoFound= true;
                    if(var instanceof PartTimeStaffHire){
                     a=(PartTimeStaffHire)var;
                    if(a.getjoined()==true){
                        JOptionPane.showMessageDialog(ppanel,"Staff is already hired!");
                    }else{
                    a.hirePartTime(staff, join, appo, qual);
                    JOptionPane.showMessageDialog(ppanel,"Staff is successfully appointed.");
                    break;
                   
                }}
               }
            }
        }
               catch(Exception ex){
                  JOptionPane.showMessageDialog(ppanel,"Not for part time Staff");
              }
             }
         
          //terminate staff
          if(e.getSource()==terminateButton){
           vacant = Integer.parseInt( txtvacancyNumber.getText());
           
           for(StaffHire var:list){
               if(var.getvacancyNumber()==vacant){
                   if(var instanceof PartTimeStaffHire){
                        bb = (PartTimeStaffHire)var;
                       if(bb.getterminated()==false){
                           bb.staffTerminated();
                            JOptionPane.showMessageDialog(ppanel,"Staff is successfully terminated");
                           break;
                        }
                       else if(bb.getterminated()== true){
                            JOptionPane.showMessageDialog(ppanel,"Sorry! Staff has already been terminated.");
                            break;
                        }
                    }
                    else{
                         JOptionPane.showMessageDialog(ppanel,"Sorry!, please enter valid vacancy number.");
                         break;
                       
                        }
                }
            }
        }
        //display
        if(e.getSource()==displayButton){
            for(StaffHire obj:list){
                if(obj instanceof FullTimeStaffHire){
                     FullTimeStaffHire pr =  (FullTimeStaffHire)obj;
                     pr.display();
                    }
                    else if(obj instanceof PartTimeStaffHire){
                      PartTimeStaffHire pr=  (PartTimeStaffHire)obj;
                     dis.display();
                    }
       
          }
         }
         
        //clear
        if(e.getSource()==clearButton){
            txtVacancyNumber.setText("");
            txtDesignation.setText("");
            txtSalary.setText("");
            txtWorkingHour.setText("");
            txtvacancynumber.setText("");
            txtDesi.setText("");
            txtWages.setText("");
            txtWh.setText("");
            txtVacancynumber.setText("");
            txtStaffName.setText("");
            txtQualification.setText("");
            txtAppointedBy.setText("");
            txtVacancy.setText("");
            txtStaff.setText("");
            txtQual.setText("");
            txtAppo.setText("");
            txtvacancyNumber.setText("");
         
       
        }
 
       
      }
   
       
      public static void main(String[] args){
        INGNepal pr = new INGNepal ();
        pr.p1();
      }
   
}

 

 

