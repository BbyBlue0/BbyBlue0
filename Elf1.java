public class Elf1 {
    private String name; //Elf's name
    //private String job; //Elf's job
    private Job job;

    public Elf1()
    {
        name = "Undetermined";
       this.job = new Job();

    }

    public Elf1(String name, Job job) //Assign name, give job from Job class
    {
        this.name = name;
        this.job = new Job();
    }


}
