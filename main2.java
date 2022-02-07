//wap to find the index of the given element

import java.util.Scanner;

public class main2 
{
    public static void main(String[] args) 
    {
        System.out.print("enter the element: ");
        Scanner obj = new Scanner(System.in);
        int element = obj.nextInt();
        int arr[]= {1,3,4,6,9,1};
        int len = arr.length;
        int i,a=1;
        for (i=0;i<len;i++)
        {
            if (arr[i] == element)
            {
                System.out.print("the index is: "+i);
                a=1;
                break;
            }
            
        if (a==0)
        {
            System.out.print("the element is not found ");
        }
            
        }
    }
}
