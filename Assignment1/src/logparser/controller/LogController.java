package logparser.controller;

import logparser.model.LogModel;
import logparser.service.SummaryCreator;
import logparser.view.LogView;

/**
 * Created by shahriar on 2/4/18.
 */
public class LogController {

    /**
     * This is the controller class
     */
    private LogModel model;
    private LogView view;
    private SummaryCreator summary;

    /**
     * Constructor for controller class
     */
    public LogController(LogModel model, LogView view){
        this.model= model;
        this.view= view;
    }

    public void displayModel(){
        view.printModel(model.getLogData());
    }

    /**
     * Generates the summary
     */
    public void generateSummaryLogs(boolean sortFlag){
        summary= new SummaryCreator();
        summary.generate(model.getLogData());
        summary.sortSummary(sortFlag);
    }

    /**
     * displays the summary
     */
    public void displaySummary(){
        view.printSummary(summary.getSummaryData());
    }


}
