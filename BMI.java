import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        System.out.println("Input your weight(Kg) and height(Meter) to check.");
        Scanner input = new Scanner(System.in);
        System.out.println("Weight: ");
        float w = input.nextFloat();
        System.out.println("Height: ");
        float h = input.nextFloat();
        float bmi = w/(h*h);
        String text;
        if(bmi < 18)
            text = "Underweight";
        else if (bmi < 25.0)
            text = "Normal";
        else if (bmi < 30.0)
            text = "Overweight";
        else
        text = "Obese";
        System.out.println(text);
    }
}
