package logparser;

/**
 * Created by shahriar on 2/4/18.
 */
public class LogController {

    private LogModel model;
    private LogView view;

    public LogController(LogModel model, LogView view){
        this.model= model;
        this.view= view;
    }

    public void displayModel(){
        view.printModel(model.getLogData());
    }
}
