import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class StringComparison {

// Java program to check if two strings have
// common substring

        static int MAX_CHAR = 26;

        // function to return true if strings have
        // common substring and no if strings have
        // no common substring
        static boolean twoStrings(String s1, String s2)
        {
            // vector for storing character occurrences
            //only use lowercase letters for this comparison
            s1 = s1.toLowerCase();
            s2 = s2.toLowerCase();
            boolean v[]=new boolean[MAX_CHAR];
            Arrays.fill(v,false);

            // increment vector index for every
            // character of str1
            for (int i = 0; i < s1.length(); i++)
                v[s1.charAt(i) - 'a'] = true;

            // checking common substring of str2 in str1
            for (int i = 0; i < s2.length(); i++)
                if (v[s2.charAt(i) - 'a'])
                    return true;
            System.out.println(v[2]);
            return false;
        }



    //Time complexity O(n)
    public static void main(String[] args) {
        System.out.println(twoStrings("S","sas"));
    }
}
