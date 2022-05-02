import java.util.Scanner;

public class Pro3_64010842 {
    public static void main(String[] args){
        System.out.print("Enter a number between 0 and 1000: ");
        Scanner inputNum;
        inputNum = new Scanner(System.in);
        int number = inputNum.nextInt();
        int remainNum = 0;
        int sum = 0;

        if(number < 1000 && number > 0){
            while(number > 0)
            {
                remainNum = number % 10;
                sum = sum + remainNum;
                number = number / 10;
            }
            System.out.println("The sum of the digits is "+ sum);
        }

        else{
            System.out.println("Enter a number other than the specified number.");
        }
    }
}
