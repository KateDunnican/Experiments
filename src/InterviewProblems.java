public class InterviewProblems {
    // Problems to work on:
    public static void FizzBuzz(int x){} // Fizzbuzz with int x input



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



    // Main for testing:
    public static void main(String[] args) {
        FibSequence();
        CoinProblem(32);
    }
}
