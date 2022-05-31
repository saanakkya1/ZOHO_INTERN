import java.util.Arrays;
import java.util.Scanner;

public class Alphebetical {

        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            //Scanner sc1=new Scanner(System.in);
            int n;
            System.out.println("Enter the number of elements ");
            n=sc.nextInt();    //Get the Array Size
            String Names[]=new String[n];   //Declare the array
            //String Sorted[] = new String[n];
            //Sorted = Names;
            System.out.println("Enter the Elements ");
            for(int i=0; i<n ;i++)     //Initialize the array
            {
                Names[i]=sc.nextLine();
            }
            //System.out.println(Arrays.toString(Names));
            Arrays.sort(Names);
            System.out.println(Arrays.toString(Names)); //Sorting using Arrays.sort() method
            //Sorting using compareTo()
            for(int i = 0; i<n; i++)   //Holds each element
            {
                for (int j = i+1; j<n; j++)  //Check for remaining elements
                {
                    //compares each elements of the array to all the remaining elements
                    if(Names[i].compareTo(Names[j])>0)
                    {
                        //swapping array elements
                        String temp = Names[i];
                        Names[i] = Names[j];
                        Names[j] = temp;
                    }
                }
            }
                //prints the sorted array in alphabetical order
            System.out.println(Arrays.toString(Names));

        }
    }

