/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package askisi2megali;

/**
 *
 * @author Panagiotis
 */
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Arrays;
public abstract class Board {
 public String oboard;
 public Letter iboard[][];


    public int getigrammes(){
        return 1;
    }
    public int getisthlles(){
        return 1;
    }
    public String getOB(){
        return this.oboard;
    }

    public Letter[][] getIB(){
        return this.iboard;
    }
 
    public void setOB(char OB,int x){
        String newob= this.oboard.substring(0,x)+OB+this.oboard.substring(x+1);
        this.oboard= newob;
    }
    
    public void setIB(Letter IB,int x,int y){
        this.iboard[y-1][x-1]=IB;
        
    }
        public int innertoouter(int orizontia, int katheta){
        return 0;
    }
        public String iboardstring(){
          
           return Arrays.deepToString(iboard);
        }

    
}
