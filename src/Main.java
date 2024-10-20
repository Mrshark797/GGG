import Controller.Controller;
import View.View;
import Model.Model;
public class Main {
    public static void main(String[] args){
        Model model = new Model();
        Controller controller = new Controller(model);
        View view = new View(controller);
        view.createWindow();
    }
}
