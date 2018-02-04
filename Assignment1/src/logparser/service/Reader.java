package logparser.service;

import logparser.model.Log;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by shahriar on 2/1/18.
 */
public class Reader {

    private Scanner scanner;
    private RegexChecker checker;
    private ArrayList <Log> allLogs;

    public Reader(String fileName){

        try {
            scanner= new Scanner(new FileReader(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        checker= new RegexChecker();
        allLogs= new ArrayList<Log>();
    }

    public ArrayList<Log> read(){

        while (scanner.hasNext()){
            String line= scanner.nextLine();

            Log log= new Parser(line).parse();

            if(log!=null){
                allLogs.add(log);
            }
        }
        return allLogs;
    }
}
