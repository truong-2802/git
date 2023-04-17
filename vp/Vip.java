package com.vp;

import java.util.Scanner;

public class Vip {
    public static int getSum(int num){
        int sum=0;
        do{
            sum += num%10;
            num = num/10;
        }while ( num > 0 );
        return sum;
    }

    public static void main(String[] args) {
        String answer="yes";
        do{
            System.out.println("number:");
            Scanner input=new Scanner(System.in);
            int number= input.nextInt();

            int total = getSum(number);
            System.out.println("sum:"+total);

            System.out.println("continue ?");
            input=new Scanner(System.in);
            answer=input.nextLine();

        }while (answer.equals(""));
    }
}
