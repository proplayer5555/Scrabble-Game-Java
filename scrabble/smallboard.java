/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package askisi2megali;

import java.util.Scanner;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Arrays;

public class smallboard extends Board implements Board1{
    public int igrammes=15,isthles=15,ogrammes,osthles;
    private int buffer=2;
    public Letter iboard[][]=new Letter [igrammes][isthles];
    public String oboard=
"+ \t|A|B|C|D|E|F|G|H|I|J|K|L|M|N|O\n" + //t=triple word,d = double word,2 =2x letter,3= 3x letter
"1 \t|t| | |2| | | |t| | | |2| | |t\n" +
"2 \t| |d| | | |3| | | |3| | | |d| \n" +
"3 \t| | |d| | | |2| |2| | | |d| | \n" +
"4 \t|2| | |d| | | |2| | | |d| | |2\n" +
"5 \t| | | | |d| | | | | |d| | | | \n" +
"6 \t| |3| | | |3| | | |3| | | |3| \n" +
"7 \t| | |2| | | |2| |2| | | |2| | \n" +
"8 \t|t| | |2| | | |d| | | |2| | |t\n" +
"9 \t| | |2| | | |2| |2| | | |2| | \n" +
"10\t| |3| | | |3| | | |3| | | |3| \n" +
"11\t| | | | |d| | | | | |d| | | | \n" +
"12\t|2| | |d| | | |2| | | |d| | |2\n" +
"13\t| | |d| | | |2| |2| | | |d| | \n" +
"14\t| |d| | | |3| | | |3| | | |d| \n" +
"15\t|t| | |2| | | |t| | | |2| | |t\n";
    public smallboard(){
                  Letter empty = new Letter(' ',0);
          for(int i=0;i< igrammes;i++){
              for(int k=0;k<isthles;k++){
                  iboard[i][k]=empty;
              }
          }
    }
    @Override
    public int innertoouter(int orizontia, int katheta){
        return buffer + 34 * katheta+ orizontia*2;
    }
    @Override
    public String getOB(){
        return this.oboard;
    }
    @Override
    public Letter[][] getIB(){
        return this.iboard;
    }
    @Override
    public void setOB(char OB,int x){
        String newob= this.oboard.substring(0,x)+OB+this.oboard.substring(x+1);
        this.oboard= newob;
    }
    
    @Override
    public void setIB(Letter IB,int x,int y){
        this.iboard[y-1][x-1]=IB;
        
    }   
    @Override
    public String iboardstring(){
          
           return Arrays.deepToString(this.iboard);
        }
    @Override
 public int getisthlles(){
     return isthles;
 }
    @Override
 public int getigrammes(){
     return igrammes;
 }

    
            
}
