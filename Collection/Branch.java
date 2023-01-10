package Collection;


public class Branch extends Bank{
    String branchName = "Axis Mumbai";
    int branchId = 789;
    long branchPhoneNo;
    private long branchTotalFund=100000;
    private float branchInterest;

    public void loan(long loan){
        super.checkLoan(loan);
    }

}