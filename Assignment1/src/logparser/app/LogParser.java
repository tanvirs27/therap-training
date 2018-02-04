package logparser.app;

import logparser.controller.LogController;
import logparser.model.LogModel;
import logparser.view.LogView;

/**
 * Created by shahriar on 2/1/18.
 */
public class LogParser {

    /**
     * This is the main class. From here code will run
     */
    public static void main(String[] args){

        /**
         * args[0] indicates the name of the input file
         */
        LogModel model= new LogModel(args[0]);

        /**
         * args[1] indicates if the output should be sorted
         * it is optional
         */
        boolean sortFlag=false;
        if(args.length>1 && args[1].equals("--sort")){
            sortFlag=true;
        }

        LogView view= new LogView();

        LogController controller= new LogController(model, view);

      //  controller.displayModel();

        controller.generateSummaryLogs(sortFlag);
        controller.displaySummary();
    }
}
