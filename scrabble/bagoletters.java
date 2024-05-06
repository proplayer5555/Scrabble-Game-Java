/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package askisi2megali;

/**
 *
 * 
 * @author gsers
 */
import java.util.Scanner;
import static java.lang.System.out;
import java.util.ArrayList;
public abstract class bagoletters {
    public ArrayList<Letter>remainingletters= new ArrayList<>();
    public bagoletters(){
        
    }
       public String toSring(){
           return remainingletters.toString();
       } 
       public int numofletters(){
           return remainingletters.size();
       }
       public ArrayList stringtoletter(String g){
           ArrayList <Letter> converted=new ArrayList<>();
           boolean flag=false;
           for (int i=0;i<g.length();i++){
               Letter a=new Letter(' ',0);
               switch (g.charAt(i)){
                   
                    case '*': a.setletter(g.charAt(i),0);
                         break;
                    case 'A': 
                    case 'I': 
                    case 'E':
                    case 'O':
                    case 'N':
                    case 'R':
                    case 'T':
                    case 'L':
                    case 'S':
                    case 'U':
                    case 'Α':
                    case 'Ο':
                    case 'Ε':
                    case 'Ι':
                    case 'Τ':
                    case 'Η':
                    case 'Σ':
                    case 'Ν':a.setletter(g.charAt(i),1);
                                break;
                    case 'G':
                    case 'D':
                    case 'Ρ':
                    case 'Υ': 
                    case 'Π':
                    case 'Κ':a.setletter(g.charAt(i), 2);
                                break;
                    case 'C':
                    case 'M':  
                    case 'P':
                    case 'Λ':  
                    case 'Μ':  
                    case 'Ω':  
                    case 'B': a.setletter(g.charAt(i),3);
                         break;
                    case 'F':
                    case 'H':  
                    case 'V':  
                    case 'W':  
                    case 'Y':  
                    case 'Γ':      
                    case 'Δ': a.setletter(g.charAt(i), 4);
                                break;
                    case 'K': a.setletter(g.charAt(i), 5);
                                break;
                    case 'J':
                    case 'X':
                    case 'Β':  
                    case 'Φ':  
                    case 'Χ':a.setletter(g.charAt(i),8);
                                break;
                    case 'Q':
                    case 'Z':
                    case 'Ζ':
                    case 'Ξ':  
                    case 'Ψ':  
                    case 'Θ':a.setletter(g.charAt(i), 10);
                    
                                break;
                    default:a.setletter(' ', 0);
                    flag=true;
                       break;  
               }
            converted.add(a);
           }
        if (flag){
            for (int j=0;j<converted.size();j++){
                converted.get(j).setletter(' ', 0);
            }
            return converted;
        }
        else {
            return converted;
        }
    }    
}
