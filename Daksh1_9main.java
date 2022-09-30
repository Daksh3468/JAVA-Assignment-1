// Name :- Daksh Bangoria
// Roll-no :-21ce007
// Aim :-The problem is to check whether a given Sudoku solution is correct.
// Git-hub repository: https://github.com/Daksh3468/JAVA-Practical
import java.util.*;
public class Daksh1_9main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char[][] sudoku = new char[9][9];
        System.out.print("Enter the sudoku you want to be checked :\n");
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                sudoku[i][j] = s.next().charAt(0);
            }
        }
        System.out.println((Daksh1_9.isValidConfig(sudoku, 9) ? "YES" : "NO"));//calls the method isValidConfig of Daksh1_9 class file .
    }
}