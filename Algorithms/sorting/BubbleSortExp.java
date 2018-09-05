/**
    Implement bubble sort using an array
 */

 import java.util.Scanner;

 class BubbleSort {

    public void printArray(int items[]) {
        for(int item:items) {
            System.out.print(item+" ");
        }
    }
    
    public int[] sort(int items[]) {

        for(int i=0;i<items.length;i++) {
            for(int j=0;i<items.length;j++) {
                System.out.println(j);
                System.out.println(items[j]);
            }
        }
        return items;

    }
 }

 class BubbleSortExp {
    public static void main(String args[]) {

       int items [] = {10,8,9,3,6,4,1,2};

        BubbleSort bs = new BubbleSort();
        items = bs.sort(items);
        //bs.printArray(items);
    }
 }