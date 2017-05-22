package work;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ClassifyDomains {
    public static void classify(String filepath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filepath));
        int count = 0;
        String line;
        StringBuilder sb = new StringBuilder();

        while ((line = reader.readLine()) != null){

            if(count % 10 == 0){
                sb.append("\r\n");
            }
            sb.append(line.trim() + ", ");
            count++;
        }

        System.out.println(sb.toString());
    }

    public static void main(String[] args) throws IOException {
        classify("D:/domains.txt");
    }
}
