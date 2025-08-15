package com.learn.demo;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TimeLib {

    public static void main(String[] args) {

        Date date = new Date();
        System.out.println("Current Date: " + date.toString());

        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String formattedDate = formatter.format(date);
        System.out.println("Formatted Date: " + formattedDate);

        LocalDate localDate = LocalDate.now();
        System.out.println("Current LocalDate: " + localDate.toString());

        LocalDateTime specificDate = LocalDateTime.now();
        System.out.println("Specific LocalDateTime: " + specificDate.toString());

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedLocalDateTime = specificDate.format(formatter2);
        System.out.println("Formatted LocalDateTime: " + formattedLocalDateTime);

        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("Europe/Madrid"));
        System.out.println("Current ZonedDateTime: " + zonedDateTime.toString());

    }
}
