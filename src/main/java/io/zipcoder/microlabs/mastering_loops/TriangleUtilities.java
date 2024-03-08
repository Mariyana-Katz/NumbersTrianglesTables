package io.zipcoder.microlabs.mastering_loops;

import java.util.Scanner;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String result ="";
        for (int i = 1; i <=numberOfRows; i++) {
            result =result + getRow(i)+"\n";
        }
        return result;
    }

    public static String getRow(int numberOfStars) {
        String result ="";
        for (int i = 0; i < numberOfStars; i++) {
            result = result + "*";
        }
        return result;
    }

    public static String  getSmallTriangle() {
       String result = "";
        for(int i = 1; i<=5; i++){
            result= result + getRow(i) + "\n";
        }
        return result;
    }

   public static String  getLargeTriangle() {
       String result = "";
       for(int i = 1; i<=15; i++){
           result= result + getRow(i) + "\n";
       }
       return result;
   }

    }

