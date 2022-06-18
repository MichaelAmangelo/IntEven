import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter integer n: ");

        int n = scan.nextInt();

        int sum = 0;

        for (int count = 1; count <= n; count++)
        {
            if (count % 2 == 0)
            {
                sum += count;

            }
        }
        System.out.println("The sum of all even numbers between 1 and " + n + " is: " + sum);

    }
}
