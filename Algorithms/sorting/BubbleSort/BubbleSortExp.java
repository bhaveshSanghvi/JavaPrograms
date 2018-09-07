/**
    Implement bubble sort using an array

    worst case complexity: O(n*n)
    best case complexity: O(n*n)
 */

 import java.util.Scanner;

 class BubbleSort {

    public void printArray(int items[]) {
        for(int item:items) {
            System.out.print(item+" ");
        }
        System.out.println();
    }
    
    public int[] sortAsc(int a[]) {

        for(int i=0;i<a.length-1;i++) {
            for(int j=0;j<a.length-i-1;j++) {
                printArray(a);
                if(a[j]>a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
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

 class BubbleSortExp {
    public static void main(String args[]) {

       int items [] = {10,8,9,3,6,4,1,2};

        BubbleSort bs = new BubbleSort();
        System.out.println(items.length);
        items = bs.sortAsc(items);
        bs.printArray(items);

        items = bs.sortDsc(items);
        bs.printArray(items);
    }
 }