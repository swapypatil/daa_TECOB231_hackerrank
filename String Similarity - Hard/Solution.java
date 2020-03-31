import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the stringSimilarity function below.
    static int stringSimilarity(String s) {
        int temp, sum = 0;
        String sub[] = new String[s.length()];

        for(int i=0; i<s.length(); i++){
            sub[i] = s.substring(i,s.length());
            temp = 0;
            for(int j=0; j<sub[i].length(); j++){
                if(sub[i].charAt(j) == s.charAt(j)){
                    temp++;
                }
                else{
                    break;
                }
            }
            sum += temp;
            System.out.println(sub[i]);
        }




        return sum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String s = scanner.nextLine();

            int result = stringSimilarity(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
