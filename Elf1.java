public class Elf1 {
    private String name; //Elf's name
    //private String job; //Elf's job
    private int toys; //number of toys elf has created
    //private Job job;

    public Elf1()
    {
        name = "Undetermined";
      //  job = new Job();
        toys = 0;
    }

    public Elf1(String name, int toys) //Assign name, give job from
    {
        this.name = name;
       // this.job = job;
        this.toys = toys;
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
