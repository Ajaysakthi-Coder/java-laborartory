import java.util.*;
class Employee{
    double basic_pay;
    int Emp_id;
    String Emp_name,Address,Mail_id,Mobile_no;
    double DA,HRA,PF=12,Staffclub;
    double gross_salary;
    double net_salary;
    void GS(){
        gross_salary = basic_pay + (basic_pay*(DA/100))+(basic_pay*(HRA/100));
        System.out.println("Gross salary = "+gross_salary);
    }
    void NS(){
        net_salary= gross_salary - (basic_pay*(PF/100))-(basic_pay*(Staffclub/100));
        System.out.println("Net salary = "+net_salary);
    }
    void DA(){System.out.println("DA ="+(double)basic_pay*(DA/100));}
    void HRA(){System.out.println("HRA ="+(double)basic_pay*(HRA/100));}
    void PF(){System.out.println("PF ="+(double)basic_pay*(PF/100));}
    void Staffclub(){System.out.println("Staff club fund="+(double)basic_pay*Staffclub/100);}
    
}
 class Programmer extends Employee{
     Programmer(double x){
        basic_pay = x;
        DA=97;HRA=10;Staffclub=1;
            
    }
}
class AssistantProfesor extends Employee{
    AssistantProfesor(double x){
        basic_pay= x;
        DA=110;HRA=20;Staffclub=5;
    }
}
class AssociateProfesor extends Employee{
    AssociateProfesor(double x){
        basic_pay=x;
        DA=130;HRA=30;Staffclub=10;
    }
}
class Profesor extends Employee{
    Profesor(double x){
        basic_pay = x;
        DA=140;HRA=40;Staffclub=15;
    }
}
public class EmployeeSalaryCalculation {
    public static void p(String x){
        System.out.println(x);
    }
    public static void main(String[] args) {
        String desig;
        Scanner i = new Scanner(System.in);
        Employee a=new Employee();
        p("Employee Name:");
        a.Emp_name=i.nextLine();
        p("Employee ID:");
        a.Emp_id=i.nextInt();
        p("Address:");
        a.Address=i.nextLine();
        i.nextLine();        
         p("Mail ID:");
        a.Mail_id=i.nextLine();
        p("Mobile No:");
        a.Mobile_no=i.nextLine();
        p("Designation:");
        desig = i.nextLine();
        p("Basic Pay:");
        a.basic_pay=i.nextDouble();
        double x=a.basic_pay;
        switch(desig){
            case "Programmer":
                if (x>=20000 && x<=15000){p("not valid");return;}
                Programmer emp = new Programmer (x);
                emp.DA();emp.HRA();emp.PF();emp.Staffclub();emp.GS();emp.NS();
                break;
            case "Assistant Professor":
                if (x<=20001 && x>=30000){p("not valid");return;}
                AssistantProfesor em = new AssistantProfesor(x);
                em.DA();em.HRA();em.PF();em.Staffclub();em.GS();em.NS();
                break;       
            case "Associate Professor":
                if ( x<=30001&& x>=40000){p("not valid");return;}
                AssociateProfesor e = new AssociateProfesor(x);
                e.DA();e.HRA();e.PF();e.Staffclub();e.GS();e.NS();
                break; 
            case "Professor":
                if (x<=20001&& x>=30000){p("not valid");return;}
                Profesor eml = new Profesor(x);
                eml.DA();eml.HRA();eml.PF();eml.Staffclub();eml.GS();eml.NS();
                break;
            default:
                p("Invalid Desigination");
        }
    }
}