public class Main {
    public static void main(String[] args) {
        ComputerCase theCase = new ComputerCase("Dell","2208","240");
        Monitor theMonitor = new Monitor("Acer","27inch Beast",
                "2540 x 1440",27);
        Motherboard theMotherboard = new Motherboard("Asus","BJ-200",
                "v2.11",6,4);

        PersonalComputer thePC = new PersonalComputer("Dell","2208",theCase,
                theMonitor,theMotherboard);
        //thePC.getMonitor().drawPixelArt(3,4,"Red");
        //thePC.getComputerCase().pressPowerButton();
        //thePC.getMotherboard().loadProgram("Windows OS");
        thePC.powerUp();
    }
}