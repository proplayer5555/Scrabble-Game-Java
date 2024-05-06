/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package askisi2megali;

import java.util.Scanner;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Iterator;

public class simplehand {
    private int score=0;
    public int size;
    public ArrayList <Letter> letterlist = new ArrayList<>(size);
    
    public int get_score(){
        return score;
    }
    public void addletter(Letter newl){
        letterlist.add(newl);
    }

    public void removeletter(char rletter){
        boolean flag=false;
        for(int i = 0;i<letterlist.size();i++){
            if(letterlist.get(i).returnsymbol()==rletter && !(flag)){
                flag=true;
                letterlist.remove(i);
            }
        }
        if (!(flag))  
            out.println("symbol not found");
    }
    public simplehand(){
        
    }
    public String toSring(){
           return letterlist.toString();
       } 
    public void addscore(int k){
        this.score+=k;
    }
}
