import java.util.*;
public class UserInfo{
    public String name;
    private int userid;
    public String companyname;
    public String place;
    protected int age;
    private String position;

    public void createUser(UserInfo obj){
        Scanner sc = new Scanner(System.in);
        System.out.println("---Enter User Details---");
        System.out.println("Name: ");
        obj.name = sc.next();
        System.out.println("userid: ");
        obj.userid = sc.nextInt();
        System.out.println("companyname: ");
        obj.companyname = sc.next();
        System.out.println("Place: ");
        obj.place = sc.next();
        System.out.println("Age: ");
        obj.age = sc.nextInt();
        System.out.println("Position: ");
        obj.position = sc.next();
        sc.close();
    }

    public void displayUser(UserInfo obj){
        System.out.println("---User Details: ---");
        System.out.println("User name: "+ obj.name);
        System.out.println("User id: " + obj.userid);
        System.out.println("Company name: "+ obj.companyname);
        System.out.println("Place: "+ obj.place);
        System.out.println("Age: "+ obj.age);
        System.out.println("Position: "+ obj.position);  
    }

    public static void main(String[] args) {
        UserInfo U1 = new UserInfo();
        U1.createUser(U1);
        U1.displayUser( U1);
    }

}