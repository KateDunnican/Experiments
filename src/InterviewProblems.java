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
    }

    // Main for testing:
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    }
}
