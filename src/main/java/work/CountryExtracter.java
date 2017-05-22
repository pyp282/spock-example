package work;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountryExtracter {

    public static void extractCountries(String filepath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filepath));
        String line;
        String countryCode;

        while((line = reader.readLine()) != null){
            if(line.contains("countryKey")){
                countryCode = line.substring(line.indexOf(": \"") + 2, line.lastIndexOf(","));
                System.out.println("{" + countryCode + ", randomLetters(5)},");
            }
        }

        reader.close();
    }

    public static void main(String[] args) throws IOException {
        extractCountries("D:\\workfiles\\Godaddy\\Reseller\\markets.txt");
    }
}
