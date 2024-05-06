/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainscrabble;

/**
 *
 * @author gsers
 */
import java.util.Scanner;
import static java.lang.System.out;
import java.util.ArrayList;
public class mainscrabble {

    /**
     * @param args the command line arguments
     */
    
    public static void mainscrabble(String[] args) {
        boolean ellinika;
        boolean tonika;
        int noplayers;
        Scanner input= new Scanner(System.in);
        out.println("insert number of players (2-4)(incopatible values will be defaulted to 4)");
        noplayers=input.nextInt();
        if((noplayers !=2)&&(noplayers !=3)&&(noplayers !=4))
            noplayers=4;
        out.println("choose language\n1 greek(Super scrabble mode not compatible with greek)\n2/other english");
        String k = input.next();
        switch (k.charAt(0)){
            case '1':
                ellinika=true;
                break;
            default:
                ellinika=false;
                break;
    }
        if (ellinika) {
            out.println("παρακαλω επιλεξτε είδος παιχνιδιου\n1 Scrabble\n2 Double Scrabble\n3/αλλο Tonika");
            k=input.next();
            switch(k.charAt(0)){
                case '1':
                    Selbag b1=new Selbag();
                    smallboard s1=new smallboard();
                    Game g1= new Game(false,ellinika,b1,s1,noplayers);
                    g1.playgame();
                    break;
                case '2':
                    DSelbag b2=new DSelbag();
                    bigboard s2=new bigboard();
                    Game g2= new Game(false,ellinika,b2,s2,noplayers);
                    g2.playgame();
                    break;
                default:
                    Selbag b3=new Selbag();
                    smallboard s3=new smallboard();
                    Game g3= new Game(true,ellinika,b3,s3,noplayers);
                    g3.playgame();
                    break;
            }
        }else{
            out.println("please choose game mode\n1 Scrabble\n2 Double Scrabble\n3 Tonika\n4/other Super Scrabble");
            k=input.next();
            switch(k.charAt(0)){
                case '1':
                    Senbag b1=new Senbag();
                    smallboard s1=new smallboard();
                    Game g1= new Game(false,ellinika,b1,s1,noplayers);
                    g1.playgame();
                    break;
                case '2':
                    DSenbag b2=new DSenbag();
                    bigboard s2=new bigboard();
                    Game g2= new Game(false,ellinika,b2,s2,noplayers);
                    g2.playgame();
                    break;
                case '3':
                    Selbag b3=new Selbag();
                    smallboard s3=new smallboard();
                    Game g3= new Game(true,ellinika,b3,s3,noplayers);
                    g3.playgame();
                    break;
                default:
                    SSenbag b4=new SSenbag();
                    bigboard s4=new bigboard();
                    Game g4= new Game(false,ellinika,b4,s4,noplayers);
                    g4.playgame(); 
                    break;
            }
        }

      
    }
    
}
