public class Palindrome {
    public static void main(String[] args) {
        String input = "ara ara";
        System.out.println(isPalindrome(input));
    }
    public static boolean isPalindrome(String s) {
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }
            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }

            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))){
                return false;
            }
        }

        return true;
    }
}
