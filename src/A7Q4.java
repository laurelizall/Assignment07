
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author halll7908
 */
public class A7Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        int[] marks = new int[10];

        System.out.println("Please enter 10 marks on separate lines.");
        for (int i = 0; i < marks.length; i++) { // set array's variable values
            marks[i] = input.nextInt();
        }
        // code comparing the smallest
        for (int ii = 0; ii < marks.length; ii++) {
            for (int i = 0; i < 9; i++) {
                int nxt = i + 1; // takes next variable
                int order; // holds variable
                if (marks[i] > marks[nxt]) { // ascending sort
                    order = marks[i]; // swap elements
                    marks[i] = marks[nxt];
                    marks[nxt] = order;
                }
            }
        }
        // print out in ascending order
        System.out.println("Least to Greatest: ");
        for (int asc = 0; asc < 10; asc++) {
            System.out.println(marks[asc]);
        }
    }
}
