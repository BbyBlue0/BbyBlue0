public class Job {
    private String jobType;
    private double pay;

    public Job()
    {
        jobType = "Unassigned";
        pay = 0.00;
    }


    public Job(String jobType, double pay)
    {
        this.jobType = jobType;
        this.pay = pay;
    }

    public void setJobType(String jobType)
    {
        this.jobType = jobType;
    }

    public String showJobType()
    {
        return jobType;
    }

    public void setPay(double pay)
    {
        this.pay = pay;
    }

    public double showPay()
    {
        return pay;
    }
}
