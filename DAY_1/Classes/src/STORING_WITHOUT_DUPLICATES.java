import java.util.HashSet;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Set;

public class STORING_WITHOUT_DUPLICATES {
    public static void main(String[] args){


        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the Number of values: ");
        int n = inp.nextInt();
        System.out.println("Enter the values: ");
        Integer[] arr = new Integer[n];
        for(int i=0;i<n;i++){
            arr[i] = inp.nextInt();
        }
        Set<Integer> numbers = new HashSet<Integer>(Arrays.asList(arr));
        System.out.println(numbers);
    }
}