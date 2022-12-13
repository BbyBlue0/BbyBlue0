public class Main {
    public static void main(String[] args) {

       Job jeffJob = new Job("Wrapper", 0.50, 0.00);

       Elf1 jeff = new Elf1("Jeff", jeffJob);

       //Jeff's constructor's ^^^

        Job antoniJob = new Job("Toy Maker", 0.70, 0.00);

        Elf1 antoni = new Elf1("Antoni", antoniJob);

        //Antoni's constructors ^^^

        Job tonyJob = new Job("Chief Toy Maker", 1.00, 0.00);

        Elf1 tony = new Elf1("tony", tonyJob);

        //Tony's constructors ^^^

        Job francescoJob = new Job("Sack Packer", 0.40, 0.00);

        Elf1 francesco = new Elf1("francesco", francescoJob);

        //francesco's constructors ^^^

        Job frankJob = new Job("Sack Packer", 0.40, 0.00);

        Elf1 frank = new Elf1("frank", frankJob);

        //frank's constructors ^^^

        Job raphaelJob = new Job("Wrapper", 0.50, 0.00);

        Elf1 raphael = new Elf1("raphael", raphaelJob);

        //raphael's constructors ^^^

        System.out.println(jeffJob.showToysMade());

    }
}
