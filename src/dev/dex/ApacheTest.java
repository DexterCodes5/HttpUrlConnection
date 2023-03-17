package dev.dex;

import org.apache.http.client.methods.*;
import org.apache.http.impl.client.*;

import java.io.*;

public class ApacheTest {

    public static void main(String[] args) {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet request = new HttpGet("http://example.org");
        request.addHeader("User-Agent", "Chrome");

        try (CloseableHttpResponse response = httpClient.execute(request)) {
            System.out.println("response code = " + response.getStatusLine().getStatusCode());
            BufferedReader inputStream = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
            String s;
            while ((s = inputStream.readLine()) != null){
                System.out.println(s);
            }
            inputStream.close();

        }
        catch (IOException ex) {
            ex.printStackTrace();
        }


    }
}
