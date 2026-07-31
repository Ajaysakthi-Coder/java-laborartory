import java.util.*;
interface BankAccount{
    void Deposit(double amount);
    void Withdraw(double amount);
    void Balance();
}
class Account implements BankAccount{
    private double balance;
    Account(double balance){this.balance = balance;}
    public void Deposit(double amount){
        try{
            if (amount<=0) throw new IllegalArgumentException("Invalid balance");
            balance+=amount;
            System.out.println("Amount deposited Rs."+amount);
        }
    
        catch(IllegalArgumentException e){System.out.println(e.getMessage());}
        
    }
    public void Withdraw(double amount){
        try{
            if (amount<=0) throw new IllegalArgumentException("Invalid balance");
            if (amount>balance) throw new ArithmeticException("Invalid withdraw for curtrent Balance");
            balance-=amount;
            System.out.println("Amount withdrawed Rs."+amount);
            System.out.println("Balance after withdrawal Rs."+balance);
        }
        catch(ArithmeticException e){System.out.println(e.getMessage());}
        catch(IllegalArgumentException e){System.out.println(e.getMessage());}
    }
    public void Balance(){
        System.out.println("Current Account Balance Rs."+ balance);
        

    }
}

public class BankManagementInterface {
    static String holdername;
    static int accountnumber;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Account Holder Name:");
        holdername = in.nextLine();
        System.out.println("Account Number :");
        accountnumber = in.nextInt();
        System.out.println("Initial Balance:");
        double balance = in.nextDouble();
        Account acc = new Account(balance);
        in.nextLine();
        System.out.println("Operation:(Deposit/Withdraw/Balancequery):");
        String op = in.nextLine();
        switch(op){
            case "Deposit":
                System.out.println("Deposite Amount:");
                double depamt= in.nextDouble();
                acc.Deposit(depamt);
                break;
            case "Withdraw":
                System.out.println("Withdraw Amount:");
                double withamt= in.nextDouble();
                acc.Withdraw(withamt);
                break;
            case "Balancequiery":
                acc.Balance();
                break;
            default:
                System.out.println("Invalid choice");
        }
       
    }
    
}