import java.util.Arrays;
import java.util.Scanner;
/*
* create integer(that can take 10 values) and boolean data types
* import scanner to ask a user to put a test score
* open a loop and write conditions
* once the user enter 10 different scores, evaluate which one is the highest and lowest
* create if and else/if loops to evaluate the scores one another 
*
* */
public class testscores {
    public static void main(String [] args){

        int score [] = new int[10];
        int count = 0;
        double sum = 0;
        double min = 0;
        double max = 0;
        double avg = 0;
        Scanner input = new Scanner(System.in);
        for (int x = 0; x < score.length;x++){
            count++;
            System.out.print("Enter a score " +"(" + count +"/" + score.length + ") ");
            score[x] = input.nextInt();
            input.nextLine();
            sum = sum + score[x];
            if(min == 0){
                min = score[x];
            } else if(min > score[x]){
                min = score[x];
            }
            if(score[x] > max){
                max = score[x];
            }
        }
        avg = sum / count;
        System.out.println("The highest score is " + max);
        System.out.println("The lowest score is " + min);
        System.out.println("Average score is " + avg);
        System.out.println("All the Scores are " + Arrays.toString(score));

    }
}




