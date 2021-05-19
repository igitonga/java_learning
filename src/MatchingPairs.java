import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        ar = ar.stream().sorted().collect(toList());
        //Arrays.sort(ar);
        int pairs = 0;
        for(int a = 0;a<n;a+=2){
            if(ar.get(a).equals(ar.get(a + 1))){
                pairs++;
            }
        }
        return pairs;

    }

    public static void main(String[] args)  {

        List<Integer> ar = Stream.of(4,5,5,5,6,6,4,1,4,4,3,6,6,3,6,1,4,5,5,5)
                .collect(toList());
        int n  = ar.size();
        int result = Result.sockMerchant(n, ar);


        System.out.println(result);
    }
}
