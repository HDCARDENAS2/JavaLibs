package com.learn.demo;

import java.io.BufferedReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.InetAddress;
import java.net.URI;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.UnknownHostException;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;
import java.net.http.HttpRequest;

public class NetLib {

    public static void main(String[] args) {

        try {
            InetAddress ip = InetAddress.getByName("www.google.com");
            System.out.println("IP Address of www.google.com: " + ip.getHostAddress());
        } catch (UnknownHostException e) {
            System.out.println("Could not resolve host: " + e.getMessage());
        }

        try {

            URL url = new URL("https://dog.ceo/api/breeds/image/random");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            try (BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error fetching data from URL: " + e.getMessage());
        }

        try {
            var client = HttpClient.newHttpClient();
            var request = HttpRequest.newBuilder()
                    .uri(URI.create("https://api.github.com/"))
                    .GET()
                    .build();

            var response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("Response from GitHub API: " + response.body());

        } catch (IOException | InterruptedException e) {
            System.out.println("Error fetching data from GitHub API: " + e.getMessage());
        }

    }
}
