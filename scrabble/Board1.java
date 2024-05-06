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
import static java.lang.System.out;
import java.util.ArrayList;
public interface Board1 {

public void setOB(char OB,int x);
public void setIB(Letter IB,int x,int y);
public String getOB();
public Letter[][] getIB();
public int innertoouter(int orizontia, int katheta);   
public String iboardstring();
 public int getisthlles();
 public int getigrammes();
}

