package org.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Date dateTime = new Date();
        LocalDate dateOnly = LocalDate.now();
        LocalDate dateWithTimeAdded = dateOnly.plusDays(14);

        LocalDate futureDate = LocalDate.of(2024,3,22);
        int dateResult = dateOnly.compareTo(futureDate);
        if(dateResult < 0){
            System.out.println("Aktuelles Datum < angegebenes Datum!");
        }else if(dateResult > 0){
            System.out.println("Aktuelles Datum > angegebenes Dazum!");
        }else{
            System.out.println("Alles ist gleich!");
        }


        LocalDate firstDate = LocalDate.of(2024,4,21);
        LocalDate secondDate = LocalDate.of(2025,5,24);

        long daysDifference = ChronoUnit.DAYS.between(firstDate,secondDate);
        System.out.println("Unterschied zwischen den Tagen: " + daysDifference);


        //alles
        System.out.println(dateTime);
        // yy-mm-dd
        System.out.println(dateOnly);
        //14 tage später dateOnly
        System.out.println(dateWithTimeAdded);



    }
}