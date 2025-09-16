import java.util.Scanner;

public class mean{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the 4 numbers: ");
        int number1 = obj.nextInt();
        int number2 = obj.nextInt();
        int number3 = obj.nextInt();
        int number4 = obj.nextInt();

        int num = 4;

        int sum = number1 + number2 + number3 + number4;
        double average = sum/4;
        System.out.println("The average of " + number1 + "," + number2 + "," + number3 + "," + number4 + " is " + average);




    }
}