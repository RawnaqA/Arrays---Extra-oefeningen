package be.intecbrussel;

import java.util.Arrays;

public class LeerkrachtBlunders {
    public static void main(String[] args) {
        int [] studentPoints = {1, 5, 6,-9,77,110, -4, 3, 10, 2};

        for (int index = 0; index<studentPoints.length; index++){

            if(studentPoints[index] >10 ){
                studentPoints[index] = studentPoints[index] / 11;

            }else if (studentPoints[index]<0){
                studentPoints[index]=studentPoints[index] * -1;

            }else if(studentPoints[index] < 3){
                studentPoints[index]= studentPoints[index] * 3;

            }
        }
        System.out.println(Arrays.toString(studentPoints));


    }
}
