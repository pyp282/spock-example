package work;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TXTParse {
    public static void getWord(String text){
        String regex = "(\\b[a-zA-Z]+\\b)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }

    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\ypei\\Desktop\\blank.txt"));
        String text = "";
        String lineTxt ;
        while ((lineTxt = reader.readLine()) != null){
            text += lineTxt + " ";
        }

        getWord(text);
//        ArrayList
    }
}
