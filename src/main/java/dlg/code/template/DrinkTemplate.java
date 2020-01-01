package dlg.code.template;

public abstract class DrinkTemplate {

    public final void create(){
        getWater();
        addDrink();
        getDrink();
    }

    void getWater(){}

    void addDrink(){}

    void getDrink(){}

}
