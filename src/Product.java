public class Product {
    private String model;
    private String manufacturer;
    private int width;
    private int height;
    private int depth;

    public Product(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }
}

class Monitor extends Product{
    private int size;
    private String resolution;

    public Monitor(String manufacturer, String model) {
        super(manufacturer, model);
    }

    public Monitor(String manufacturer, String model, String resolution, int size) {
        super(manufacturer, model);
        this.resolution = resolution;
        this.size = size;
    }
    public void drawPixelArt(int x, int y, String color){
        System.out.printf("Drawing pixel at %d,%d in color %s %n",x,y,color
        );
    }
}


class Motherboard extends Product{
    private int ramSlots;
    private int cardSlots;
    private String bios;
    public Motherboard(String manufacturer, String model) {
        super(manufacturer, model);
    }

    public Motherboard(String manufacturer, String model, String bios, int cardSlots, int ramSlots) {
        super(manufacturer, model);
        this.bios = bios;
        this.cardSlots = cardSlots;
        this.ramSlots = ramSlots;
    }

    public void loadProgram(String programName){
        System.out.println("Program " + programName + " is now loading...");
    }
}

class ComputerCase extends Product{
    private String powerSupply;

    public ComputerCase(String manufacturer, String model) {
        super(manufacturer, model);
    }

    public ComputerCase(String manufacturer, String model, String powerSupply) {
        super(manufacturer, model);
        this.powerSupply = powerSupply;
    }
    public void pressPowerButton(){
        System.out.println("Power button pressed");
    }
}