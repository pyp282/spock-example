package work;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class DomainFilter {

    public static String getTLD(String line){
        return line.substring(line.indexOf("."), line.lastIndexOf(")"));
    }

    public static void main(String[] args)throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader("D:\\workfiles\\Godaddy\\DailyWork\\20170508\\DomainInfoTime\\TEST2017-05-05_RegisteredTLDs.txt"));
        StringBuffer sb = new StringBuffer();
        String line ;
        int count = 0;

//        while ((line = reader.readLine()) != null){
//            if(line.startsWith("FAILED: ")){
//                try {
//                    sb.append(getTLD(line));
//                    sb.append(",  ");
//                } catch (Exception e) {
//                    System.out.println(line);
//                }
//            }
//        }

        while (reader.readLine() != null){
            count++;
        }

        reader.close();

//        BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\workfiles\\Godaddy\\DailyWork\\20170428\\noprivacydomains.txt"));
//        writer.write(sb.toString());
//        writer.close();
        System.out.println(count);
    }
}
