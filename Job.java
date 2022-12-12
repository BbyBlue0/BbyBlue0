public class Job {
    private String jobType; //Job type can be Toy Maker, Gift Wrapper, or Sack Packer
    private double pay; //How much the elf is being payed. Can vary from elf to elf
    private double owed; //How much santa owes his elf. Amount should increase with every toy made, wrapped, or packed by the elf.

    private static int toysMade = 0;
    private static int toysWrapped = 0;
    private static int toysPacked = 0;

    public Job() //default job
    {
        jobType = "Unassigned";
        pay = 0.00;
    }


    public Job(String jobType, double pay, double owed) //Initializes a job. (Recommended to assign a new job to each elf made. Careful when assigning the same job to elves- If you mutate the jobs variables, it will change it for all elves that have been assigned this job.)
    {
        this.jobType = jobType; //Remember, jobType should be Toy Maker, Gift Wrapper, or Sack Packer
        this.pay = pay;
        this.owed = owed; //realistically should be started at 0.00
    }

    public void setJobType(String jobType) //Changes an elf's job type. Caution: Will change the job type for all elves who are assigned the same job.
    {
        this.jobType = jobType;
    }

    public String showJobType()
    {
        return jobType;
    }

    public void setPay(double pay) //Can change the pay rate of an elf. Caution: Will change the pay for all elves who are assigned the same job
    {
        this.pay = pay;
    }

    public double showPay()
    {
        return pay;
    }

    public void setOwed(double owed) //Changes how much Santa owes his elf. Caution: Will change how much they are owed for all elves who are assigned the same job.
    {
        this.owed = owed;
    }

    public double showOwed()
    {
        return owed;
    }

    public int showToysMade() //Needs to get to 100
    {
        return toysMade;
    }

    public int showToysPacked() //Needs to get to 100
    {
        return toysPacked;
    }

    public int showToysWrapped() //Needs to get to 100
    {
        return toysWrapped;
    }

    public void makeToy() //Elf will make a toy. Increases toysMade by 1. owed will increase by elfs pay.
    {
        System.out.println("The " + jobType + " elf is making a toy... \n    *Clatter Clatter* \nThe toy has been made!");
        owed += pay;
        toysMade += 1;
    }
    public void wrapToy() //Elf will wrap a toy. Increases toysWrapped by 1. owed will increase by elfs pay.
    {
        System.out.println("The " + jobType + " elf is wrapping a present... \nPresent has been wrapped!");
        owed += pay;
        toysWrapped += 1;
    }
    public void packToy()
    {
        System.out.println("The " + jobType + " elf is packing a toy... \nThe present has been packed! It is ready to go with santa to its new home!");
        owed += pay;
        toysPacked += 1;
    }
}
