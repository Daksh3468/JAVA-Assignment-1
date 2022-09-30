// Name :- Daksh Bangoria
// Roll-no :-21ce007
// Aim :-Given a string, return a string made of the first 2 chars (if present), however include 
// first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" 
// yields "oz".
// startOz("ozymandias") → "oz"
// startOz("bzoo") → "z"
// startOz("oxx") → "o"
// Git-hub repository: https://github.com/Daksh3468/JAVA-Practical
import java.util.*;
public class Daksh1_2main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String:");
        String A=sc.nextLine();
        Daksh1_2 d2 = new Daksh1_2(A);//calling constructor of ClASS file.
        sc.close();
    }
}