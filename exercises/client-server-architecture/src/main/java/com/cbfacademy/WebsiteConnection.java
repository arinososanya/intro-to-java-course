package com.cbfacademy;

import java.net.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class WebsiteConnection {
    public static void main(String[] args) throws Exception {
        HttpURLConnection connection = new HttpURLConnection();
        try (BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
            URL myURL = new URI("https://codingblackfemales.com/").toURL();
            URLConnection myURLConnection = myURL.openConnection();
            myURLConnection.connect();
            String contentType = myURLConnection.getContentType();
            System.out.println(contentType); // what does contentType do?
        }
catch (MalformedURLException e) {
            System.out.println(e.getMessage());
}
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
