class ArrayMaxPair {
    public static void main(String args[]) {
        int a[] = {1,3,5,7,9,2,4,6,8,10};

        int max1= a[0];
        int max2 = a[1];

        for(int i=2;i<a.length;i++) {
            System.out.println();
            if(a[i]>max1) {
                System.out.println("max1"+a[i]);
                if(max1>max2){
                    max2=max1;
                }
                max1 = a[i];
            } else if(a[i]>max2){
                System.out.println("max2"+a[i]);
                max2=a[i];
            }
        }

        System.out.println(max1*max2);
    }
}