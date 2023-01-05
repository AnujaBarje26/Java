package Inheritance;
import java.util.*;

public class Branch extends Bank{
    String branchName;
    int branchId;
    long branchPhoneNo;
    private long branchTotalFund;
    private static float branchInterest;

    public Branch(long bankTotalFund, float bankInterest, long branchTotalFund, float branchInterest) {
        super(bankTotalFund, bankInterest);
        this.branchTotalFund = branchTotalFund;
        this.branchInterest = branchInterest;
    }
    public void loan(long loan){
        super.checkLoan(loan);
    }

    public static void main(String args[]){
       System.out.println("Enter loan amount: ");
       Scanner sc = new Scanner(System.in);
       long loan = sc.nextLong();
       Branch b1 = new Branch(200000, (float) 1.5, 150000, 2);
       boolean res = b1.checkLoan(100000);
       if(res==true){
        b1.totalInterest(branchInterest);
       }
    }
}