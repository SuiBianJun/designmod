package dlg.code.template;

public class MilkTeaDrink extends DrinkTemplate {

    @Override
    public void getWater() {
        System.out.println("add milk tea drink water");
    }

    @Override
    public void addDrink() {
        System.out.println("add milk tea");
    }

    @Override
    public void getDrink() {
        System.out.println("get milk tea drink");
    }
}
