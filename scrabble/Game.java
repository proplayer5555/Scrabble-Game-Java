/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package askisi2megali;
import java.util.Random;
import java.util.Scanner;
import static java.lang.System.out;
import java.util.ArrayList;

public class Game {
    boolean Tonica;
    boolean ellinika;
    bagoletters bag;
    Board board;
    int noofplayers;
    int passcount=0;
    boolean endgame=false;
    public ArrayList <simplehand> handlist = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    //ta minimata
    String b1="insert word";
    String b2="word invalid,try again";
    String b3="\"please insert coordinates\ninsert column(A,B,C...(english chars))\"";
    String b4="insert row(1,2...)";
    String b5="letter not compatible with board";
    String b6="word not touching with other letters";
    String b7="letters not in hand";
    String b8="Player Score: ";
    String b9="For the first time the word will be placed in the middle";
    String b10="you skipped your turn";
    String b11="new hand: ";
    String b12="the game has been finished, here are the scores: ";
    String b13="all letters used, score +50!!";
    String b14=" letters remaining";
  
    public Game(boolean Tonica,boolean ellinika,bagoletters bag,Board board,int noofplayers){
        this.ellinika=ellinika;
        this.bag=bag;
        this.board=board;
        this.noofplayers=noofplayers;
        if (Tonica){
          for(int i = 0;i<noofplayers;i++){
            simplehand hand = new simplehand();
            hand.size = bag.numofletters()/noofplayers;
            handlist.add(hand);
            }  
        }else{
            for(int i = 0;i<noofplayers;i++){
            simplehand hand = new simplehand();
            hand.size=7;
            handlist.add(hand);
            }
        }
       
    }
    Random rand = new Random();
    public void playgame(){//o kirios kodikas
        //Letter A = new Letter('k',1);
       // board.setIB(A, 8,8);
       if (ellinika){
           b1="εισαγωγη λέξης";
b2="μη έγκυρη λέξη, ξαναπροσπαθήστε";
b3="\"εισάγετε συντεταγμένες\nεισάγετε στήλη(A,B,C...(αγγλικοί χαρακτήρες))\"";
b4="εισάγετε σειρά(1,2...)";
b5="το γράμμα δεν είναι συμβατό με τον πίνακα";
b6="η λέξη δεν ακουμπάει με άλλα γράμματα του πίνακα";
b7="ανεπαρκή γράμματα στο χέρι";
b8="σκορ παίκτη: ";
b9="Στον πρώτο γύρο η λέξη πάντα τοποθετείται στο κέντρο";
b10="πέρασες την σειρά σου";
b11="καινούρια γράμματα: ";
b12="το παιχνίδι τλείωσε,αυτά είναι τα σκορ: ";
b13="χρησιμοποιήθηκαν όλα τα γράμματα! +50 ποντοι μπονους";
b14="γραμματα απομένουν";
       }
        for(int i=0;i<noofplayers;i++){//arxiko gemisma tou xeriou kathe paikth
            while (handlist.get(i).letterlist.size()<handlist.get(i).size && (bag.numofletters()!=0)){ //an sto tonika o arithmos ton grammatopn den diaireitai akribos me tous paixtes na min epaizes tonika 
               int o=rand.nextInt(bag.numofletters());
               Letter templ = bag.remainingletters.get(o);
               bag.remainingletters.remove(o);
               handlist.get(i).addletter(templ);
            }
        }
        for (int i=0;i<noofplayers;i++){
            out.println(handlist.get(i).toSring());
        }
        int player=0;
        //arxi paixnidiou
        //seira protou paikti opou oposdipote topotheti lekjsi sto kentro
                    if(ellinika){
                        out.println("σειρά παίκτη "+(1)+"\n"+board.getOB()+"\n"+handlist.get(0).letterlist+"\nΕπιλογές\n1 τοποθέτηση σε σειρά\n2/άλλο κατακόρυφη τοποθέτηση");
                        String P = input.next();
                        switch (P){
                        case "1":
                           placehorizontaly1st(0);
                            break;
                        default:
                            placevertically1st(0);
                            break;
                        }
                    }
                    else{
                        out.println("player "+(1)+" turn:\n"+board.getOB()+"\n"+handlist.get(0).letterlist+"\noptions\n1 place horizontally\n2/other place verticaly");
                        String P = input.next();
                        switch (P){
                            case "1":
                                placehorizontaly1st(0);
                                break;
                            default:
                                placevertically1st(0);
                                break;
                        }
                    }        
                
        player=1;
        for(player=1;player<noofplayers;player++){
                if (!Tonica){
                    if(ellinika){
                        out.println("σειρά παίκτη "+(player+1)+"\n"+board.getOB()+"\n"+handlist.get(player).letterlist+"\nΕπιλογές\n1 τοποθέτηση σε σειρά\n2 κατακόρυφη τοποθέτηση\n3 πάσο\n4/άλλο αλλαγή χεριού");
                        String P = input.next();
                        switch (P){
                        case "1":
                            placehorizontalyen(player);
                            break;
                        case "2":
                            placevertically(player);
                            break;
                        case "3":
                            pass(player);
                            break;
                        default:
                            changehand(player);
                            break;
                        }
                    }
                    else{
                        out.println("player "+(player+1)+" turn:\n"+board.getOB()+"\n"+handlist.get(player).letterlist+"\noptions\n1 place horizontally\n2 place verticaly\n3 pass\n4/Other Change letters");
                        String P = input.next();
                        switch (P){
                            case "1":
                                placehorizontalyen(player);
                                break;
                            case "2":
                                placevertically(player);
                                break;
                            case "3":
                                pass(player);
                                break;
                            default:
                                changehand(player);
                                break;
                        }
                    }        
                }
                else{
                        if(ellinika){
                            out.println("σειρά παίκτη "+(player+1)+"\n"+board.getOB()+"\n"+handlist.get(player).letterlist+"\nΕπιλογές\n1 τοποθέτηση σε σειρά\n2 κατακόρυφη τοποθέτηση\n3/άλλο πάσο");
                            String P = input.next();
                            switch (P){
                                case "1":
                                    placehorizontalyen(player);
                                    break;
                                case "2":
                                    placevertically(player);
                                    break;
                                default:
                                    pass(player);
                                    break;
                            }
                        }
                        else{
                                out.println("player"+(player+1)+"turn:\n"+board.getOB()+"\n"+handlist.get(player).letterlist+"\noptions\n1 place horizontally\n2 place verticaly\n3/Other pass");
                                String P = input.next();
                                switch (P){
                                    case "1":
                                        placehorizontalyen(player);
                                        break;
                                    case "2":
                                        placevertically(player);
                                        break;

                                    default:
                                        pass(player);
                                    break;       
                                }
                        }
                    }
            }
        while (!endgame){
            
            for(player=0;player<noofplayers;player++){
                if (!Tonica){
                    if(ellinika){
                        out.println("σειρά παίκτη "+(player+1)+"\n"+board.getOB()+"\n"+handlist.get(player).letterlist+"\nΕπιλογές\n1 τοποθέτηση σε σειρά\n2 κατακόρυφη τοποθέτηση\n3 πάσο\n4/άλλο αλλαγή χεριού");
                        String P = input.next();
                        switch (P){
                        case "1":
                            placehorizontalyen(player);
                            break;
                        case "2":
                            placevertically(player);
                            break;
                        case "3":
                            pass(player);
                            break;
                        default:
                            changehand(player);
                            break;
                        }
                    }
                    else{
                        out.println("player "+(player+1)+" turn:\n"+board.getOB()+"\n"+handlist.get(player).letterlist+"\noptions\n1 place horizontally\n2 place verticaly\n3 pass\n4/Other Change letters");
                        String P = input.next();
                        switch (P){
                            case "1":
                                placehorizontalyen(player);
                                break;
                            case "2":
                                placevertically(player);
                                break;
                            case "3":
                                pass(player);
                                break;
                            default:
                                changehand(player);
                                break;
                        }
                    }        
                }
                else{
                        if(ellinika){
                            out.println("σειρά παίκτη "+(player+1)+"\n"+board.getOB()+"\n"+handlist.get(player).letterlist+"\nΕπιλογές\n1 τοποθέτηση σε σειρά\n2 κατακόρυφη τοποθέτηση\n3/άλλο πάσο");
                            String P = input.next();
                            switch (P){
                                case "1":
                                    placehorizontalyen(player);
                                    break;
                                case "2":
                                    placevertically(player);
                                    break;
                                default:
                                    pass(player);
                                    break;
                            }
                        }
                        else{
                                out.println("player"+(player+1)+"turn:\n"+board.getOB()+"\n"+handlist.get(player).letterlist+"\noptions\n1 place horizontally\n2 place verticaly\n3/Other pass");
                                String P = input.next();
                                switch (P){
                                    case "1":
                                        placehorizontalyen(player);
                                        break;
                                    case "2":
                                        placevertically(player);
                                        break;

                                    default:
                                        pass(player);
                                    break;       
                                }
                        }
                    }
            }
        }
        out.println(b12);
        for(int i=0;i<handlist.size();i++){
            out.println((i+1)+": "+handlist.get(i).get_score());
        }
       
    }
    public void placehorizontalyen(int player){
       passcount=0;
       String s1;
       boolean stringcheck;
       boolean istouching;
       boolean STBcompatible;//string to board compatible
       boolean handcheck;
       int x=0;
       int y=0;
       ArrayList <Letter> toberemoved = new ArrayList<>();
       do{
           for(int i=0;i<toberemoved.size();i++){//adiasma tou arraylist ston arxi
               toberemoved.remove(i);
           }
           STBcompatible= false;
           handcheck=true;
           boolean inhand=false;
           istouching= false;
           stringcheck=true;
           out.println(b1);
           s1=input.next();
           ArrayList<Letter>a1=bag.stringtoletter(s1);
           if(a1.get(0).returnsymbol()== ' '){
               out.println(b2);
               stringcheck=false;
           }else{
              out.println(b3);
              x =((int) input.next().charAt(0))-64;
              out.println(b4);
              y = input.nextInt();
                for(int i=0;i<s1.length();i++){
                  if ((board.getIB()[y-1][x+i-1].returnsymbol()==' ')||(board.getIB()[y-1][x+i-1].returnsymbol()==s1.charAt(i))){ //an to gramma antistoixei pano se keno i se idio gramma tou esoterikou pinaka
                      STBcompatible=true;
                      if (board.getIB()[y-1][x+i-1].returnsymbol()==' '){
                         a1.get(i).setxpos(x+i);
                         a1.get(i).setypos(y);
                         toberemoved.add(a1.get(i));  
                      }
                          //an to gramma antistixi pano se keno ston esoteriko pinaka
                       
                      if (board.getIB()[y-1][x+i-1].returnsymbol()==s1.charAt(i)) //an to gramma antistoixi se idio gramma pano ston esoteriko pinaka
                        istouching=true;
                  }else{
                      STBcompatible=false; 
                      out.println(b5);
                  }
                      
                }
                if(!istouching)
                    out.println(b6);
                //elegxos an iparxoun arketa grammata sto xeri. Dimiourgeitai ena antigrafo arrayl;ist tou heriou tou paixti gia ton elegxo 
             ArrayList<Letter> handcopy = handlist.get(player).letterlist;
             for(int i=0;i<toberemoved.size();i++){
                for(int j=0;j<handcopy.size();j++){
                     if(toberemoved.get(i).returnsymbol()==handcopy.get(j).returnsymbol()){
                          handcopy.remove(j);
                          inhand=true;
                     }
                }
                if (!inhand){
                      out.println(b7);
                      handcheck=false;
                 }
                
             }
             
               
               
               
           }
       }while((!stringcheck)||(!istouching)||(!STBcompatible)||(!handcheck));
       
       //ipologismos score me basi toberemoved
       int multiplier=1;
       int hscore=0;
       for(int i=0;i<toberemoved.size();i++){
           switch(board.getOB().charAt(board.innertoouter(toberemoved.get(i).getypos(),toberemoved.get(i).getxpos()))){   
               case '2':
                   hscore+=(toberemoved.get(i).getvalue())*2;
                   break;
               case '3':
                   hscore+=(toberemoved.get(i).getvalue())*3;
                   break;
               case '4':
                   hscore+=(toberemoved.get(i).getvalue())*4;
                   break;
               case 'd':
                   multiplier=2;
                   hscore+=toberemoved.get(i).getvalue();
                   break;
               case 't':
                   multiplier=3;
                   hscore+=toberemoved.get(i).getvalue();
                   break;
               case 'q':
                   multiplier=4;
                   hscore+=toberemoved.get(i).getvalue();
                   break;
               default:
                   hscore+=toberemoved.get(i).getvalue();
                   break;
           }
       }
       handlist.get(player).addscore(multiplier*hscore);
       if(handlist.get(player).letterlist.isEmpty()){
             handlist.get(player).addscore(50);
             out.println(b13);
       }
         
       
       //teliki diorthosi tou pinakaaaaa
       ArrayList<Letter>a1=bag.stringtoletter(s1);//ksanaftiaxnoume tin a1 epeidi eixe dimiourgithi mesa sto do while
       for(int i=0;i<a1.size();i++){
           board.setIB(a1.get(i),x+i,y);
           board.setOB(a1.get(i).returnsymbol(),board.innertoouter(x+i,y));
           
       }
       if (!Tonica){
       out.println(b8+handlist.get(player).get_score()); //ksanagemisma tis sakkoulas
       while (handlist.get(player).letterlist.size()<handlist.get(player).size && (bag.numofletters()!=0)){ //an sto tonika o arithmos ton grammatopn den diaireitai akribos me tous paixtes na min epaizes tonika 
               int o=rand.nextInt(bag.numofletters());
               Letter templ = bag.remainingletters.get(o);
               bag.remainingletters.remove(o);
               handlist.get(player).addletter(templ);
            }
       out.println(bag.remainingletters.size()+b14);
       }
       if (Tonica){
           if(handlist.get(player).letterlist.isEmpty()){
               endgame=true;
           }
       }else{
           if ((handlist.get(player).letterlist.isEmpty())&&bag.remainingletters.isEmpty())
               endgame=true;
       }
       
    }
    public void placehorizontaly1st(int player){
       out.println(b9);
       passcount=0;
       String s1;
       boolean stringcheck;
       boolean istouching;
       boolean STBcompatible;//string to board compatible
       boolean handcheck;
       int x=(board.getigrammes()/2)+1;
       int y=0;
       ArrayList <Letter> toberemoved = new ArrayList<>();
       do{
           for(int i=0;i<toberemoved.size();i++){//adiasma tou arraylist ston arxi
               toberemoved.remove(i);
           }
           STBcompatible= false;
           handcheck=true;
           boolean inhand=false;
           istouching= false;
           stringcheck=true;
           out.println(b1);
           s1=input.next();
           ArrayList<Letter>a1=this.stringtoletterP(s1);
           if(a1.get(0).returnsymbol()== ' '){
               out.println(b2);
               stringcheck=false;
           }else{
              x =(board.getigrammes()/2)+1;
              y =(board.getisthlles()/2)+1;
                for(int i=0;i<s1.length();i++){
                  if (board.getIB()[y-1][x+i-1].returnsymbol()==' '){ //an to gramma antistoixei pano se keno i se idio gramma tou esoterikou pinaka
                      STBcompatible=true;
                      if (board.getIB()[y-1][x+i-1].returnsymbol()==' '){
                         a1.get(i).setxpos(x+i);
                         a1.get(i).setypos(y);
                         toberemoved.add(a1.get(i));  
                      }
                          //an to gramma antistixi pano se keno ston esoteriko pinaka
                       

                   }
                }

                //elegxos an iparxoun arketa grammata sto xeri. Dimiourgeitai ena antigrafo arrayl;ist tou heriou tou paixti gia ton elegxo 
             ArrayList<Letter> handcopy = handlist.get(player).letterlist;
             for(int i=0;i<toberemoved.size();i++){
                for(int j=0;j<handcopy.size();j++){
                     if(toberemoved.get(i).returnsymbol()==handcopy.get(j).returnsymbol()){
                          handcopy.remove(j);
                          inhand=true;
                     }
                }
                if (!inhand){
                      out.println(b7);
                      handcheck=false;
                 }
                
             }
             
               
               
               
           }
       }while((!stringcheck)||(!STBcompatible)||(!handcheck));
       
       //ipologismos score me basi toberemoved
       int multiplier=1;
       int hscore=0;
       for(int i=0;i<toberemoved.size();i++){
           switch(board.getOB().charAt(board.innertoouter(toberemoved.get(i).getypos(),toberemoved.get(i).getxpos()))){   
               case '2':
                   hscore+=(toberemoved.get(i).getvalue())*2;
                   break;
               case '3':
                   hscore+=(toberemoved.get(i).getvalue())*3;
                   break;
               case '4':
                   hscore+=(toberemoved.get(i).getvalue())*4;
                   break;
               case 'd':
                   multiplier=2;
                   hscore+=toberemoved.get(i).getvalue();
                   break;
               case 't':
                   multiplier=3;
                   hscore+=toberemoved.get(i).getvalue();
                   break;
               case 'q':
                   multiplier=4;
                   hscore+=toberemoved.get(i).getvalue();
                   break;
               default:
                   hscore+=toberemoved.get(i).getvalue();
                   break;
           }
       }
       handlist.get(player).addscore(multiplier*hscore);
       if(handlist.get(player).letterlist.isEmpty()){
             handlist.get(player).addscore(50);
             out.println(b13);
       }
       //teliki diorthosi tou pinakaaaaa
       ArrayList<Letter>a1=bag.stringtoletter(s1);//ksanaftiaxnoume tin a1 epeidi eixe dimiourgithi mesa sto do while
       for(int i=0;i<a1.size();i++){
           board.setIB(a1.get(i),x+i,y);
           board.setOB(a1.get(i).returnsymbol(),board.innertoouter(x+i,y));
           
       }
       if (!Tonica){
       out.println(b8+handlist.get(player).get_score()); //ksanagemisma tis sakkoulas
       while (handlist.get(player).letterlist.size()<handlist.get(player).size && (bag.numofletters()!=0)){ //an sto tonika o arithmos ton grammatopn den diaireitai akribos me tous paixtes na min epaizes tonika 
               int o=rand.nextInt(bag.numofletters());
               Letter templ = bag.remainingletters.get(o);
               bag.remainingletters.remove(o);
               handlist.get(player).addletter(templ);
            }
       out.println(bag.remainingletters.size()+b14);
       }
       if (Tonica){
           if(handlist.get(player).letterlist.isEmpty()){
               endgame=true;
           }
       }else{
           if ((handlist.get(player).letterlist.isEmpty())&&bag.remainingletters.isEmpty())
               endgame=true;
       }
       
    }
    public void placevertically(int player){
       passcount=0;
       String s1;
       boolean stringcheck;
       boolean istouching;
       boolean STBcompatible;//string to board compatible
       boolean handcheck;
       int x=0;
       int y=0;
       ArrayList <Letter> toberemoved = new ArrayList<>();
       do{
           for(int i=0;i<toberemoved.size();i++){//adiasma tou arraylist ston arxi
               toberemoved.remove(i);
           }
           STBcompatible= false;
           handcheck=true;
           boolean inhand=false;
           istouching= false;
           stringcheck=true;
           out.println(b1);
           s1=input.next();
           ArrayList<Letter>a1=bag.stringtoletter(s1);
           if(a1.get(0).returnsymbol()== ' '){
               out.println(b2);
               stringcheck=false;
           }else{
              out.println(b3);
              x =((int) input.next().charAt(0))-64;
              out.println(b4);
              y = input.nextInt();
                for(int i=0;i<s1.length();i++){
                  if ((board.getIB()[y+i-1][x-1].returnsymbol()==' ')||(board.getIB()[y+i-1][x-1].returnsymbol()==s1.charAt(i))){ //an to gramma antistoixei pano se keno i se idio gramma tou esoterikou pinaka
                      STBcompatible=true;
                      if (board.getIB()[y+i-1][x-1].returnsymbol()==' '){
                         a1.get(i).setxpos(x);
                         a1.get(i).setypos(y+i);
                         toberemoved.add(a1.get(i));  
                      }
                          //an to gramma antistixi pano se keno ston esoteriko pinaka
                       
                      if (board.getIB()[y+i-1][x-1].returnsymbol()==s1.charAt(i)) //an to gramma antistoixi se idio gramma pano ston esoteriko pinaka
                        istouching=true;
                  }else{
                      STBcompatible=false; 
                      out.println(b5);
                  }
                      
                }
                if(!istouching)
                    out.println(b6);
                //elegxos an iparxoun arketa grammata sto xeri. Dimiourgeitai ena antigrafo arrayl;ist tou heriou tou paixti gia ton elegxo 
             ArrayList<Letter> handcopy = handlist.get(player).letterlist;
             for(int i=0;i<toberemoved.size();i++){
                for(int j=0;j<handcopy.size();j++){
                     if(toberemoved.get(i).returnsymbol()==handcopy.get(j).returnsymbol()){
                          handcopy.remove(j);
                          inhand=true;
                     }
                }
                if (!inhand){
                      out.println(b7);
                      handcheck=false;
                 }
                
             }
             
               
               
               
           }
       }while((!stringcheck)||(!istouching)||(!STBcompatible)||(!handcheck));
       
       //ipologismos score me basi toberemoved
       int multiplier=1;
       int hscore=0;
       for(int i=0;i<toberemoved.size();i++){
           switch(board.getOB().charAt(board.innertoouter(toberemoved.get(i).getypos(),toberemoved.get(i).getxpos()))){   
               case '2':
                   hscore+=(toberemoved.get(i).getvalue())*2;
                   break;
               case '3':
                   hscore+=(toberemoved.get(i).getvalue())*3;
                   break;
               case '4':
                   hscore+=(toberemoved.get(i).getvalue())*4;
                   break;
               case 'd':
                   multiplier=2;
                   hscore+=toberemoved.get(i).getvalue();
                   break;
               case 't':
                   multiplier=3;
                   hscore+=toberemoved.get(i).getvalue();
                   break;
               case 'q':
                   multiplier=4;
                   hscore+=toberemoved.get(i).getvalue();
                   break;
               default:
                   hscore+=toberemoved.get(i).getvalue();
                   break;
           }    
       }
       handlist.get(player).addscore(multiplier*hscore);
       if(handlist.get(player).letterlist.isEmpty()){
             handlist.get(player).addscore(50);
             out.println(b13);
       }
       //teliki diorthosi tou pinakaaaaa
       ArrayList<Letter>a1=bag.stringtoletter(s1);//ksanaftiaxnoume tin a1 epeidi eixe dimiourgithi mesa sto do while
       for(int i=0;i<a1.size();i++){
           board.setIB(a1.get(i),x,y+i);
           board.setOB(a1.get(i).returnsymbol(),board.innertoouter(x,y+i));
           
       }
       if (!Tonica){
       out.println(b8+handlist.get(player).get_score()); //ksanagemisma tis sakkoulas
       while (handlist.get(player).letterlist.size()<handlist.get(player).size && (bag.numofletters()!=0)){ //an sto tonika o arithmos ton grammatopn den diaireitai akribos me tous paixtes na min epaizes tonika 
               int o=rand.nextInt(bag.numofletters());
               Letter templ = bag.remainingletters.get(o);
               bag.remainingletters.remove(o);
               handlist.get(player).addletter(templ);
            }
       out.println(bag.remainingletters.size()+b14);
       }
       if (Tonica){
           if(handlist.get(player).letterlist.isEmpty()){
               endgame=true;
           }
       }else{
           if ((handlist.get(player).letterlist.isEmpty())&&bag.remainingletters.isEmpty())
               endgame=true;
       }
       
    }
    public void placevertically1st(int player){
       out.println(b9);
       passcount=0;
       String s1;
       boolean stringcheck;
       boolean istouching;
       boolean STBcompatible;//string to board compatible
       boolean handcheck;
       int x=(board.getigrammes()/2)+1;
       int y=0;
       ArrayList <Letter> toberemoved = new ArrayList<>();
       do{
           for(int i=0;i<toberemoved.size();i++){//adiasma tou arraylist ston arxi
               toberemoved.remove(i);
           }
           STBcompatible= false;
           handcheck=true;
           boolean inhand=false;
           istouching= false;
           stringcheck=true;
           out.println(b1);
           s1=input.next();
           ArrayList<Letter>a1=bag.stringtoletter(s1);
           if(a1.get(0).returnsymbol()== ' '){
               out.println(b2);
               stringcheck=false;
           }else{
              
              x =(board.getigrammes()/2)+1;
              y =(board.getisthlles()/2)+1;
                for(int i=0;i<s1.length();i++){
                  if ((board.getIB()[y+i-1][x-1].returnsymbol()==' ')||(board.getIB()[y+i-1][x-1].returnsymbol()==s1.charAt(i))){ //an to gramma antistoixei pano se keno i se idio gramma tou esoterikou pinaka
                      STBcompatible=true;
                      if (board.getIB()[y-1][x+i-1].returnsymbol()==' '){
                         a1.get(i).setxpos(x+i);
                         a1.get(i).setypos(y);
                         toberemoved.add(a1.get(i));  
                      }
                          //an to gramma antistixi pano se keno ston esoteriko pinaka
                       

                   }
                }
                if(!istouching)
                    out.println(b6);
                //elegxos an iparxoun arketa grammata sto xeri. Dimiourgeitai ena antigrafo arrayl;ist tou heriou tou paixti gia ton elegxo 
             ArrayList<Letter> handcopy = handlist.get(player).letterlist;
             for(int i=0;i<toberemoved.size();i++){
                for(int j=0;j<handcopy.size();j++){
                     if(toberemoved.get(i).returnsymbol()==handcopy.get(j).returnsymbol()){
                          handcopy.remove(j);
                          inhand=true;
                     }
                }
                if (!inhand){
                      out.println(b7);
                      handcheck=false;
                 }
                
             }
             
               
               
               
           }
       }while((!stringcheck)||(!STBcompatible)||(!handcheck));
       
       //ipologismos score me basi toberemoved
       int multiplier=1;
       int hscore=0;
       for(int i=0;i<toberemoved.size();i++){
           switch(board.getOB().charAt(board.innertoouter(toberemoved.get(i).getypos(),toberemoved.get(i).getxpos()))){   
               case '2':
                   hscore+=(toberemoved.get(i).getvalue())*2;
                   break;
               case '3':
                   hscore+=(toberemoved.get(i).getvalue())*3;
                   break;
               case '4':
                   hscore+=(toberemoved.get(i).getvalue())*4;
                   break;
               case 'd':
                   multiplier=2;
                   hscore+=toberemoved.get(i).getvalue();
                   break;
               case 't':
                   multiplier=3;
                   hscore+=toberemoved.get(i).getvalue();
                   break;
               case 'q':
                   multiplier=4;
                   hscore+=toberemoved.get(i).getvalue();
                   break;
               default:
                   hscore+=toberemoved.get(i).getvalue();
                   break;
           }
       }
       handlist.get(player).addscore(multiplier*hscore);
       if(handlist.get(player).letterlist.isEmpty()){
             handlist.get(player).addscore(50);
             out.println(b13);
       }
       //teliki diorthosi tou pinakaaaaa
       ArrayList<Letter>a1=bag.stringtoletter(s1);//ksanaftiaxnoume tin a1 epeidi eixe dimiourgithi mesa sto do while
       for(int i=0;i<a1.size();i++){
           board.setIB(a1.get(i),x,y+i);
           board.setOB(a1.get(i).returnsymbol(),board.innertoouter(x,y+i));
           
       }
       if (!Tonica){
       out.println(b8+handlist.get(player).get_score()); //ksanagemisma tis sakkoulas
       while (handlist.get(player).letterlist.size()<handlist.get(player).size && (bag.numofletters()!=0)){ //an sto tonika o arithmos ton grammatopn den diaireitai akribos me tous paixtes na min epaizes tonika 
               int o=rand.nextInt(bag.numofletters());
               Letter templ = bag.remainingletters.get(o);
               bag.remainingletters.remove(o);
               handlist.get(player).addletter(templ);
            }
       out.println(bag.remainingletters.size()+b14);
       }
       if (Tonica){
           if(handlist.get(player).letterlist.isEmpty()){
               endgame=true;
           }
       }else{
           if ((handlist.get(player).letterlist.isEmpty())&&bag.remainingletters.isEmpty())
               endgame=true;
       }
       
    }
    public void pass(int player){
        out.println(b10);
        passcount+=1;
        if(passcount==handlist.size())
            endgame=true;
    }
    public void changehand (int player){
        passcount=0;
        for(int i=0;i<handlist.get(player).letterlist.size();i++){
            handlist.get(player).letterlist.remove(i);
        }
        while (handlist.get(player).letterlist.size()<handlist.get(player).size && (bag.numofletters()!=0)){ //an sto tonika o arithmos ton grammatopn den diaireitai akribos me tous paixtes na min epaizes tonika 
               int o=rand.nextInt(bag.numofletters());
               Letter templ = bag.remainingletters.get(o);
               bag.remainingletters.remove(o);
               handlist.get(player).addletter(templ);
        }
        out.println(b11+ handlist.get(player).letterlist.toString());
        out.println(bag.remainingletters.size()+b14);
        if((handlist.get(player).letterlist.size()<handlist.get(player).size)&&(bag.numofletters()==0))
            endgame=true;
        
    }
    public ArrayList stringtoletterP(String g){
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
                   // case 'Α':
                    case 'Ο':
                    case 'Ε':
                    case 'Ι':
                    case 'Τ':
                    case 'Η':
                    case 'Σ':
                    case 'Ν':a.setletter(g.charAt(i),1);
                                break;
                    case 'Α':a.setletter(g.charAt(i), 1);
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


