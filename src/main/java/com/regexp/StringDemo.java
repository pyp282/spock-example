package com.regexp;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringDemo {

    public static String cutXmlAttr(String value){
        String regex = "(?<=Domains)[\\s\\w.=\"]+";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(value);
        if(matcher.find()){
            String xmlns = matcher.group(0);
            System.out.println(xmlns);
        }
        return value.replaceFirst(regex, "");
    }

    public static void main(String[] args) {

        String xmlResponse = "<?xml version=\"1.0\" encoding=\"utf-8\"?><soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\"><soap:Body><NameGenDBResponse xmlns=\"http://wildwestdomains.com/webservices/\"><NameGenDBResult><response>\n" +
                "  <result code=\"1000\"/>\n" +
                "  <resdata>\n" +
                "<Domains xmlns=\"DomainsBot.FirstImpact\"><Domain><Name>mytestsphere.info</Name><Rate>0</Rate><IsTypedName>false</IsTypedName></Domain><Domain><Name>mytrialdomain.net</Name><Rate>0</Rate><IsTypedName>false</IsTypedName></Domain><Domain><Name>mytrialdomain.info</Name><Rate>0</Rate><IsTypedName>false</IsTypedName></Domain><Domain><Name>mytestrealm.org</Name><Rate>0</Rate><IsTypedName>false</IsTypedName></Domain><Domain><Name>mytestempire.net</Name><Rate>0</Rate><IsTypedName>false</IsTypedName></Domain><Domain><Name>mytestempire.com</Name><Rate>0</Rate><IsTypedName>false</IsTypedName></Domain></Domains>\n" +
                "  </resdata>\n" +
                "</response></NameGenDBResult></NameGenDBResponse></soap:Body></soap:Envelope>";

        String innerXml = xmlResponse.split("<resdata>\\n")[1].split("</resdata>")[0];
//        String innerXml = xmlResponse.split("<resdata>\\n")[1];

        String newInnerXml = cutXmlAttr(innerXml);
        System.out.println(newInnerXml);

    }
}
