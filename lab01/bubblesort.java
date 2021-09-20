package lab01;

public class bubblesort {
    void bubbleSort(int arr[]) {
        int n=arr.length;
        for(int i=0;i<n-1;i++)
            for(int j=0;j<n-1;j++)
                if(arr[j]>arr[j+1]) {
                    //interchange arr[j+1] with arr[j]
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
    }

    void printArray(int arr[]) {
        int n =arr.length;
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }


    public static void main(String[] args) {
        bubblesort ob =new bubblesort();
        int arr[]= {36,25,45,87,56,45,23};

        System.out.println("Input Array");
        ob.printArray(arr);
        ob.bubbleSort(arr);
        System.out.println("Sorted Array");
        ob.printArray(arr);

    }
}
