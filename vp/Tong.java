package com.vp;

import java.util.Scanner;

public class Tong {
    public static void main(String[] args) {
        int array[];
        int total;
        System.out.println("Number of element : ");
        Scanner input=new Scanner(System.in);

        total=input.nextInt();
        array =new int[total];

        for (int i = 0; i < total; i++) {
            System.out.println("Element"+(i+1)+"");
            array[i]= input.nextInt();
        }
        for(int item:array){
            System.out.println("Element"+item);
        }
        int tongchan=0;
        int tongle=0;
        for (int i = 0; i < total; i++) {
            if(i%2==0){
                tongchan += array[i];
            }else{
                tongle+=array[i];
            }
        }
        System.out.println("tong chan"+ tongchan);
        System.out.println("tong chan"+ tongle);

    }
}
