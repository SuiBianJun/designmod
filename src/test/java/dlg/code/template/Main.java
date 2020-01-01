package dlg.code.template;

public class Main {

    public static void main(String[] args) {

        DrinkTemplate drinkTemplate = new MilkTeaDrink();
        drinkTemplate.create();

        drinkTemplate = new TeaDrink();
        drinkTemplate.create();

    }
}
