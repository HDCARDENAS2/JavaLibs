package com.learn.demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class IOLib {

    public static void main(String[] args) {

        String fileOut = "src/main/resources/output.txt";

        File file = new File(fileOut);
        if (file.exists()) {
            if (!file.delete()) {
                System.err.println("Failed to delete existing file: " + fileOut);
            }
        }

        try (FileWriter fw = new FileWriter(fileOut);
                BufferedWriter bw = new BufferedWriter(fw)) {

            bw.write("Hello, World!");
            bw.newLine();
            bw.write(new Date().toString());
            bw.newLine();
            bw.write("This is a test of the IOLib class.");

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileReader fr = new FileReader(fileOut); BufferedReader br = new BufferedReader(fr)) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
