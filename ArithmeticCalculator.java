import java.util.*;

interface Calculator{
   void Addition(double  a,double  b);
   void Subraction(double a , double b);
   void Multiplication(double a,double b);
   void Dividor(double a, double b);
}

class Arithimetic implements Calculator{
    public void Addition(double a, double b){System.out.println(a+b);}
    public void Subraction(double a, double b){System.out.println(a-b);}
    public void Multiplication(double a, double b){System.out.println(a*b);}
    public void Dividor(double a,double b){
        if (b!=0) System.out.println(a/b);
        else System.out.println("INvalid divider");
    }
}


public class InterfaceCalculator {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the opertaion to perform:(add/sub/mul/div):");
        String op = in.nextLine();
        switch(op){
            case "add":
                System.out.println("Enter a:");
                double a = in.nextDouble();
                System.out.println("Enter a:");
                double b = in.nextDouble();
                Calculator add=new Arithimetic();
                add.Addition(a, b);
                break;
            case "sub":
                System.out.println("Enter a:");
                double aa = in.nextDouble();
                System.out.println("Enter a:");
                double bb = in.nextDouble();
                Calculator sub=new Arithimetic();
                sub.Subraction(aa, bb);
                break;
            case "mul":
                System.out.println("Enter a:");
                double aaa = in.nextDouble();
                System.out.println("Enter a:");
                double bbb = in.nextDouble();
                Calculator mul=new Arithimetic();
                mul.Multiplication(aaa, bbb);
                break;
            case "div":
                System.out.println("Enter a:");
                double aaaa = in.nextDouble();
                System.out.println("Enter a:");
                double bbbb = in.nextDouble();
                Calculator div =new Arithimetic();
                div.Dividor(aaaa, bbbb);
                break;
            default:
                System.out.println("invalid choice");
        }
    }
    
}
