/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package askisi2megali;

/**
 *
 * @author gsers DOUBLE SCRABBLE GREEK BAG
 */
public class DSelbag extends bagoletters{
    public DSelbag(){
        super();
        int i;
        Letter newk = new Letter('Β',8);
        remainingletters.add(newk);
        Letter newj = new Letter('Φ',8);
        remainingletters.add(newj);
        Letter newx = new Letter('Χ',8);
        remainingletters.add(newx);
        Letter newq = new Letter('Ζ',10);
        remainingletters.add(newq);
        Letter newz = new Letter('Θ',8);
        remainingletters.add(newz);
        Letter newΞ = new Letter('Ξ',10);
        remainingletters.add(newΞ);
        Letter newΨ = new Letter('Ψ',10);
        remainingletters.add(newΨ);
        remainingletters.add(newk);
        remainingletters.add(newj);
        remainingletters.add(newx);
        remainingletters.add(newq);
        remainingletters.add(newz);
        remainingletters.add(newΨ);
        remainingletters.add(newΞ);
        
        for(i=0;i<4;i++){
            Letter newl = new Letter('*',0);
            remainingletters.add(newl);
        }
        for(i=0;i<4;i++){
            Letter newl = new Letter('Γ',4);
            remainingletters.add(newl);
        }
        for(i=0;i<4;i++){
            Letter newl = new Letter('Δ',4);
            remainingletters.add(newl);
        }
        for(i=0;i<6;i++){
            Letter newl = new Letter('Λ',3);
            remainingletters.add(newl);
        }
        for(i=0;i<6;i++){
            Letter newl = new Letter('Μ',3);
            remainingletters.add(newl);
        }
        for(i=0;i<6;i++){
            Letter newl = new Letter('Ω',3);
            remainingletters.add(newl);
        }
        for(i=0;i<8;i++){
            Letter newl = new Letter('Κ',2);
            remainingletters.add(newl);
        }
        for(i=0;i<8;i++){
            Letter newl = new Letter('Π',2);
            remainingletters.add(newl);
        }
        for(i=0;i<8;i++){
            Letter newl = new Letter('Υ',2);
            remainingletters.add(newl);
        }
        for(i=0;i<10;i++){
            Letter newl = new Letter('Ρ',2);
            remainingletters.add(newl);
        }
        for(i=0;i<12;i++){
            Letter newl = new Letter('Ν',1);
            remainingletters.add(newl);
        }
        for(i=0;i<14;i++){
            Letter newl = new Letter('Η',1);
            remainingletters.add(newl);
        }
        for(i=0;i<14;i++){
            Letter newl = new Letter('Σ',1);
            remainingletters.add(newl);
        }
        for(i=0;i<16;i++){
            Letter newl = new Letter('Ε',1);
            remainingletters.add(newl);
        }
        for(i=0;i<16;i++){
            Letter newl = new Letter('Ι',1);
            remainingletters.add(newl);
        }
        for(i=0;i<16;i++){
            Letter newl = new Letter('Τ',1);
            remainingletters.add(newl);
        }
        for(i=0;i<18;i++){
            Letter newl = new Letter('Ο',1);
            remainingletters.add(newl);
        }
        for(i=0;i<24;i++){
            Letter newl = new Letter('Α',1);
            remainingletters.add(newl);
        }
       
    }
}
