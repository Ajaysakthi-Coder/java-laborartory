package travelmanagement;
import java.util.*;
public class Travelmanagement{
    public static void print(String s ){
        System.out.println(s);
    }    
    private static ArrayList <String> cities = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);
    public static void main (String[] args){
        while (true){
            print("\n----CITY MANAGEMENT MENU----");
            print("1.Append a city");
            print("2.Insert at Specific index");
            print("3.Search for a city");
            print("4.Display cities starting at a letter");
            print("5.Show all cities");
            print("6.End");
            print("Choose a option");
            int choice = sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 5:
                    System.out.println("Current List:"+cities);
                    break;
                

                case 6:
                    print("Exiting......");
                    return;
                case 1:
                    print("Enter city to add:");
                    String city = sc.nextLine();
                    cities.add(city);
                    System.out.println("Updated List:"+cities);
                    break;

                case 2:
                    print("Enter index :");
                    int index = sc.nextInt();
                    sc.nextLine();
                    print("Enter city to insert: ");
                    String citytoinsert = sc.nextLine();
                    if (index >=0 && index <=cities.size()){
                        cities.add(index,citytoinsert);
                        System.out.println("Updated List:"+cities);
                    }
                    else{print("Invalid index");}
                    break;
                case 3:
                    print("Enter city to search:");
                    String searchcity = sc.nextLine();
                    int pos = cities.indexOf(searchcity);
                    if (pos!=-1){System.out.println("City found at index:"+pos);}
                    else {print("City not found!");}
                    break;
                case 4:
                    print("Enter starting letter:");
                    char letter = sc.nextLine().charAt(0);
                    ArrayList<String> result= new ArrayList<>();
                    for (String c : cities){
                        if (c.startsWith(String.valueOf(letter))){result.add(c);}
                       
                    }
                    System.out.println("Cities Starting with the letter"+ letter+ "are"+ result);
                    break;
                default :
                    print("Invalid options!");

            }
        }
    }
}