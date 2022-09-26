

package oops;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;


import javax.net.ssl.HttpsURLConnection;

public class Notification{
    //creating function
    public static void sendSms(String message,String number)
    {
// using try catch to handle the errors

        try
        {
            // creating variables
            String apiKey="wHzqLoReBz20xnUyzvjkeUAINuyOPSEv73Qs3jYXqjmLJT2OF4FPf5cCv7zC";
            String sendId="CHKSMS";
            String language="english";
            // p stands for promotional messagges
            String route="p";

            //using urlencoder to encode url
            message=URLEncoder.encode(message, "UTF-8");

            String myUrl="https://www.fast2sms.com/dev/bulk?authorization="+apiKey+"&sender_id="+sendId+"&message="+message+"&language="+language+"&route="+route+"&numbers="+number;

            //******************************************************************************************************************
            //sending get request using java

            URL url=new URL(myUrl);

            HttpsURLConnection con=(HttpsURLConnection)url.openConnection();


            con.setRequestMethod("GET");

            con.setRequestProperty("User-Agent", "Mozilla/5.0");
            con.setRequestProperty("cache-control", "no-cache");


            int code=con.getResponseCode();

            System.out.println("Response code : "+code);

            // using  to read the lines
            StringBuffer response=new StringBuffer();

            BufferedReader br=new BufferedReader(new InputStreamReader(con.getInputStream()));

            while(true)
            {
                String line=br.readLine();
                if(line==null)
                {
                    break;
                }
                response.append(line);
            }

            System.out.println(response);


        }catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

    }
    // main function
    public static void main(String[] args) {


        //calling function from above
       Notification.sendSms("You have successfully registered your flight. ", "8755227406");

    }
}

