package Collection;

import java.util.*;

public class User extends Branch{
    String username;
    long loan;
    User userarr[];
    int count = 0;
    Scanner sc = new Scanner(System.in);

    
    
    void addUser(){
        System.out.println("Enter username: ");
        username = sc.next();
        System.out.println("Enter loan amount: ");
        loan = sc.nextLong();
        if(super.checkLoan(loan)){
            if(count<userarr.length){
                User obj = new User();
                obj.username = username;
                obj.loan = loan;
                userarr[count] = obj;
                count++;
            }
            else{
                System.out.println("User cant be added");
            }
        }
        
    }

    void displayUser(){
        System.out.println("-----User details-----");
        for(User userobj : userarr){
            if(userobj!=null){
                System.out.println("User name: " + userobj.username);
                System.out.println("User loan amount: " + userobj.loan);
                System.out.println("User bank name: " + userobj.bankName);
                System.out.println("User bank id: " + userobj.bankId);
                System.out.println("User branch name: " + userobj.branchName);
                System.out.println("User branch id: " + userobj.branchId);
            }
        }

    }

    public static void main(String args[]){
        

        User obj = new User();
        System.out.println("Enter size of array");
        int n = obj.sc.nextInt();
        obj.userarr = new User[n];
        
        while(true){
    
        System.out.println("Select choice:\n 1. Add User Details\n 2. View approved User Details\n 3.Exit");
        
        int choice = obj.sc.nextInt();
        
        
            switch(choice){
                case 1: obj.addUser();
                        break;
                case 2: obj.displayUser();
                        break;
                case 3: System.out.println("Thank you");
                       System.exit(1);
                default: System.out.println("Please enter correct choice");

            }
        }
        

    
}


    

}
