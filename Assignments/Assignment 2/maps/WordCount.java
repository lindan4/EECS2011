
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maps;

import java.io.File;
import java.io.FileNotFoundException;
//import java.util.HashMap;
//import java.util.Map;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bmccune
 */
public class WordCount {

    /**
     * @param args the command line arguments
     */ 
    public static void main(String[] args) {
        // TODO code application logic here
        Map<String,Integer> freq = new ProbeHashMap<>();
        
        File file = new File("/space/bmccune/NetBeansProjects/Maps/src/maps/warPeace.txt");
        Scanner doc = new Scanner("");
        try  {
            doc = new Scanner(file).useDelimiter("[^a-zA-Z]+");
        } catch (FileNotFoundException ex) {
            System.err.println("exception + " + ex);
        }
        
        int times = 0;
        while (doc.hasNext()){
           String word = doc.next().toLowerCase();
           Integer count = freq.get(word);
           if (count == null){
               count = 0;
           }
           freq.put(word, count+1);
           //System.out.println("**"+word+"**" );
           times++;
        }
        String maxWord = "no word";
        int maxCount=0;
        for (String key:freq.keySet()){
            if (freq.get(key)> maxCount){
                maxCount = freq.get(key);
                maxWord = key;
            }
            if (freq.get(key)>1000){
                //System.out.println(key);
            }
        }
        System.out.println(maxWord);
        System.out.println(freq.get(maxWord)); 
        
        String word = "pierre";
        System.out.println(word + " count = " + (freq.get(word)));
    }
    
}
