package MultilevelInheritance;

public class Branch extends College{
    String branchname;
    int branchid;
    int branchtotalstaff;

    public Branch(String collegename, int collegeid, String collegeplace, String branchname, int branchid,
            int branchtotalstaff) {
        super(collegename, collegeid, collegeplace);
        this.branchname = branchname;
        this.branchid = branchid;
        this.branchtotalstaff = branchtotalstaff;
    }


}
