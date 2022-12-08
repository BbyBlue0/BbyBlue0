public class Elf1 {
    private String name; //Elf's name
    private String job; //Elf's job
    private double pay; //How much elf is being paid
    private int toys; //number of toys elf has created

    public Elf1()
    {
        name = "Undetermined";
        job = "Helper";
        pay = 0.00;
        toys = 0;
    }

    public Elf1(String name, String job, double pay, int toys)
    {
        this.name = name;
        this.job = job;
        this.pay = pay;
        this.toys = toys;
    }

    public void updatePay(double pay) // Add pay
    {
        this.pay += pay;
    }

    public double showPay()
    {
        return pay;
    }

    public void updateToys()
    {
        toys += 1;
    }

    public int showToys()
    {
        return toys;
    }

}
