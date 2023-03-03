import java.util.Scanner;

public class Q8_Vowel_Consonet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.next();
        char ch = word.charAt(0);
        char[] vowel = {'A','E','I','O','U','a','e','i','o','u'};
        boolean flag= false;
        for(int i=0; i<vowel.length; i++){
            if(ch==vowel[i]){
                System.out.println("Input letter is Vowel");
                flag = true;
                break;
            }
        }
        if(flag==false && (ch>=65 && ch<=90) || (ch>=97 && ch<=122)){
            System.out.println("Input letter is Consonant");
        }else if(flag==false){
            System.out.println("Wrong Input");
        }
    }
}
