import java.util.Scanner;
public class OddNumbersSum{
    public static void main(String[] args){
        int n, x, sum = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter an odd number");
        int number = keyboard.nextInt();
        for (x=0; x<=number; x++){
            if ((x%6) == 1){
                sum +=x;
            }
        }
        System.out.printf("The sum of the odd numbers till " + number + "is" + sum);
    }
}

