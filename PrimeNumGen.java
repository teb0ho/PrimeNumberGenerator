import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumGen {

    public static void main(String[] args) {

        double one = 2;
        double two = 2;
        double result = 0;
        int checkPrime = 0;

        ArrayList<Double> holder = new ArrayList<Double>();
        ArrayList<Integer> prime = new ArrayList<Integer>();

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the range of the prime numbers you would like to generate: ");
        double userInput = scan.nextDouble();


        while (one <= userInput ) {

            while (result != 1) {

                result = one / two;

                holder.add(result);
                two++;
            }

            for (int i = 0; i < holder.size(); i++) {
                
                if (holder.get(i) % 1 == 0) {
                    
                    checkPrime += 1;
                }
            }

            if (checkPrime == 1) {

                int prima = (int) one;
                prime.add(prima);

            }

            checkPrime = 0;
            result = 0;
            holder.clear();
            two = 2;
            one++;
        }

        System.out.println();
        System.out.print("Your primes are: ");

        for (int i = 0; i < prime.size(); i++) {

            System.out.print(prime.get(i) + " ");
        }
    }
}
