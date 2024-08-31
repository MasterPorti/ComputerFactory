public class PersonalComputer extends Product{
    private ComputerCase computerCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PersonalComputer(String manufacturer, String model, ComputerCase computerCase, Monitor monitor, Motherboard motherboard) {
        super(manufacturer, model);
        this.computerCase = computerCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    private void drawLogo(){
        monitor.drawPixelArt(1200,50,"yellow");
    }

    public void powerUp(){
        computerCase.pressPowerButton();
        drawLogo();
    }


}
