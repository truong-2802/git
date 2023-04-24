package com.dictionary;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DictionaryManagement {
    HashMap<English,Vietnamese> mapDictionary;
    DictionaryManagement(){
        mapDictionary=new HashMap<>();
    }
    DictionaryManagement(HashMap<English,Vietnamese> map){
        this.mapDictionary=map;
    }


  public void viewAllDictionary() throws Exception{
        Iterator iter=this.mapDictionary.entrySet().iterator();

        while (iter.hasNext()){
            Map.Entry<English,Vietnamese> entry
                    =(Map.Entry<English,Vietnamese>) iter.next();
            entry.getValue().display();
        }
  }
    public boolean addDictionary() throws Exception {
        Dictionary dictionary = new Dictionary();
        if (this.mapDictionary.containsKey(dictionary.getDictionary())) {
            throw new Exception("Dictionary existing");
        }
        this.mapDictionary.put(dictionary.getDictionary(), mapDictionary.remove(dictionary));
        return true;
    }

  public  HashMap<English,Vietnamese> searchDictionary(String input)
      throws Exception{
        HashMap<English,Vietnamese> result=new HashMap<>();
        if(input==null || input.equals("")){
            throw new Exception("No");
        }else {
            for (Vietnamese item: this.mapDictionary.values()){
                if (item.getEnglish().contains(input)){
                    result.put((English) item.getEnglish(),item);
                }else if(item.getVietnamese().contains(input)){
                    result.put((English) item.getVietnamese(),item);
                }
            }
        }
      return result;
  }

}
