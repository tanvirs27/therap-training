package logparser.app;

import logparser.controller.LogController;
import logparser.model.LogModel;
import logparser.view.LogView;

/**
 * Created by shahriar on 2/1/18.
 */
public class LogParser {

    public static void main(String[] args){

        LogModel model= new LogModel(args[0]);

        boolean sortFlag=false;
        if(args.length>1 && args[1].equals("--sort")){
            sortFlag=true;
        }

        LogView view= new LogView();

        LogController controller= new LogController(model, view);

        controller.displayModel();

        controller.generateSummaryLogs(sortFlag);
        controller.displaySummary();
    }
}
