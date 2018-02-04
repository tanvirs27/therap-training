package logparser;

/**
 * Created by shahriar on 2/1/18.
 */
public class LogParser {

    public static void main(String[] args){

        LogModel model= new LogModel(args[0]);
        LogView view= new LogView();

        LogController controller= new LogController(model, view);

        controller.displayModel();
    }
}
