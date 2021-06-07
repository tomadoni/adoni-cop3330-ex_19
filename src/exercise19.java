import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner kb= new Scanner(System.in);
	    double weight=0;
	    double height=0;
	    System.out.println("What is your weight in pounds?");
	    weight= kb.nextDouble();
	    System.out.println("What is your height in inches?");
	    height= kb.nextDouble();
	    double bmi= (weight / (height * height)) * 703;
	    System.out.println("Your BMI is "+bmi+".");
	    if(bmi<18.5){
	        System.out.println("You are underweight. You should see a doctor.");
        }
	    else if(bmi>25){
	        System.out.println("You are overweight. You should see a doctor.");
        }
	    else{
	        System.out.println("You are within the ideal weight range");
        }
    }
}
