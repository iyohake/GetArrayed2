import java.util.Random;
import java.util.Scanner;

public class ArrayTime {
    public static double getAverage(double values[], String prompt){
        double sums = 0;
        for(int count = 0; count < values.length; count++){
            sums = values[count] + sums;
        }
        double avg2 = sums / values.length;
        return avg2;
    }
    static void main() {
        Random rnd = new Random();
        int increase = 0;
        int val = rnd.nextInt(100);
        int sum = 0;
        int val2 = rnd.nextInt(100) + 1;
        Scanner in = new Scanner(System.in);
        boolean yeah2 = false;
        boolean yeah3 = false;
        int imp = SafeInput.getRangedInt(in, "Gimme a value between 1 and 100", 1, 100);
        int found = 0;
        double[] cool;


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
        System.out.println("The value you entered, " + imp + ", appeared in the randomly generated set " + found + " times.");
        increase = 0;
        Boolean yeah = false;
        for (int move = 0; move < 100; move++){
            if (dataPoints[increase] == imp){
                yeah = true;
                break;
            }else {
                increase = increase + 1;
            }
        }
        increase = increase + 1;
        if (yeah) {
            System.out.println("The value " + imp + " was first found at the index array position " + increase + ".");
        } else {
            System.out.println("Seems like the value " + imp + " wasn't in the array at any point.");
        }


        increase = 101;
        for (int max = increase; max > 0; max--){
            for (int move = 0; move < 100; move++) {
                if (dataPoints[move] == increase) {
                    yeah2 = true;
                    break;
                }

            }
            if(yeah2){
                break;
            }else {
                increase = increase - 1;
            }
        }
        if (yeah2) {
            System.out.println("The maximum value in the array was " + increase + ".");
        } else {
            System.out.println("I don't know how but the maximum value in the array was freaking 1. What are the odds? Crazy low.");
        }
        increase = 0;
        for (int min = increase; min < 99; min++){
            for (int move = 0; move < 100; move++) {
                if (dataPoints[move] == increase) {
                    yeah3 = true;
                    break;
                }
            }
            if(yeah3){
                break;
            }else {
                increase = increase + 1;
            }
        }
        if (yeah3) {
            System.out.println("The minimum value in the array was " + increase + ".");
        } else {
            System.out.println("I don't know how but the minimum value in the array was freaking 100. What are the odds? Crazy low.");
        }
        double avg4 = getAverage(new double[]{3, 5, 7, 10}, "Gimme an array of averages");
        System.out.println("The average using the method I just made is " + avg4 + ".");



    }
}
