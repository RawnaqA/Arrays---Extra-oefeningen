package be.intecbrussel;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Temperatuur {
    public static void main(String[] args) {

        int [] temperatures = {6, 3, 1, -1, -3, 0, -1};
        double sum = 0;

        for (int index = 0; index<temperatures.length; index++){
            sum = sum + temperatures[index];

        }
        System.out.println(" gemiddelde temperatuur is " + ":" + sum/7);


        for(int number : temperatures){
            if(number < 0){
                System.out.println(number);
            }
        }

        temperatures[5] = -2;
        System.out.println(Arrays.toString(temperatures));
    }

}
