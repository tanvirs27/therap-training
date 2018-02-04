package logparser;

/**
 * Created by shahriar on 2/1/18.
 */
public class Log {

    private String content;
    private String time;
    private Boolean isGET;
    private Boolean isPOST;
    private long responseTime; //TODO: should be changed to long
    private String URI;

    public void setTime(String time) {
        this.time = time;
    }

    public void setIsGET(Boolean isGET) {
        this.isGET = isGET;
    }

    public void setIsPOST(Boolean isPOST) {
        this.isPOST = isPOST;
    }

    public void setResponseTime(long responseTime) {
        this.responseTime = responseTime;
    }

    public void setURI(String URI) {
        this.URI = URI;
    }

    public Log(){

    }

    public Log(String content){
        this.content= content;
    }

    public String toString(){
        return time+" "+ isGET+" "+isPOST+" "+responseTime+" "+URI;
    }
}
