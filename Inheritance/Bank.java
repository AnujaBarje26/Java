package Inheritance;

public class Bank {
    String bankName;
    int bankId;
    long bankPhoneNo;
    private long bankTotalFund;
    private float bankInterest;

    public Bank(long bankTotalFund, float bankInterest) {
        this.bankTotalFund = bankTotalFund;
        this.bankInterest = bankInterest;
    }

    public boolean checkLoan(long loan){
        boolean flag = false;
        if(loan<bankTotalFund){
            System.out.println("Loan is approved!!!");
            flag = true;
        }
        else{
            System.out.println("Loan cant be approved!!!");
        }
        return flag;
    }

    public void totalInterest(float branchinterest){
        System.out.println("Total interest: " + (bankInterest + branchinterest));
    }

    

}
