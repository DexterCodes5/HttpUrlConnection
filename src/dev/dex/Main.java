package dev.dex;

import java.io.*;
import java.net.*;

public class Main {

    public static void main(String[] args) {
        try {
//            URL url = new URL("http://example.org/somepage.html");
            URL url = new URL("https://www.flickr.com/services/feeds/photos_public.gne?tags=dogs");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("User-Agent", "Chrome");
            conn.setReadTimeout(30000);

            int status = conn.getResponseCode();
            System.out.println("Status: " + status);

            if (status != 200) {
                System.out.println("Not good");
                System.out.println(conn.getResponseMessage());
                return;
            }

            BufferedReader inputStream = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String s;
            while ((s = inputStream.readLine()) != null){
                System.out.println(s);
            }
            inputStream.close();




//            URLConnection urlConnection = url.openConnection();
//            urlConnection.setDoOutput(true);
//            urlConnection.connect();
//
//            inputStream = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
//
//            Map<String, List<String>> headerFields = urlConnection.getHeaderFields();
//
//            for (var elem: headerFields.keySet()) {
//                System.out.println("key: " + elem + ", value: " + headerFields.get(elem));
//            }
//            String s;
//            while ((s = inputStream.readLine()) != null){
//                System.out.println(s);
//            }
//            inputStream.close();

//            URI uri = url.toURI();
//            System.out.println ("Scheme = " + uri.getScheme ());
//            System.out.println ("Scheme-specific part = " + uri.getSchemeSpecificPart());
//            System.out.println ("Authority = " + uri.getAuthority());
//            System.out.println ("User Info = " + uri.getUserInfo());
//            System.out.println ("Host = " + uri.getHost());
//            System.out.println ("Port = " + uri.getPort());
//            System.out.println ("Path = " + uri.getPath());
//            System.out.println ("Query = " + uri.getQuery());
//            System.out.println ("Fragment = " + uri.getFragment());

//            URI uri = new URI("http://username:password@myserver.com:5000/catalogue/phones?os=android#samsung");
//            URI baseUri = new URI("http://username:password@mynewserver.com:5000");
//            URI uri1 = new URI("/catalogue/phones?os=android#samsung");
//            URI uri2 = new URI("/catalogue/tv?manufacturer=samsung");
//            URI uri3 = new URI("/stores/locations?zip=12345");
//            URI absoluteUri1 = baseUri.resolve(uri1);
//            URI absoluteUri2 = baseUri.resolve(uri2);
//            URI absoluteUri3 = baseUri.resolve(uri3);
//
//            URL url1 = absoluteUri1.toURL();
//            System.out.println("URL 1 = " + url1);
//            URL url2 = absoluteUri2.toURL();
//            System.out.println("URL 2 = " + url2);
//            URL url3 = absoluteUri3.toURL();
//            System.out.println("URL 3 = " + url3);

//            URI relativeUri = baseUri.relativize(absoluteUri1);
//            System.out.println("Relative URI = " + relativeUri);
//
//        }
        }
        catch (MalformedURLException ex) {
            ex.printStackTrace();
        }
//        catch (URISyntaxException ex) {
//            ex.printStackTrace();
//        }
        catch (IOException ex) {
            ex.printStackTrace();
        }


    }
}
