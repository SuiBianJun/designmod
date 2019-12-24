package dlg.code.proxy.cglibproxy;

public class Main {

    public static void main(String[] args) {
        Render render = (Render) new Middle().getInstance(new Render());
        render.render();
    }

}
