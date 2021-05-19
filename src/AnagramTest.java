import java.util.Arrays;
public class AnagramTest {

    public static void main(String[] args) {
        //Simple Program to check if two strings are anagrams.
        String A = "anagram";
        String B = "nagaram";
        System.out.println(check_if_anagram(A, B));
    }

    static Boolean check_if_anagram(String A, String B){
        //My Approach involves converting the string into character arrays.
        // Step 1. Convert to Char Arrays
        double max_len = Math.pow(10, 4) * 5;
        Boolean result = true;
        char[] a_char = A.toCharArray();
        char[] b_char = B.toCharArray();
        //Step 2. Compare the length of the strings.
        int A_length = A.length();
        int B_length = B.length();

        if(A_length != B_length){
            return false;
        }
        //Step 3. Sort the arrays so that we can have the Strings been represented in the same order.
        if((A_length >= 1 && A_length <= max_len && (B_length >= 1 && B_length <= max_len))){
            Arrays.sort(a_char);
            Arrays.sort(b_char);
            //Step 4 Compare the Char Arrays values.
            //option 1 compare String Values of sorted Arrays.
            if (String.valueOf(a_char).equals(String.valueOf(b_char))){
                return true;
            }else{
            return false;
            }
            //Option 2. Use Arrays Equal Function.
            //System.out.println("values " +Arrays.equals(a_char,b_char));
            ////return Arrays.equals(a_char,b_char);

            //Option 3. Loop through Each Character in the Char Array.
//            for(int i = 0; i < a_char.length; i++){
//                if(a_char[i] != b_char[i]){
//                    return false;
//                }
//            }
//        }
    }
        return result;
}
}
