import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int option;
        try {
        do {

            System.out.println("Enter number1");
                int number1 = s.nextInt();
                System.out.println("Enter number2");
                int number2 = s.nextInt();
                System.out.println("Enter 1 to addition the numbers\n" +
                        "\n" +
                        "Enter 2 to subtraction the numbers\n" +
                        "\n" +
                        "Enter 3 to multiplication the numbers\n" +
                        "\n" +
                        "Enter 4 to division the numbers\n" +
                        "\n" +
                        "Enter 5 to modulus the numbers\n" +
                        "\n" +
                        "Enter 6 to find minimum number\n" +
                        "\n" +
                        "Enter 7 to find maximum number\n" +
                        "\n" +
                        "Enter 8 to find the average of numbers\n" +
                        "\n" +
                        "Enter 9 to print the last result in calculator\n" +
                        "\n" +
                        "Enter 10 to print the list of all results in calculator\n" + "\n" + "Enter 11 to exit");
                option = s.nextInt();

                switch (option) {
                    case 1:
                        int a = addition(number1, number2);
                        System.out.println(a);
                        numbers.add(a);
                        break;
                    case 2:
                        int b = sub(number1, number2);
                        System.out.println(b);
                        numbers.add(b);
                        break;
                    case 3:
                        int m = mul(number1, number2);
                        System.out.println(m);
                        numbers.add(m);
                        break;
                    case 4:
                        int d = divide(number1, number2);
                        System.out.println(d);
                        numbers.add(d);
                        break;
                    case 5:
                        int mo = mod(number1, number2);
                        System.out.println(mo);
                        numbers.add(mo);
                        break;
                    case 6:
                        int min = minimun(number1, number2);
                        System.out.println(min);
                        numbers.add(min);
                        break;
                    case 7:
                        int max = maximum(number1, number2);
                        System.out.println(max);
                        numbers.add(max);
                        break;
                    case 8:
                        int ave = average(number1, number2);
                        System.out.println(ave);
                        numbers.add(ave);
                        break;
                    case 9:
                        lastElement(numbers);
                        break;
                    case 10:
                        System.out.println(numbers);

                }
            }   while (option != 11) ;

        } catch (InputMismatchException e) {
            System.out.println("enter correct number");
        }
    }


    public static int addition(int number1,int number2){
        int sum =number1+number2;
        return sum;
    }
    public static int sub(int number1,int number2){
        int sub =number1-number2;
        return sub;
    }
    public static int mul(int number1,int number2){
        int mul =number1*number2;
        return mul;
    }
    public static int divide(int number1,int number2){
        int divide =number1/number2;
        return divide;
    }
    public static int mod(int number1,int number2){
        int mod =number1 % number2;
        return mod;
    }
    public static int minimun(int number1,int number2){
        if(number1<number2)
            return number1;

        else return number2;


    }
    public static int maximum(int number1,int number2){
        if(number1>number2)
        return number1;

        else return number2;

    }
    public static int average(int number1,int number2){
        int average =(number1+number2)/2;
        return average;
    }
    public static void lastElement( ArrayList numbers){
        int g= numbers.size()-1;
        System.out.println(numbers.get(g));
    }
}
