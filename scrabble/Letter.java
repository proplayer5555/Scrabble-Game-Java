/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package askisi2megali;

/**
 *
 * @author gsers
 */
public class Letter {
    private char symbol;
    private int value;
    private int xpos;
    private int ypos;
    public Letter(char symbol,int value){
        this.symbol=symbol;
        this.value=value;
    }
    @Override
    public String toString(){
        return ""+symbol+value;
    }
    public char returnsymbol(){
        return symbol;
    }
    public void setletter(char symbol,int value){
        this.symbol=symbol;
        this.value=value;
    }
    public int getxpos(){
        return this.xpos;
    }
    public void setxpos(int x){
        xpos=x;
    }
    public int getypos(){
        return this.ypos;
    }
    public void setypos(int x){
        ypos=x;
    }
    public int getvalue(){
        return this.value;
    }
}
