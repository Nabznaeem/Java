package src;
//Given an integer array, write a program to find the largest and smallest number in the array. Do not use Arrays.sort
public class ArrInt {
    public static void main(String[] args) {

        int a[]={12,4,1,3,13,56,189,456,2,10};

        int s = a[0];
        int l = a[0];

        for(int i=1; i< a.length; i++)
        {
            if(a[i] > l)
                l = a[i];
            else if (a[i] < s)
                s = a[i];

        }
        System.out.println("Smallest Number is : " + s);
        System.out.println("Largest Number is : " + l);
    }
}



