
public class UserInfoConstructor {
    public String name;
    private int userid;
    public String companyname;
    public String place;
    protected int age;
    private String position;
    public UserInfoConstructor(String name, int userid, String companyname, String place, int age, String position) {
        this.name = name;
        this.userid = userid;
        this.companyname = companyname;
        this.place = place;
        this.age = age;
        this.position = position;
    }
    public void displayUser(){
        System.out.println("---User Details: ---");
        System.out.println("User name: "+ this.name);
        System.out.println("User id: " + this.userid);
        System.out.println("Company name: "+ this.companyname);
        System.out.println("Place: "+ this.place);
        System.out.println("Age: "+ this.age);
        System.out.println("Position: "+ this.position);  
    }
    public static void main(String[] args) {
        UserInfoConstructor obj = new UserInfoConstructor("Anuja", 12, "Axis", "Mumbai", 22, "SDE");
        obj.displayUser();

    }
}