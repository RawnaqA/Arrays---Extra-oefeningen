package be.intecbrussel;

public class IntegerArrayManipulatie {
    public static void main(String[] args) {
        // 1
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int array1[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //2
        System.out.println( " array[0] is " + array[0]);
        System.out.println( " array[5] is " + array[5]);

        //3
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        //  4
        for (int i =0; i<array.length; i++) {
            if (i == 0 || i == 5) {
                System.out.println(array[i]);
            }
        }
        // 5
            for (int index = 0; index < array.length; index++) {
                if (array[index] % 4 == 0) {
                    array[index] = 0;
                }
                System.out.println(array[index]);
            }
            // 6

            for (int number : array1) {
                System.out.println(number);
            }
        // 7
        for(int i=array.length; i>0; i--){
            System.out.println(i-1);
        }

        // 8

            for (int j = array1.length - 1; j >= 0; j--) {
                array1[j] = array1[j] * 13;
                System.out.println(array1[j]);
            }



    }
}