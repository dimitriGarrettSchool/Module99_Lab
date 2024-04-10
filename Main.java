import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static int min(int arr[])
    {
        int min = 10000;
        for (int i = 0; i < arr.length; ++i)
        {
            min = Math.min(arr[i], min);
        }
        return min;
    }

    public static int max(int arr[])
    {
        int max = -1;
        for (int i = 0; i < arr.length; ++i)
        {
            max = Math.max(arr[i], max);
        }
        return max;
    }

    public static int occurenceScan(int arr[], int val)
    {
        int occ = 0;
        for (int i = 0; i < arr.length; ++i)
        {
            if (arr[i] == val) occ += 1;
        }
        return occ;
    }

    public static int sum(int arr[])
    {
        int sum = 0;
        for (int i = 0; i < arr.length; ++i)
        {
            sum += arr[i];
        }
        return sum;
    }

    public static boolean contains(int arr[], int val)
    {
        for (int i = 0; i < arr.length; ++i)
        {
            if (arr[i] == val) return true;
        }

        return false;
    }

    public static void main(String[] args)
    {
        int[] arr = new int[100];

        Random random = new Random();

        int sum = 0;
        for (int i = 0; i < arr.length; ++i)
        {
            arr[i] = random.nextInt(1, 100);

            //System.out.printf("" + arr[i] + " | ");

            sum += arr[i];
        }
        //System.out.println("");

        //System.out.println("Sum: " + sum);
        //System.out.println("Average: " + (sum / 100.0));

        //int val = SafeInput.getRangedInt(new Scanner(System.in), "What value do you want to find > ", 1, 100);

        //int occ = 0;
        int min = 1000;
        int max = -1;

        for (int i = 0; i < arr.length; ++i)
        {
            sum += arr[i];
            //min = Math.min(min, arr[i]);
            //max = Math.max(max, arr[i]);
            /*if (arr[i] == val)
            {
                System.out.println("Found num at: " + i);
                occ = 1;
                break;
            }*/
            //if (arr[i] == val) { occ += 1; }
        }

        System.out.println("Average is: " + (sum / 100.0));

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);

        //if (occ == 0) {
            //System.out.println("never found your number!");
        //}

        //System.out.println("Occurences is: " + occ);
    }
}