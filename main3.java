//wap for array rotation

import java.util.Scanner;

public class main3 
{
    public static void main(String[] args) {
        int arr[] = {1,3,5,8,9};
        
        int len = arr.length;
        System.out.println("enter the element for rotation: ");
        Scanner obj = new Scanner(System.in);
        int rotation = obj.nextInt();
        int i = 0;
        for(int rot = 0; rot < rotation; rot++)
        {
            i=1;
            int temp = arr[0];
            while (i<len)
            {
                arr[i-1] = arr[i];
                i=i+1;
            }
            arr[len-1]=temp;
        }


        for(i = 0; i < len; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

