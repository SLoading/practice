import java.io.*;
import java.util.*;
import java.time.*;
import java.time.format.*;

public class Solution {

    /*
	 * Дано время: часы:минуты:секунды(AM/PM)
	 * Вывести время в формате 24-часа.
	 * Пример: 06:15:11PM - 18:15:11	
	 
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
      
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("out.txt"));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);

        bw.close();
    }
}
