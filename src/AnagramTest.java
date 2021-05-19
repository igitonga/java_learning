import java.util.Arrays;

public class AnagramTest {

    public static void main(String[] args) {
        String A = "anagram";
        String B = "nagaram";
        System.out.println(check_if_anagram(A, B));
    }

    static Boolean check_if_anagram(String A, String B){
        double max_len = Math.pow(10, 4) * 5;
        Boolean result = true;
        char[] a_char = A.toCharArray();
        char[] b_char = B.toCharArray();
        int A_length = A.length();
        int B_length = B.length();

        if(A_length != B_length){
            return false;
        }
        if((A_length >= 1 && A_length <= max_len && (B_length >= 1 && B_length <= max_len))){
            Arrays.sort(a_char);
            Arrays.sort(b_char);
            for(int i = 0; i < a_char.length; i++){
                if(a_char[i] != b_char[i]){
                    return false;
                }
            }
        }
        return result;
    }
}