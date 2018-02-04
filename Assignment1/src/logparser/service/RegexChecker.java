package logparser.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by shahriar on 2/1/18.
 */
public class RegexChecker {

  //  private String input;

    public RegexChecker(){

       // this.input=input;
        // Use method find()
    /*    while (matcher.find()) {     // find the next match
            System.out.println("find() found the pattern \"" + matcher.group()
                    + "\" starting at index " + matcher.start()
                    + " and ending at index " + matcher.end());
        }
*/

     //   new Parser(input).parse();
    }

    public static boolean isNotable(String input){

        String regex= "URI";

        Pattern pattern= Pattern.compile(regex);

        Matcher matcher= pattern.matcher(input);

        return matcher.find();
    }

    public static String findURI(String input){
        String regex= "URI=\\[.*\\]";

        Pattern pattern= Pattern.compile(regex);

        Matcher matcher= pattern.matcher(input);

        if (matcher.find()) {     // find the next match
            return input.substring(matcher.start()+5,matcher.end()-1);
        }else{
            return null;
        }

    }

    public static long findResponseTime(String input){
        String regex= "time=[0-9]+ms";

        Pattern pattern= Pattern.compile(regex);

        Matcher matcher= pattern.matcher(input);

        if (matcher.find()) {     // find the next match

            return Long.parseLong(input.substring(matcher.start()+5,matcher.end()-2));
        }else{
            return -999;
        }

    }

    public static int findTime(String input){
        String regex= "[0-9]{2}:[0-9]{2}:[0-9]{2},[0-9]{3}";

        Pattern pattern= Pattern.compile(regex);

        Matcher matcher= pattern.matcher(input);

        if (matcher.find()) {     // find the next match

            return Integer.parseInt(input.substring(matcher.start(),matcher.start()+2));
        }else{
            return -999;
        }

    }

    public static boolean findIsGET(String input){
        String regex= "G,";

        Pattern pattern= Pattern.compile(regex);

        Matcher matcher= pattern.matcher(input);

        return matcher.find();

    }

    public static boolean findIsPOST(String input){
        String regex= "P,";

        Pattern pattern= Pattern.compile(regex);

        Matcher matcher= pattern.matcher(input);

        return matcher.find();

    }
}
