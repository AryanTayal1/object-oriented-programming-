package com.lab01;

public class binarysearch {

    int Binarysearch(int arr[], int l, int r, int x) {
        if(r>=1) {
            int mid=1+(r-1)/2;

            if(arr[mid]==x)
                return mid;
            if(arr[mid]>x)
                return Binarysearch(arr,l,mid-1,x);

            return Binarysearch(arr,mid+1,r,x);
        }
        return -1;
    }


    public static void main(String[] args) {
        binarysearch ob = new binarysearch();
        int arr[]= {2,5,9,6,8};
        int n=arr.length;
        int x=9;

        int result= ob.Binarysearch(arr,0,n-1, x);

        if(result == -1)
            System.out.println("Element  of present");
        else
            System.out.println("Element found at index" +result);


    }
}
