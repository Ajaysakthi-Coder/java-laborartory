import java.util.*;
abstract class Shape{
    int x,y;
    abstract void printArea();
}
class Rectangle extends Shape{
    Rectangle(int a , int b){x=a;y=b;}
    void printArea(){System.out.println("Area of rectangle ="+x*y);}
}
class Triangle extends Shape{
    Triangle(int a , int b){x=a;y=b;}
    void printArea(){System.out.println("Area of Triangle ="+ (double)(0.5)*x*y);}
}
class Circle extends Shape{
    Circle(int a){x=a;}
    void printArea(){System.out.printf("Area of Circle = %.2f",(double)Math.PI*x*x);}
}
public class AreacCalculation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Shape:");
        String shape = in.nextLine();
        switch(shape){
            case "Rectangle":
                System.out.println("Length:");
                int a = in.nextInt();
                System.out.println("Breadth:");
                int b = in.nextInt();
                Rectangle r = new Rectangle(a,b);
                r.printArea();
                break;
            case "Triangle":
                System.out.println("base:");
                int c = in.nextInt();
                System.out.println("Height:");
                int d = in.nextInt();
                Triangle t = new Triangle(c,d);
                t.printArea();
                break;
            case "Circle":
                System.out.println("Radius:");
                int e = in.nextInt();
                Circle f = new Circle(e);
                f.printArea();
                break;
            default:
                System.out.println("Invalid shape");
                
        }
    }
    
}