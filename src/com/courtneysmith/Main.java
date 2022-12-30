package com.courtneysmith;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Main {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://example.org");
            //URL Connection class way of connecting to URLS
            URLConnection urlConnection = url.openConnection();
//            urlConnection.setDoOutput(true);
//            urlConnection.connect();
//            BufferedReader inputStream = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
//            //reading just the headers from the web page
//            Map<String, List<String>> headerFields = urlConnection.getHeaderFields();
//
//            for(Map.Entry<String, List<String>> entry : headerFields.entrySet()){
//                String key = entry.getKey();
//                List<String> value = entry.getValue();
//                System.out.println("-----key = " + key);
//                for(String string : value){
//                    System.out.println("Value = " + value);
//                }
//            }

//            String line = "";
//            while (line != null){
//                line = inputStream.readLine();
//                System.out.println(line);
//            }
//            inputStream.close();

            // below is the input stream way of connecting to a URL
//            BufferedReader inputStream = new BufferedReader(new InputStreamReader(url.openStream()));
//
//            String line = "";
//            while (line != null){
//                line = inputStream.readLine();
//                System.out.println(line);
//            }
//            inputStream.close();
//            URI uri = url.toURI();
//           URI uri = new URI("db://username:password@myserver.com:5000/catalogue/phones?os=android#samsung");
//           URI uri = new URI("http://username:password@myserver.com:5000/catalogue/phones?os=android#samsung");
//            URI baseUri = new URI("http://username:password@mynewserver.com:5000");
//            URI uri1 = new URI("/catalogue/phones?os=android#samsung"); // relative URI
//            URI uri2 = new URI("/catalogue/tvs?manufacturer=samsung"); // relative URI
//            URI uri3 = new URI("/stores/locations?zip=12345"); // relative URI
//            URI resolvedUri1 = baseUri.resolve(uri1);
//            URI resolvedUri2 = baseUri.resolve(uri2);
//            URI resolvedUri3 = baseUri.resolve(uri3);
//            URL url1 = resolvedUri1.toURL();
//            System.out.println("URL 1 = " + url1);
//            URL url2 = resolvedUri2.toURL();
//            System.out.println("URL 2 = " + url2);
//            URL url3 = resolvedUri3.toURL();
//            System.out.println("URL 3 = " + url3);
//
//            URI relativizedURI = baseUri.relativize(resolvedUri2);
//            System.out.println("Relativized URI = " + relativizedURI);
//          //  URI uri = new URI("hello");
//            System.out.println("Scheme = " + uri.getScheme());
//            System.out.println("Scheme-specific part = " + uri.getSchemeSpecificPart());
//            System.out.println("Authority = " + uri.getAuthority());
//            System.out.println("User info = " + uri.getUserInfo());
//            System.out.println("Host = " + uri.getHost());
//            System.out.println("Port = " + uri.getPort());
//            System.out.println("Path = " + uri.getPath());
//            System.out.println("Query = " + uri.getQuery());
//            System.out.println("Fragment = " + uri.getFragment());
//        }catch (URISyntaxException e){
//            System.out.println("URI Bad Syntax: " + e.getMessage());
        }catch (MalformedURLException e){
            System.out.println("URL Malformed: " + e.getMessage());
        }catch (IOException e){
            System.out.println("IOException: " + e.getMessage());
        }
    }
}