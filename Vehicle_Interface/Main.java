package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args)
    {
        PoliceCar [] carList = new PoliceCar[5];

        PoliceCar car1 = new PoliceCar("Pajero",4 , 100,"694200ABC", "Lawson", 60000, 90000000, 4);
        PoliceCar car2 = new PoliceCar("Rush",6 , 120,"120403DCE", "Jim", 60000, 95000000, 4);
        PoliceCar car3 = new PoliceCar("MiniCooper",4 , 90,"200011XYZ", "Kimberly", 60000, 10000000, 4);
        PoliceCar car4 = new PoliceCar("Ferrari",2 , 200,"123456RED", "Emily", 60000, 90000000, 4);
        PoliceCar car5 = new PoliceCar("Innova",6 , 100,"654321BLU", "Carlos", 60000, 20000000, 4);
        carList[0] = car1;
        carList[1] = car2;
        carList[2] = car3;
        carList[3] = car4;
        carList[4] = car5;

       for(int i=0; i< carList.length; i++ )
       {
           System.out.println("Car"+(i+1)+":"+carList[i].toString());
       }




    }
}
