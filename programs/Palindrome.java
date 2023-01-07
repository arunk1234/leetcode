package programs;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("is palindrome : "+isPalindrome(10));
    }

    static boolean  isPalindrome(int x){
        int tempX = x;
        int rev = 0;

        if (x<0){
            return false;
        } else if (x==0) {
            return true;
        }

        while(x>0){
            int mod = x%10;
            rev = (rev*10+mod);
            x = x/10;
        }
        return rev==tempX;
    }

}
