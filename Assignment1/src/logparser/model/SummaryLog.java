package logparser.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by shahriar on 2/4/18.
 */
public class SummaryLog {

    /**
     * this is the model class for summary
     */
    private int time;
    private int GETCount;
    private int POSTCount;
    private int uriCount;
    private long totalResponseTime;
    private Set<String> uriSet;

    public SummaryLog(int time){
        this.time= time;
        uriSet= new HashSet<String>();
        GETCount=0;
        POSTCount=0;
        uriCount=0;
        totalResponseTime=0;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void addUri(String uri){
        uriSet.add(uri);
    }

    public void increaseGETCount() {
        this.GETCount++;
    }

    public void increasePOSTCount() {
        this.POSTCount++;
    }

    public void increaseUriCount() {
        this.uriCount++;
    }

    public void increaseTotalResponseTime(long responseTime) {
        this.totalResponseTime+=responseTime;
    }

    public int getTime() {
        return time;
    }

    public int getGETandPOSTCount() {
        return GETCount+POSTCount;
    }

    public int getPOSTCount() {
        return POSTCount;
    }

    public int getUriCount() {
        return uriCount;
    }

    public long getTotalResponseTime() {
        return totalResponseTime;
    }

    public String getTimeString(){

        String temp1="";
        String temp2="";
        int convertedTime1;
        int convertedTime2;

        if(time<12){
            temp1=".00 am";
            convertedTime1=time;
        }else if(time==12){
            temp1=".00 pm";
            convertedTime1=time;
        }else{
            temp1=".00 pm";
            convertedTime1=time%12;
        }

        if(time==23){
            temp2=".00 am";
            convertedTime2=12;
        }else if(time==11){
            temp2=".00 pm";
            convertedTime2=convertedTime1+1;
        }else {
            temp2=temp1;
            convertedTime2=(convertedTime1+1)%12;
        }

        return convertedTime1+temp1+" - "+convertedTime2+ temp2;
    }

    public String toString(){
      //  return "time: "+getTimeString()+" GET/POST count: "+ GETCount+"/"+POSTCount+" Unique Uri Count: "+uriSet.size()+" Total Response Time: "+totalResponseTime;
        return getTimeString()+"  |  "+ GETCount+"/"+POSTCount+"  |  "+uriSet.size()+"  |  "+totalResponseTime;
    }
}
