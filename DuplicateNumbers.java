package com.lab01;

public class DuplicateNumbers {

    public static void main(String[] args) {
        int[] arr=new int[] {1,2,5,6,9,8,5,6,5,4,5,3,7,3};
        System.out.println("Duplicate elements are:");
        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr.length;j++) {
                if(arr[i]==arr[j])
                    System.out.println(arr[j]);
            }
        }
    }
}
