package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 4; i++) {

            for (int j = 1; j <= 4; j++) {
                int number = i * j;
                if (number < 10) {
                    sb.append("  "+number+" ").append("|");
                }
                else {
                    sb.append(" "+number+" ").append("|");
                }
            }
            sb.append("\n");

        }
        return sb.toString();
    }




    public static String getLargeMultiplicationTable() {

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 10; i++) {

            for (int j = 1; j <= 10; j++) {
                int number = i * j;
                if (number < 10) {
                    sb.append("  "+number+" ").append("|");
                }
                else if(number>9&&number<100){
                    sb.append(" "+number+" ").append("|");
                }
                else {
                    sb.append(number+" ").append("|");
                }
            }
            sb.append("\n");

        }
        return sb.toString();
    }

   public static String getMultiplicationTable(int tableSize) {
       StringBuilder sb = new StringBuilder();

       for (int i = 1; i <= tableSize; i++) {

           for (int j = 1; j <= tableSize; j++) {
               int number = i * j;
               if (number < 10) {
                   sb.append("  "+number+" ").append("|");
               }
               else if(number>9&&number<100){
                   sb.append(" "+number+" ").append("|");
               }
               else {
                   sb.append(number+" ").append("|");
               }
           }
           sb.append("\n");

       }
       return sb.toString();
   }

    }

