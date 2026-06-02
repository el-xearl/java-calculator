import services.CalculatorService;
import utils.Menu;

public class Main {

    public static void main(String[] args) {
        
        CalculatorService calculator = new CalculatorService();
        Menu menu = new Menu();

        menu.showMenu();

    }
}