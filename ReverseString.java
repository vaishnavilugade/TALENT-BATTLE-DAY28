import java.util.*;
public class ReverseString {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter string:\n ");
        String v = in.nextLine();
        System.out.println("reverse string:");
        for (int i=v.length()-1; i>=0; i--){
            System.out.print(v.charAt(i));
        }   
    }
}