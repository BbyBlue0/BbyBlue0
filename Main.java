public class Main {
    public static void main(String[] args) {

       Job jeffJob = new Job("Wrapper", 0.50, 0.00);

       Elf1 jeff = new Elf1("Jeff", jeffJob);

       //Jeff's constructor's ^^^

        Job antoniJob = new Job("Toy Maker", 0.70, 0.00);

        Elf1 antoni = new Elf1("Antoni", antoniJob);

        //Antoni's constructors ^^^

        Job tonyJob = new Job("Chief Toy Maker", 1.00, 0.00);

        Elf1 tony = new Elf1("Tony", tonyJob);

        //Tony's constructors ^^^

        Job francescoJob = new Job("Sack Packer", 0.40, 0.00);

        Elf1 francesco = new Elf1("Francesco", francescoJob);

        //francesco's constructors ^^^

        Job frankJob = new Job("Sack Packer", 0.40, 0.00);

        Elf1 frank = new Elf1("Frank", frankJob);

        //frank's constructors ^^^

        Job raphaelJob = new Job("Wrapper", 0.50, 0.00);

        Elf1 raphael = new Elf1("Raphael", raphaelJob);

        //raphael's constructors ^^^

        Job ginoviJob = new Job("Toy Maker", 0.50, 0.00);

        Elf1 ginovi = new Elf1("Ginovi", ginoviJob);

        //Ginovi's constructors ^^^

        Job linguiniJob = new Job("Chief Wrapper", 0.50, 0.00);

        Elf1 linguini = new Elf1("Linguini", linguiniJob);

        //Linguini's constructors ^^^

        Job lilCanoliJob = new Job("toy maker", 0.50, 0.00);

        Elf1 lilCanoli = new Elf1("LilCanoli", lilCanoliJob);

        //LilCanoli's constructors ^^^

        Job aldolphoJob = new Job("Chief Sack Packer", 0.50, 0.00);

        Elf1 adolpho = new Elf1("Aldolpho", aldolphoJob);

        //Aldolpho's constructors ^^^

     //Toy Makers: tony, antoni, ginovi, lilCanoli
     //Wrappers: jeff, raphael, linguini
     //Sack Packers: francesco, frank, adolpho
        for(int i=0; i < 3; i++)
        {
          tonyJob.makeToy("Tony");
            System.out.println(" ");
          antoniJob.makeToy("Antoni");
            System.out.println(" ");
          jeffJob.wrapToy("Jeff");
            System.out.println(" ");
          francescoJob.packToy("Francesco");
            System.out.println(" ");
          ginoviJob.makeToy("Ginovi");
            System.out.println(" ");
          raphaelJob.wrapToy("Raphael");
            System.out.println(" ");
          frankJob.packToy("Frank");
            System.out.println(" ");
          lilCanoliJob.makeToy("LilCanoli");
            System.out.println(" ");
          linguiniJob.wrapToy("Linguini");
            System.out.println(" ");
          aldolphoJob.packToy("aldolpho");
            System.out.println(" ");
        }


    }
}
