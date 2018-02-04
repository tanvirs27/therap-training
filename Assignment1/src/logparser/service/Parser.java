package logparser.service;

import logparser.model.Log;

/**
 * Created by shahriar on 2/1/18.
 */
public class Parser {

    /**
     * this class parse logs by using RegexChecker class
     */
    private String content;
    private Log log;

    public Parser(String content){
        this.content= content;
    }

    public Log parse(){

        Log log= new Log();

        if(RegexChecker.isNotable(content)) {


            log.setURI(RegexChecker.findURI(content)) ;

            log.setResponseTime(RegexChecker.findResponseTime(content));
            log.setTime(RegexChecker.findTime(content));

            log.setIsGET(RegexChecker.findIsGET(content));
            log.setIsPOST(RegexChecker.findIsPOST(content));

            return log;
        }

        return null;
    }
}
