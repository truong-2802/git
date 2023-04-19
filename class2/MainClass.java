package com.class2;

import java.io.File;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
       FileManagement fileManagement=new FileManagement();

        do {
            System.out.println("============ Word Program =========");
            System.out.println("1.Count Word In File");
            System.out.println("2.Find File By Word");
            System.out.println("3.Exit");

            System.out.println("Menu choose");
            Scanner input = new Scanner(System.in);
            int choose = input.nextInt();
            switch (choose) {
                case 1: {
                    File fileSource = new File("D:\\File\\P1.txt");
                    Scanner a = new Scanner(System.in);
                    System.out.print("Enter Word: ");
                    String word = a.nextLine();
                    try {

                        int count = fileManagement.countWord(fileSource, word);
                        if (count > 0) {
                            System.out.println(word + " found " + count + " times");
                        } else {
                            System.out.println("Word not found");
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                }
                case 2: {
                    System.out.println("-------- Find File By Word --------\n");
                    Scanner c = new Scanner(System.in);
                    System.out.print(" Enter Word: ");
                    String word = c.nextLine();
                    File directory = new File("D:\\File");

                    try {
                        System.out.println("------------ File Name ------------");
                        fileManagement.getFile(directory, word);
                    } catch(Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                break;
                case 3: {
                    System.out.println("Exit");
                    return;
                }
            }

        } while (true);
    }
}
