package logparser.view;

import logparser.model.Log;
import logparser.model.SummaryLog;

import java.util.ArrayList;

/**
 * Created by shahriar on 2/4/18.
 */
public class LogView {


    public LogView(){

    }

    public void printModel(ArrayList<Log> allLogs){

        for (Log log: allLogs){
            System.out.println(log);
        }
    }

    public void printSummary(ArrayList<SummaryLog> summary){
        for (SummaryLog summaryLog: summary){
            System.out.println(summaryLog);
        }
    }
}
