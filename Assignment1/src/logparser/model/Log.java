package logparser.model;

/**
 * Created by shahriar on 2/1/18.
 */
public class Log {

    private String content;
    private int time;
    private Boolean isGET;
    private Boolean isPOST;
    private long responseTime; //TODO: should be changed to long
    private String URI;

    public void setTime(int time) {
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

    public int getTime() {
        return time;
    }

    public String getContent() {
        return content;
    }

    public Boolean getIsGET() {
        return isGET;
    }

    public Boolean getIsPOST() {
        return isPOST;
    }

    public long getResponseTime() {
        return responseTime;
    }

    public String getURI() {
        return URI;
    }

    public String toString(){
        return time+" "+ isGET+" "+isPOST+" "+responseTime+" "+URI;
    }
}
