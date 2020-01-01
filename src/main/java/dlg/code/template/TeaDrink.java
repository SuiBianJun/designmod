package dlg.code.template;

public class TeaDrink extends DrinkTemplate {

    @Override
    public void getWater() {
        System.out.println("add tea water");
    }

    @Override
    public void addDrink() {
        System.out.println("add tea");
    }

    @Override
    public void getDrink() {
        System.out.println("get tea");
    }
}
