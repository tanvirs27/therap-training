package logparser.view;

import logparser.model.Log;
import logparser.model.SummaryLog;

import java.util.ArrayList;

/**
 * Created by shahriar on 2/4/18.
 */
public class LogView {


    /**
     * This is the view class of the project
     * all kind of display is kept here
     */

    public void printModel(ArrayList<Log> allLogs){

        for (Log log: allLogs){
            System.out.println(log);
        }
    }

    public void printSummary(ArrayList<SummaryLog> summary){

        System.out.println("Time  | GET/POST Count  | Total Unique URI Count  | Total Response Time");
        for (SummaryLog summaryLog: summary){
            System.out.println(summaryLog);
        }
    }
}
