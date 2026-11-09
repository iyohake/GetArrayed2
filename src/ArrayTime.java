import java.util.Random;
import java.util.Scanner;

public class ArrayTime {
    static void main() {
        Random rnd = new Random();
        int increase = 0;
        int val = rnd.nextInt(100);
        int sum = 0;
        int val2 = rnd.nextInt(100) + 1;
        Scanner in = new Scanner(System.in);
        int imp = SafeInput.getRangedInt(in, "Gimme a value between 1 and 100", 1, 100);
        int found = 0;


        int[] dataPoints = new int[100];
        for (int move = 0; move < 100; move++){
            val = rnd.nextInt(100) + 1;
            dataPoints[increase] = val;
            sum = sum + val;
            System.out.print(val + " | ");
            // System.out.println("This data point for increment " + increase +" is " + val +".");
            increase = increase + 1;
        }

        double avg = sum / 100;

        System.out.println("The sum of the values is " + sum + ", and the average of the values is " + avg + ".");
        increase = 0;
        for (int move = 0; move < 100; move++){
            if (dataPoints[increase] == imp){
                found = found + 1;
            }
            increase = increase + 1;
        }
        System.out.println("The value you entered, " + imp + " appeared in the randomly generated set " + found + "times.");





    }
}
