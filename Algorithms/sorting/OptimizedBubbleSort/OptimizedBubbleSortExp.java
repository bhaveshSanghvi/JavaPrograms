/**
    Implement optimized bubble sort using an array

    worst case complexity and avg case complexity: O(n*n)
    best case complexity: O(n) <- when array is already sorted
 */

 import java.util.Scanner;

 class OptimizedBubbleSort {

    public void printArray(int items[]) {
        for(int item:items) {
            System.out.print(item+" ");
        }
        System.out.println();
    }
    
    public int[] sortAsc(int a[]) {
        boolean swapped;
        for(int i=0;i<a.length-1;i++) {
            swapped = false;
            for(int j=0;j<a.length-i-1;j++) {
                printArray(a);
                if(a[j]>a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) {
                break;
            }
        }
        return a;
    }

    public int[] sortDsc(int a[]) {

        for(int i=0;i<a.length;i++) {
            for(int j=0;j<a.length-1;j++) {
                if(a[j]<a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        return a;

    }
 }

 class OptimizedBubbleSortExp {
    public static void main(String args[]) {

        //int items [] = {10,8,9,3,6,4,1,2};
        int items [] = {1,2,3,4,5,6,7,8};
        BubbleSort bs = new BubbleSort();
        System.out.println(items.length);
        items = bs.sortAsc(items);
        bs.printArray(items);

        //items = bs.sortDsc(items);
        //bs.printArray(items);
    }
 }