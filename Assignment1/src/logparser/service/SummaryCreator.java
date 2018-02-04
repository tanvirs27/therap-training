package logparser.service;

import logparser.model.Log;
import logparser.model.SummaryLog;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Created by shahriar on 2/4/18.
 */
public class SummaryCreator {

    private ArrayList<SummaryLog> summary;

    public SummaryCreator(){
        summary= new ArrayList<SummaryLog>();

    }

    public void generate(ArrayList<Log> allLogs){

        for (Log log: allLogs){

            int index= getLogIndex(log);

            if(index==-1){
                summary.add(new SummaryLog(log.getTime()));
                updateSummary(summary.size()-1,log);
            }else{
                updateSummary(index, log);
            }
        }
    }

    private int getLogIndex(Log log){
        for (int i=0;i<summary.size();i++){
            if(summary.get(i).getTime()==log.getTime()){
                return i;
            }
        }
        return -1;
    }

    private void updateSummary(int index, Log log){

        SummaryLog summaryLog= summary.get(index);

        summaryLog.addUri(log.getURI());
        summaryLog.increaseTotalResponseTime(log.getResponseTime());

        if(log.getIsGET()){
            summaryLog.increaseGETCount();
        }else if(log.getIsPOST()){
            summaryLog.increasePOSTCount();
        }
    }

    public ArrayList<SummaryLog> getSummaryData(){

        return summary;
    }

    public void sortSummary(boolean flag){

        if(flag) {
            summary.sort(new Comparator<SummaryLog>() {
                @Override
                public int compare(SummaryLog o1, SummaryLog o2) {
                    return o2.getGETandPOSTCount() - o1.getGETandPOSTCount();
                }
            });
        }else{
            summary.sort(new Comparator<SummaryLog>() {
                @Override
                public int compare(SummaryLog o1, SummaryLog o2) {
                    return o1.getTime() - o2.getTime();
                }
            });
        }
    }
}
