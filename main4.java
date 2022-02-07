import java.util.Scanner;

public class main4 
{
    public static void main(String[] args) 
    {
        System.out.println("enter the total number of elements in array");
        Scanner obj = new Scanner(System.in);
        int elements = obj.nextInt();

        int i=0,count=0,s;
        while (i<elements)
        {
            int[] arr;
            arr = new int[elements];
            System.out.print("enter the element: ");
            Scanner ob = new Scanner(System.in);
            int ele = ob.nextInt();
            arr[i] = ele;
            i=i+1;
            count=count+1;

        }
        
        // if (count == arr.length)
        // {
        //     System.out.print("element if empty");
        //     Scanner obj1 = new Scanner(System.in);
        //     int empty = obj1.nextInt();
        //     System.out.println(arr.add(empty));
        // }
        // else{
        //     System.out.print("array is full");
        // }
    }
}
