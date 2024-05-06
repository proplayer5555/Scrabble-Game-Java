/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package askisi2megali;

/**
 *
 * @author gsers DOUBLE SCRABBLE ENGLISH BAG
 */
public class DSenbag extends bagoletters{
    public DSenbag(){
        super();
        int i;
        Letter newk = new Letter('K',5);
        remainingletters.add(newk);
        Letter newj = new Letter('J',8);
        remainingletters.add(newj);
        Letter newx = new Letter('X',8);
        remainingletters.add(newx);
        Letter newq = new Letter('Q',10);
        remainingletters.add(newq);
        Letter newz = new Letter('Z',8);
        remainingletters.add(newz);
        remainingletters.add(newk);
        remainingletters.add(newj);
        remainingletters.add(newx);
        remainingletters.add(newq);
        remainingletters.add(newz);
        
        for(i=0;i<4;i++){
            Letter newl = new Letter('*',0);
            remainingletters.add(newl);
        }
        for(i=0;i<4;i++){
            Letter newl = new Letter('B',3);
            remainingletters.add(newl);
        }
        for(i=0;i<4;i++){
            Letter newl = new Letter('C',3);
            remainingletters.add(newl);
        }
        for(i=0;i<4;i++){
            Letter newl = new Letter('M',3);
            remainingletters.add(newl);
        }
        for(i=0;i<4;i++){
            Letter newl = new Letter('P',3);
            remainingletters.add(newl);
        }
        for(i=0;i<4;i++){
            Letter newl = new Letter('F',4);
            remainingletters.add(newl);
        }
        for(i=0;i<4;i++){
            Letter newl = new Letter('H',4);
            remainingletters.add(newl);
        }
        for(i=0;i<4;i++){
            Letter newl = new Letter('V',4);
            remainingletters.add(newl);
        }
        for(i=0;i<4;i++){
            Letter newl = new Letter('W',4);
            remainingletters.add(newl);
        }
        for(i=0;i<4;i++){
            Letter newl = new Letter('Y',4);
            remainingletters.add(newl);
        }
        for(i=0;i<6;i++){
            Letter newl = new Letter('G',2);
            remainingletters.add(newl);
        }
        for(i=0;i<8;i++){
            Letter newl = new Letter('U',1);
            remainingletters.add(newl);
        }
        for(i=0;i<8;i++){
            Letter newl = new Letter('S',1);
            remainingletters.add(newl);
        }
        for(i=0;i<8;i++){
            Letter newl = new Letter('L',1);
            remainingletters.add(newl);
        }
        for(i=0;i<8;i++){
            Letter newl = new Letter('D',2);
            remainingletters.add(newl);
        }
        for(i=0;i<12;i++){
            Letter newl = new Letter('N',1);
            remainingletters.add(newl);
        }
        for(i=0;i<12;i++){
            Letter newl = new Letter('R',1);
            remainingletters.add(newl);
        }
        for(i=0;i<12;i++){
            Letter newl = new Letter('T',1);
            remainingletters.add(newl);
        }
        for(i=0;i<16;i++){
            Letter newl = new Letter('O',1);
            remainingletters.add(newl);
        }
        for(i=0;i<18;i++){
            Letter newl = new Letter('A',1);
            remainingletters.add(newl);
        }
        for(i=0;i<18;i++){
            Letter newl = new Letter('I',1);
            remainingletters.add(newl);
        }
        for(i=0;i<24;i++){
            Letter newl = new Letter('E',1);
            remainingletters.add(newl);
        }
    }
}
