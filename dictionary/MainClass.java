package com.dictionary;

import java.util.HashMap;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        DictionaryManagement management=new DictionaryManagement();
        Scanner input=new Scanner(System.in);
        int choose=0;
        do{
            System.out.println("======== Dictionary program ========");
            System.out.println("1. Add Word");
            System.out.println("2. Delete Word");
            System.out.println("3. Translate");
            System.out.println("4:  View all Dictionary");
            System.out.println("5. Exit");
            System.out.print("Please choose one option: ");
            try{
                choose = Integer.parseInt(input.nextLine());
                Dictionary dictionary=null;
                switch (choose){
                    case 1: {
                        System.out.println("------------- Add -------------");
                        dictionary=new Dictionary();
                        System.out.println("Enter English : ");
                        dictionary.setEnglish(input.nextLine());
                        System.out.println("Enter Vietnamese :");
                        dictionary.setVietnamese(input.nextLine());
                        try{
                            if (management.addDictionary());
                            System.out.println("Successful");

                        }catch (Exception e){
                            System.out.println(e.getMessage());
                        }
                    }break;


                    case 2: {

                    }break;


                    case 3: {
                        System.out.println("------------- Translate ------------");
                        String word=input.nextLine();
                        try {
                            HashMap<English,Vietnamese> resultDictionary=management.searchDictionary(word);
                            if (resultDictionary.size()>0){
                                for (Vietnamese item: resultDictionary.values()){
                                    item.display();
                                }
                            }
                        }catch (Exception e){
                            System.out.println(e.getMessage());
                        }

                    }break;


                    case 4:{
                        try{
                            management.viewAllDictionary();
                        }catch (Exception e){
                            System.out.println(e.getMessage());
                        }
                    }



                    case 5: {
                        System.out.println("Exit");
                        return;
                    }
                }


            }catch (NumberFormatException e) {
                System.out.println("Please choice 1-5");
            }

        }while (true);
    }
}
