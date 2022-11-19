import java.util.Scanner;

public class TwoPoints {
    public static void main(String[] args) {
        int x,y;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter x and y");
        x=sc.nextInt();
        y=sc.nextInt();
        int c=computePointOfInterception(x,y);
        System.out.println(c);
    }
    public static int computePointOfInterception(int x, int y)
    {
        while(x!=y)
        {
            y=(y+1)%12;
            x=(x+2)%12;
        }
        if(y==0)
             return 12;
        return y;
    // System.out.println(x);
    //     int arr[]=new int[12];
    //         for(int i=0;i<12;i++){
    //             arr[i]=i+1;
    //         }
    //     int slow=arr[(y-1)%12], fast=arr[(x-1)%12];
    //     while (slow!=fast){
    //         slow=arr[slow%12];
    //         fast=arr[arr[fast%12]];
    //         System.out.println("fast:"+fast);
    //         System.out.println("slow:"+slow);
    // }
    // System.out.println(arr[slow-1]);
    //return 0;
    }
    }