package logparser.model;

/**
 * Created by shahriar on 2/1/18.
 */
public class Log {

    /**
     * Model class for Log data
     */

    private int time;
    private Boolean isGET;
    private Boolean isPOST;
    private long responseTime;
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

    public int getTime() {
        return time;
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
