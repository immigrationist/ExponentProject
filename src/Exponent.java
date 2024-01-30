import java.util.Scanner;

public class Exponent {

    public static double computeOperation(int base, int exponent){
        double result = 0.0;
        int base2 = base;

        if(exponent == 0)
            result = 1;
        else if(exponent == 1)
            result = base;
        else {
            while(exponent > 1) {
                base2 = base2 * base;
                exponent = exponent - 1;
            }
            result = base2;
        }

        return result;
    }
    public static void main(String[] args) {
        int base = 0;
        int exponent = 0;
        double result = 0.0;
        int count = 0;
        String answer = "yes";

        Scanner scanner = new Scanner(System.in);

        while(answer.equalsIgnoreCase("yes")){
            System.out.println("Enter base");
            base = scanner.nextInt();
            System.out.println("Enter exponent");
            exponent = scanner.nextInt();

            result = computeOperation(base, exponent);

            System.out.println("Result is: " + result);

            System.out.println("Would you like to try again, yes/no?");
            answer = scanner.next();
        }
    }
}
