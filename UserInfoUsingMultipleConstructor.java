public class UserInfoUsingMultipleConstructor {
    
    public String name;
    private int userid;
    public String companyname;
    public String place;
    protected int age;
    private String position;
    public UserInfoUsingMultipleConstructor(String name, int userid, String companyname, String place, int age, String position) {
        this.name = name;
        this.userid = userid;
        this.companyname = companyname;
        this.place = place;
        this.age = age;
        this.position = position;
    }
    public UserInfoUsingMultipleConstructor(String name, int userid, int age) {
        this.name = name;
        this.userid = userid;
        this.age = age;
    
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
        UserInfoUsingMultipleConstructor obj1 = new UserInfoUsingMultipleConstructor("Anuja", 12, "Axis", "Mumbai", 22, "SDE");
        obj1.displayUser();
        UserInfoUsingMultipleConstructor obj2 = new UserInfoUsingMultipleConstructor("Shubham", 14, 25);
        System.out.println(obj2.name);
        System.out.println(obj2.userid);
        System.out.println(obj2.age);

    }
}
