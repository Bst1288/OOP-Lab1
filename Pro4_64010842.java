import java.util.Scanner;

public class Pro4_64010842 {
    public static void main(String[] args)
    {
        System.out.print("Enter weight in pounds: ");
        Scanner inputWeight;
        inputWeight = new Scanner(System.in);
        double weight = inputWeight.nextDouble();

        System.out.print("Enter weight in pounds: ");
        Scanner inputHeight;
        inputHeight = new Scanner(System.in);
        double height = inputHeight.nextDouble();

        double changeToKilogram = 2.2046226;
        double changeToMeter = 39.3700787;

        if(weight > 0 && height > 0){
        double newWeight = weight / changeToKilogram;
        double newHeight = height / changeToMeter;
        double BMI = newWeight / (newHeight*newHeight);
        System.out.printf("BMI is " + "%.4f",BMI);
        }

        else{
            System.out.printf("can't calculate.");
        }
        
    }
}
