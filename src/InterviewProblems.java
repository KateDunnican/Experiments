import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class InterviewProblems {

    // Finished Problems:
    public static void FibSequence(){
        int x = 0,
            y = 1,
            z;

        System.out.println(x);
        System.out.println(y);

        for(int i = 2; i < 10; ++i){ // 10 - 2 = 8 loops
            z=x+y;
            System.out.print(z);
            System.out.println();
            x=y;
            y=z;
        }
    } // Prints out the Fibonacci Sequence to whatever number

    public static void CoinProblem(int x){
        if ((x / 5) >= 1){
            if ((x % 5) == 0){
                System.out.println((x / 5) + " coins");
            }
            if ((x % 5) == 1 || (x % 5) == 3){
                System.out.println(((x / 5) + 1) + " coins");
            }
            if ((x % 5) == 2 || (x % 5) == 4){
                System.out.println(((x / 5) + 2) + " coins");
            }
        }
        else{
            if ((x / 3) >= 1){
                if (x == 3){
                    System.out.println((x / 3) + " coin");
                }
                if (x == 4){
                    System.out.println(((x / 3) + 1) + " coins");
                }
            }
            else {
                if (x == 1){
                    System.out.println(x + " coin");
                }
                else{
                    System.out.println(x + " coins");
                }
            }
        }
    } // Makes change using coins of 5, 3, 1

    public static void FizzBuzz(){
        for (int i = 1; i < 101; ++i){
            if (i % 15 == 0){
                System.out.println("FizzBuzz");
            }
            else if (i % 3 == 0){
                System.out.println("Fizz");
            }
            else if (i % 5 == 0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
        }
    } // Fizzbuzz

    public static void Weird(int x){
        if(x % 2 != 0){
            System.out.println("Weird");
        }
        else{
            if((2 <= x) && (x <= 5)){
                System.out.println("Not Weird");
            }
            if((6 <= x) && (x <= 20)){
                System.out.println("Weird");
            }
            if(x > 20){
                System.out.println("Not Weird");
            }
        }
    } // Tells you if x is "Weird" or "Not Weird"

    public static void NotesOnPrint(){
        for(int i=0;i<3;i++){
            String x = "Test";
            int y = 45;

            // print
                //
            // println()
                //
            // printf()
                // https://www.cs.colostate.edu/~cs160/.Summer16/resources/Java_printf_method_quick_reference.pdf
                // https://www.baeldung.com/java-printstream-printf
                // https://www.java67.com/2014/10/how-to-pad-numbers-with-leading-zeroes-in-Java-example.html

                // printf("the string that includes the format rules", thing for slot 1, thing for slot 2, etc...)
                    // %s (string)
                    // %d (decimal integers)
                    // %f (floating point nums)
                    // %t (date/time values)
                    // %b (boolean)

                System.out.printf("%-15s%03d%n", x, y);
        }
    } // All about different ways to print stuff

    public static void MathLoop(int x){
        for (int i = 1; i < 11; ++i){
            System.out.println(x + " * " + i  + " = " + (x * i));
        }
    } // Basic loop through multiplications

    public static void MathLoop2(int q, int a, int b, int n){
        for (int i = 0; i < q; ++i){
            int total = a;
            for (int l = 1; l <= n; ++l){
                for (int x = l-1; x < l; ++x){
                    int bToTheNth = b * ((int)(Math.pow(2, x)));
                    total = total + bToTheNth;
                }
                System.out.print(total + " ");
            }
            System.out.println("");
        }
    } // An infinite, mind bending, disgusting pile of loops!

    public static void InputTypes(int x, long y){
        for(int i=0;i<x;i++){
            try {
                System.out.println(y+" can be fitted in:");
                if(y>=-128 && y<=127)System.out.println("* byte");
                if(y>=-32768 && y<=32767)System.out.println("* short");
                if(y>=-2147483648 && y<=2147483647)System.out.println("* int");
                if(y>=-9223372036854775808L && y<=9223372036854775807L)System.out.println("* long");
            }
            catch(Exception e) {
                System.out.println(y+" can't be fitted anywhere.");
                // this part doesn't really work cause you can't enter anything
                // as long y if it is greater than a long.  Mod this to use
                // scanner.next() instead of y for it to work.
            }

        }

    } // Tells you which types y could fit into

    public static void EndOfFile(String n){
        Scanner scanner = new Scanner(n); // should be System.in if working in main
        int x = 1;
        for (int i = 1; i <= x; ++i){
            if (scanner.hasNext()){
                System.out.println(i + " " + scanner.nextLine());
                ++x;
            }
            else {
                scanner.close();
                break;
            }
        }
    } // Reads scanner till EOF

    public static void StaticBlock (){
        // MUST move everything outside of method for it to work
//        static Scanner scanner = new Scanner(System.in);
//        static int B;
//        static int H;
//        static boolean flag;
//
//        static{
//            B = scanner.nextInt();
//            H = scanner.nextInt();
//
//            if (B > 0 && H > 0){
//                flag = true;
//            }
//            else{
//                System.out.println("java.lang.Exception: Breadth and height must be positive");
//            }
//        }

    } // Static block exercise

    public static void ToString (int x){
        String y = x + ""; // this works
        String z = Integer.toString(x); // this also works
    } // change int to string

    public static void GetDay(int month, int day, int year){
        System.out.println(LocalDate.of(year, month, day).getDayOfWeek().name());
    } // Converts date into day of week

    public static void Currency (double x){
        Locale INDIA = new Locale("en", "IN");

        String us = NumberFormat.getCurrencyInstance(Locale.US).format(x);
        String india = NumberFormat.getCurrencyInstance(INDIA).format(x);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(x);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(x);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    } // Converts currency into different forms

    public static void InheritanceII(){
        // remove from InheritanceII method to use, it serves as storage container
        class Arithmetic {
            public int add (int x, int y){
                return x + y;
            }
        }
        class Adder extends Arithmetic{}
    } // Covers basic inheritance

    // Main for testing:
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    }
}
