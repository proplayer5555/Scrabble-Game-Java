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

public class bigboard extends Board implements Board1{
    private int igrammes=21,isthles=21,ogrammes,osthles;
    private int buffer=2;
    public Letter iboard[][]=new Letter [igrammes][isthles];
    
      public String oboard=
"+ \t|A|B|C|D|E|F|G|H|I|J|K|L|M|N|O|P|Q|R|S|T|U\n" +
"1 \t|q| | |2| | | |t| | |2| | |t| | | |2| | |q\n" +
"2 \t| |d| | |3| | | |d| | | |d| | | |3| | |d| \n" +
"3 \t| | |d| | |4| | | |d| |d| | | |4| | |d| | \n" +//q = quadruple word,t=triple word,d = double word,2 =2x letter,3= 3x letter,4 = 4x letter 
"4 \t|2| | |t| | |2| | | |t| | | |2| | |t| | |2\n" +
"5 \t| |3| | |d| | | |3| | | |3| | | |d| | |3| \n" +
"6 \t| | |4| | |d| | | |2| |2| | | |d| | |4| | \n" +
"7 \t| | | |2| | |d| | | |2| | | |d| | |2| | | \n" +
"8 \t|t| | | | | | |d| | | | | |d| | | | | | |t\n" +
"9 \t| |d| | |3| | | |3| | | |3| | | |3| | |d| \n" +
"10\t| | |d| | |2| | | |2| |2| | | |2| | |d| | \n" +
"11\t|2| | |t| | |2| | | |d| | | |2| | |t| | |2\n" +
"12\t| | |d| | |2| | | |2| |2| | | |2| | |d| | \n" +
"13\t| |d| | |3| | | |3| | | |3| | | |3| | |d| \n" +
"14\t|t| | | | | | |d| | | | | |d| | | | | | |t\n" +
"15\t| | | |2| | |d| | | |2| | | |d| | |2| | | \n" +
"16\t| | |4| | |d| | | |2| |2| | | |d| | |4| | \n" +
"17\t| |3| | |d| | | |3| | | |3| | | |d| | |3| \n" +
"18\t|2| | |t| | |2| | | |t| | | |2| | |t| | |2\n" +
"19\t| | |d| | |4| | | |d| |d| | | |4| | |d| | \n" +
"20\t| |d| | |3| | | |d| | | |d| | | |3| | |d| \n" +
"21\t|q| | |2| | | |t| | |2| | |t| | | |2| | |q\n" ;
    public bigboard(){
          Letter empty = new Letter(' ',0);
          for(int i=0;i< igrammes;i++){
              for(int k=0;k<isthles;k++){
                  iboard[i][k]=empty;
              }
          }
    }

    @Override
    public int innertoouter(int orizontia, int katheta){
        return buffer + 46 * katheta+ orizontia*2;
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
