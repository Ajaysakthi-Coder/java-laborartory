import java.util.Scanner;
class ElectricityCalculator{
    private final String connectiontype;
    private final int unitsconsumed;
    private double billamount;
   
    public ElectricityCalculator(String connectiontype,int unitsconsumed){
        this.unitsconsumed=unitsconsumed;
        this.connectiontype= connectiontype;
    }
    public void calculatebillamount(){
        if (connectiontype.equalsIgnoreCase("Domestic")){
            if (unitsconsumed>=0&&unitsconsumed<=100) billamount = 0;
            else if (unitsconsumed>100 && unitsconsumed<=200) billamount=(unitsconsumed-100)*2;
            else if (unitsconsumed>200 && unitsconsumed<=500) billamount=100*2+(unitsconsumed-200)*4;
            else if (unitsconsumed>500) billamount = 100*2+300*4+(unitsconsumed-500)*6;
        }
        else if (connectiontype.equalsIgnoreCase("Commercial")){
            if (unitsconsumed>=0 && unitsconsumed<=100) billamount=unitsconsumed*2;
            else if (unitsconsumed>100 && unitsconsumed<=200) billamount= 100*2+(unitsconsumed-100)*4;
            else if (unitsconsumed>200 && unitsconsumed<=500) billamount = 100*2+100*4+(unitsconsumed-200)*6;
            else if (unitsconsumed>500) billamount = 100*2+100*4+300*6+(unitsconsumed-500)*7;
        }
    }
    public void display(){
        System.out.println("Amount to be paid: Rs."+billamount);
    }
}
public class ElectricityBill {
    public static void main(String[] args) {
       String connectiontype;
       int unitsconsumed;
       Scanner in = new Scanner(System.in);
       System.out.println("Connection Type:");
       connectiontype = in.nextLine();
       System.out.println("Units Consumed:");
       unitsconsumed = in.nextInt();
       ElectricityCalculator bill = new ElectricityCalculator(connectiontype,unitsconsumed);
       bill.calculatebillamount();
       bill.display();
       
       

       
       
    }
   
}