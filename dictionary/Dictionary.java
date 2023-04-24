package com.dictionary;

public class Dictionary {
    private String english,vietnamese;
    public Dictionary(){

    }
    public Dictionary(String english){this.english=english;}
    public Dictionary(String english,String vietnamese){
        this.english=english;
        this.vietnamese=vietnamese;
    }


    public String getEnglish(){return english;}
    public String setEnglish(String english){this.english=english;
        return english;
    }

    public String getVietnamese(){return vietnamese;}
    public String setVietnamese(String vietnamese){this.vietnamese=vietnamese;
        return vietnamese;
    }

    public void display(){
        System.out.println(english);
        System.out.println(vietnamese);
    }

    public English getDictionary() {

        return getDictionary();
    }
}
