package programs;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("is palindrome : "+isPalindrome(10));
    }

    static boolean  isPalindrome(int x){
        int tempX = x;
        int rev = 0;

        if (x<0 || (x % 10 == 0 && x != 0)){
            return false;
        }

        while(x>0){
            rev = (rev*10+(x%10));
            x = x/10;
        }
        return rev==tempX;
    }

}
