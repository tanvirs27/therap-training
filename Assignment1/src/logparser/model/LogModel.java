package logparser.model;

import logparser.service.Reader;

import java.util.ArrayList;

/**
 * Created by shahriar on 2/4/18.
 */
public class LogModel {

    /**
     * This is the Model class of this project.
     * All data of the logs can be found here
     */

    private ArrayList<Log> allLogs;
    private String fileName;
    private Reader reader;

    public LogModel(String fileName){

        allLogs= new ArrayList<Log>();
        this.fileName= fileName;
        reader= new Reader(fileName);

        allLogs= reader.read();
    }

    public ArrayList<Log> getLogData(){
        return allLogs;
    }


}
