package Collection;

public class Bank {
    String bankName;
    int bankId;
    long bankPhoneNo;
    private long bankTotalFund=200000;
    private float bankInterest;

  

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

