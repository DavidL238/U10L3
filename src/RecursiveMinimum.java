import java.util.ArrayList;
import java.util.Scanner;

public class RecursiveMinimum
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        while (true)
        {
            System.out.print("Please enter numbers. Enter -1 to quit: ");
            int number = input.nextInt();

            if (number == -1)
            {
                break;
            }
            else
            {
                numbers.add(number);
            }
        }

        int minimum = findMinimum(numbers);
        System.out.println("Minimum: " + minimum);
    }

    public static int findMinimum(ArrayList<Integer> numbers)
    {
        if (numbers.isEmpty()) {
            return -1;
        }
        int min = numbers.remove(numbers.size() - 1);
        int j = findMinimum(numbers);
        if (j > min && j != -1) {
            return min - findMinimum(numbers) ;
        }
        return j - findMinimum(numbers);
    }
}
