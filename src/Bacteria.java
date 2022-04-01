import java.util.Scanner;

public class Bacteria
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("How many initial bacteria? ");
        int initial = input.nextInt();
        input.nextLine();
        System.out.print("How many hours will the bacteria sit? ");
        int hours = input.nextInt();
        long bacteria = numBacteriaAlive(initial, hours);
        System.out.println("After " + hours + ", there will be " + bacteria + " bacteria");
    }

    public static long numBacteriaAlive(int initial, int hour)
    {
        if (hour <= 0) {
            return initial;
        }
        hour--;
        if (hour == 0) {
            return (long)initial * 2 + numBacteriaAlive(initial, hour);
        }
        return numBacteriaAlive(initial, hour) * 3;
    }
}

